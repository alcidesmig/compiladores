package br.ufscar.dc.compiladores.lexico;

import br.ufscar.dc.compiladores.lexico.PiaLexer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ConsoleErrorListener;

public class Principal {

    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        PiaLexer lex = new PiaLexer(cs);

        Token token = null;

        FileWriter f = new FileWriter(new File(args[1]));

        while ((token = lex.nextToken()).getType() != Token.EOF) {
            String symbolicName = PiaLexer.VOCABULARY.getSymbolicName(token.getType());
            if (symbolicName.equals("RESERVED") || symbolicName.equals("OPERATORS")) {
                f.write("<'" + token.getText() + "','" + token.getText() + "'>\n");
            } else if (symbolicName.equals("NUM_INT") || symbolicName.equals("NUM_REAL") || symbolicName.equals("CADEIA") || symbolicName.equals("IDENT")) {
                f.write("<'" + token.getText() + "'," + PiaLexer.VOCABULARY.getSymbolicName(token.getType()) + ">\n");
            } else if (symbolicName.equals("WRONG_CADEIA")) {
                // Erro cadeia
                f.write(String.format("Linha %d: cadeia literal nao fechada\n", token.getLine()));
                break;
            } else if (symbolicName.equals("WRONG_COMMENT")) {
                // Erro Comentário
                f.write(String.format("Linha %d: comentario nao fechado\n", token.getLine()));
                break;
            } else if (symbolicName.equals("WRONG_SYMBOL")) {
                // Erro Simbolo
                f.write(String.format("Linha %d: %s - simbolo nao identificado\n", token.getLine(), token.getText()));
                break;
            }
        }
        f.close();
    }
}
