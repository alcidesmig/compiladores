package br.ufscar.dc.compiladores.lexico;

import br.ufscar.dc.compiladores.lexico.PiaLexer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    static CharStream cs;
    static PiaLexer lex;
    static FileWriter f;

    public static void main(String args[]) throws IOException {
        // Inicia o filewriter para escrever o output no arquivo passado como parâmetro
        f = new FileWriter(new File(args[1]));
        // CharStreams do arquivo de entrada passado como parâmetro
        cs = CharStreams.fromFileName(args[0]);
        // Instancia o Lexer gerado pelo ANTLR
        lex = new PiaLexer(cs);

        Token token = null;

        // Enquanto existir um token que não for o de EOF (fim de arquivo),
        // classifique-o e escreva o output no arquivo de saída
        while ((token = lex.nextToken()).getType() != Token.EOF) {
            // Faz o map do índice do símbolo para o seu nome
            String symbolicName = PiaLexer.VOCABULARY.getSymbolicName(token.getType());
            
            // Classificação:
            
            // caso for um operador ou palavra reservada
            if (symbolicName.equals("RESERVED") || symbolicName.equals("OPERATORS")) {
                f.write("<'" + token.getText() + "','" + token.getText() + "'>\n");
            } 
            // caso for um número, identificador ou cadeia de caractéres
            else if (symbolicName.equals("NUM_INT") || symbolicName.equals("NUM_REAL") || symbolicName.equals("CADEIA") || symbolicName.equals("IDENT")) {
                f.write("<'" + token.getText() + "'," + PiaLexer.VOCABULARY.getSymbolicName(token.getType()) + ">\n");
            } 
            // caso seja uma cadeia de caractéres não fechada (cadeia inválida)
            else if (symbolicName.equals("WRONG_CADEIA")) {
                // Erro cadeia
                f.write(String.format("Linha %d: cadeia literal nao fechada\n", token.getLine()));
                break;
            } 
            // caso seja um comentário inválido (não fechado, com "{" ou "}" dentro, etc...
            else if (symbolicName.equals("WRONG_COMMENT")) {
                // Erro Comentário
                f.write(String.format("Linha %d: comentario nao fechado\n", token.getLine()));
                break;
            } 
            // caso não seja classificado em nenhuma das outras regras
            else if (symbolicName.equals("WRONG_SYMBOL")) {
                // Erro Simbolo
                f.write(String.format("Linha %d: %s - simbolo nao identificado\n", token.getLine(), token.getText()));
                break;
            }
        }
        
        // Fecha o arquivo de output
        f.close();
    }
}
