package br.ufscar.dc.compiladores.semantico;

import br.ufscar.dc.compiladores.semantico.PiaParser.ProgramaContext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {

    static CharStream cs;
    static PiaLexer lex;
    static FileWriter f;
    static CommonTokenStream tokens;
    static PrintWriter pw;

    public static void main(String args[]) throws IOException {
        // Inicia o PrintWriter para escrever o output no arquivo passado como parâmetro
        // CharStreams do arquivo de entrada passado como parâmetro
        pw = new PrintWriter(new File(args[1]));

        // Executa lexer e, se tudo estiver correto na parte léxica, executa o parser sintático
        lexer(args[0]);
        parser(args[0]);
        cs = CharStreams.fromFileName(args[0]);
        PiaLexer lexer = new PiaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PiaParser parser = new PiaParser(tokens);
        ProgramaContext arvore = parser.programa();
        SemanticoVisitor as = new SemanticoVisitor();
        as.visitPrograma(arvore);
        SemanticoUtils.errosSemanticos.forEach((s) -> pw.write(s + "\n"));
        pw.write("Fim da compilacao\n");
//            if (SemanticoUtils.errosSemanticos.isEmpty()) {
        //                AlgumaGeradorC agc = new AlgumaGeradorC();;
        //                agc.visitPrograma(arvore);
        //                try (PrintWriter pw = new PrintWriter(args[1])) {
        //                    pw.print(agc.saida.toString());
        //                }
        //            }
        //        }
        // Fecha arquivo de output
        pw.close();

    }

    static void parser(String file) throws IOException {
        // Inicia o CharStream novamente
        cs = CharStreams.fromFileName(file);
        // Instancia o Lexer gerado pelo ANTLR
        lex = new PiaLexer(cs);
        // Cria o CommonTokenStream
        tokens = new CommonTokenStream(lex);
        // Instancia o Parser gerado pelo ANTLR
        PiaParser parser = new PiaParser(tokens);
        // Instancia o error listener
        ErrorListener mcel = new ErrorListener(pw);
        // Remove o error listener default
        parser.removeErrorListeners();
        // Attach do error listener no parser
        parser.addErrorListener(mcel);
        // Execute o parser (sintático)
        try {
            parser.programa();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    static boolean lexer(String file) throws IOException {
        cs = CharStreams.fromFileName(file);
        // Instancia o Lexer gerado pelo ANTLR
        lex = new PiaLexer(cs);
        tokens = new CommonTokenStream(lex);

        Token token;
        boolean error = false;

        OUTER:
        while ((token = lex.nextToken()).getType() != Token.EOF) {
            System.out.println(token.getText());
            String symbolicName = PiaLexer.VOCABULARY.getSymbolicName(token.getType());
            if (symbolicName == null) {
                continue;
            }
            switch (symbolicName) {
                case "WRONG_CADEIA":
                    // Erro cadeia
                    pw.write(String.format("Linha %d: cadeia literal nao fechada\n", token.getLine()));
                    error = true;
                    break OUTER;
                // caso não seja classificado em nenhuma das outras regras
                case "WRONG_COMMENT":
                    // Erro comentário
                    pw.write(String.format("Linha %d: comentario nao fechado\n", token.getLine()));
                    error = true;
                    break OUTER;
                case "WRONG_SYMBOL":
                    // Erro simbolo
                    pw.write(String.format("Linha %d: %s - simbolo nao identificado\n", token.getLine(), token.getText()));
                    error = true;
                    break OUTER;
                default:
                    break;
            }
        }
        if (error) {
            return false;
        }
        return true;
    }
}
