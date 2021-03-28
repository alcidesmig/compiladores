/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.builder;

import br.ufscar.dc.compiladores.builder.TabelaDeSimbolos.TipoVariavel;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class SemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();
    public static StringBuilder codigoGerado = new StringBuilder();

    public static void adicionarCodigo(String codigo) {
        codigoGerado.append(codigo + "\n");
    }
    
    public static void adicionarCodigoSemBreakLine(String codigo) {
        codigoGerado.append(codigo);
    }

    public static void adicionarCodigo(int quantidadeTabulacao, String codigo) {
        for (int i = 0; i < quantidadeTabulacao; i++) {
            codigoGerado.append("\t");
        }
        codigoGerado.append(codigo + "\n");
    }

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static TabelaDeSimbolos.TipoVariavel verificarTipo(String strTipoVar, boolean isPointer) {
        TabelaDeSimbolos.TipoVariavel tipoVar = TipoVariavel.INVALIDO;
        switch (strTipoVar) {
            case "literal":
                if (isPointer) {
                    tipoVar = TipoVariavel.PONTEIRO_LITERAL;
                } else {
                    tipoVar = TipoVariavel.LITERAL;
                }
                break;
            case "inteiro":
                if (isPointer) {
                    tipoVar = TipoVariavel.PONTEIRO_INTEIRO;
                } else {
                    tipoVar = TipoVariavel.INTEIRO;
                }
                break;
            case "real":
                if (isPointer) {
                    tipoVar = TipoVariavel.PONTEIRO_REAL;
                } else {
                    tipoVar = TipoVariavel.REAL;
                }
                break;
            case "logico":
                if (isPointer) {
                    tipoVar = TipoVariavel.PONTEIRO_LOGICO;
                } else {
                    tipoVar = TipoVariavel.LOGICO;
                }
                break;
            default:
                break;
        }
        return tipoVar;
    }

}
//
//    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, PiaParser.ExpressaoAritmeticaContext ctx) {
//        TabelaDeSimbolos.TipoLA ret = null;
//        for (var ta : ctx.termoAritmetico()) {
//            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, ta);
//            if (ret == null) {
//                ret = aux;
//            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
//                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
//                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
//            }
//        }
//
//        return ret;
//    }
//
//    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, PiaParser.TermoAritmeticoContext ctx) {
//        TabelaDeSimbolos.TipoLA ret = null;
//
//        for (var fa : ctx.fatorAritmetico()) {
//            TabelaDeSimbolos.TipoLA aux = verificarTipo(tabela, fa);
//            if (ret == null) {
//                ret = aux;
//            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLA.INVALIDO) {
//                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
//                ret = TabelaDeSimbolos.TipoLA.INVALIDO;
//            }
//        }
//        return ret;
//    }
//
//    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, PiaParser.FatorAritmeticoContext ctx) {
//        if (ctx.NUMINT() != null) {
//            return TabelaDeSimbolos.TipoLA.INTEIRO;
//        }
//        if (ctx.NUMREAL() != null) {
//            return TabelaDeSimbolos.TipoLA.REAL;
//        }
//        if (ctx.VARIAVEL() != null) {
//            String nomeVar = ctx.VARIAVEL().getText();
//            if (!tabela.existe(nomeVar)) {
//                adicionarErroSemantico(ctx.VARIAVEL().getSymbol(), "Variável " + nomeVar + " não foi declarada antes do uso");
//                return TabelaDeSimbolos.TipoLA.INVALIDO;
//            }
//            return verificarTipo(tabela, nomeVar);
//        }
//        // se não for nenhum dos tipos acima, só pode ser uma expressão
//        // entre parêntesis
//        return verificarTipo(tabela, ctx.expressaoAritmetica());;
//    }
//
//    public static TabelaDeSimbolos.TipoLA verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
//        return tabela.verificar(nomeVar);
//    }
//}
