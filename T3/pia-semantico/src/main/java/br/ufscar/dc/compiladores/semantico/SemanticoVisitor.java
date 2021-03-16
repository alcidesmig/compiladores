/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.semantico;

import br.ufscar.dc.compiladores.semantico.TabelaDeSimbolos.TipoEntradaTds;
import br.ufscar.dc.compiladores.semantico.TabelaDeSimbolos.TipoVariavel;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author alcides
 */
public class SemanticoVisitor extends PiaBaseVisitor<Void> {

    Escopos escoposAninhados = new Escopos();
    String declaracaoAtual;
    TipoVariavel tipoEsperadoDeclarracaoAtual;

    @Override
    public Void visitPrograma(PiaParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(PiaParser.Declaracao_localContext ctx) {
        visitVariavel(ctx.variavel());
        if (ctx.IDENT() != null) {
            if (ctx.tipo_basico() != null) { // 'constante' IDENT ':' tipo_basico '=' valor_constante
                TipoVariavel tipoVar = SemanticoUtils.verificarTipo(ctx.tipo_basico().getText());
                doUpdateTable(ctx.IDENT().getText(), TipoEntradaTds.VARIAVEL, tipoVar, ctx.tipo_basico().getStart());
            } else { //  'tipo' IDENT ':' tipo;
                String ident = ctx.IDENT().getText();
                if (escoposAninhados.obterEscopoAtual().existe(ident)) {
                    SemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + ident + " ja declarado anteriormente");
                }
                if (ctx.tipo().registro() != null) {
                    TabelaDeSimbolos tabStruct = new TabelaDeSimbolos();
                    for (PiaParser.VariavelContext var : ctx.tipo().registro().variavel()) { // popula tabela do
                        TipoVariavel tipo = SemanticoUtils.verificarTipo(var.tipo().getText());
                        if (tabStruct.existe(var.ident1.getText())) {
                            SemanticoUtils.adicionarErroSemantico(var.ident1.getStart(), "identificador " + var.ident1.getText() + " ja declarado anteriormente");
                        } else {
                            tabStruct.adicionar(var.ident1.getText(), TipoEntradaTds.VARIAVEL, tipo);
                        }
                        for (PiaParser.IdentificadorContext idCtx : var.outrosIdent) {
                            if (tabStruct.existe(var.ident1.getText())) {
                                SemanticoUtils.adicionarErroSemantico(idCtx.getStart(), "identificador " + idCtx.getText() + " ja declarado anteriormente");
                            } else {
                                tabStruct.adicionar(idCtx.getText(), TipoEntradaTds.VARIAVEL, tipo);
                            }
                        }
                    }
                    EntradaTabelaDeSimbolos etd = new EntradaTabelaDeSimbolos(ctx.IDENT().getText(), TipoEntradaTds.TIPO, tabStruct);
                    escoposAninhados.obterEscopoAtual().adicionar(ctx.IDENT().getText(), etd);
                } else if (ctx.tipo().tipo_estendido() != null) {
                    if (ctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                        escoposAninhados.obterEscopoAtual().adicionar(ctx.IDENT().getText(), TipoEntradaTds.TIPO, SemanticoUtils.verificarTipo(ctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText()));
                    } else if (ctx.tipo().tipo_estendido().tipo_basico_ident().IDENT() != null) {
                        // todo
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(PiaParser.CmdAtribuicaoContext ctx) {
        String pai = ctx.identificador().getText();
        declaracaoAtual = pai;
        TipoVariavel tipoPai = escoposAninhados.obterEscopoAtual().verificar(declaracaoAtual).tipoObjeto;
        super.visitCmdAtribuicao(ctx); //To change body of generated methods, choose Tools | Templates.
        if (ctx.expressao().op_logico_1().size() > 0) {
            tipoEsperadoDeclarracaoAtual = TipoVariavel.LOGICO;
        }
        for (PiaParser.Termo_logicoContext termo_logicoContext : ctx.expressao().termo_logico()) {
            if (termo_logicoContext.op_logico_2().size() > 0) {
                tipoEsperadoDeclarracaoAtual = TipoVariavel.LOGICO;
            }
        }
        if (tipoPai != tipoEsperadoDeclarracaoAtual && tipoPai != TipoVariavel.INVALIDO
                && !(tipoPai == TipoVariavel.INTEIRO && tipoEsperadoDeclarracaoAtual == TipoVariavel.REAL)
                && !(tipoPai == TipoVariavel.REAL && tipoEsperadoDeclarracaoAtual == TipoVariavel.INTEIRO)) {
            SemanticoUtils.adicionarErroSemantico(ctx.getStart(), "atribuicao nao compativel para " + pai);
        }

        declaracaoAtual = null;
        tipoEsperadoDeclarracaoAtual = null;
        return null;
    }

    @Override
    public Void visitExp_aritmetica(PiaParser.Exp_aritmeticaContext ctx) {
        String pai = declaracaoAtual;
        boolean ponteiro = false, num = false, literal = false, logico = false, registro = false;
        for (PiaParser.TermoContext termoContext : ctx.termo()) {
            for (PiaParser.FatorContext fatorContext : termoContext.fator()) {
                for (PiaParser.ParcelaContext parcelaContext : fatorContext.parcela()) {
                    if (parcelaContext.parcela_unario() != null) {
                        if (parcelaContext.parcela_unario().NUM_INT() != null) { //int
                            if (!ponteiro && !num && !literal && !logico && !registro) {
                                num = true;
                                tipoEsperadoDeclarracaoAtual = TipoVariavel.INTEIRO;
                            }
                            if (ponteiro || literal || logico || registro) {
                                SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().NUM_INT().getSymbol(), "atribuicao nao compativel para " + pai);
                            }
                        }
                        if (parcelaContext.parcela_unario().NUM_REAL() != null) { //real
                            if (!ponteiro && !num && !literal && !logico && !registro) {
                                num = true;
                                tipoEsperadoDeclarracaoAtual = TipoVariavel.REAL;
                            }
                            if (ponteiro || literal || logico || registro) {
                                SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().NUM_REAL().getSymbol(), "atribuicao nao compativel para " + ctx.getParent().getParent().getParent().getText());
                            }
                        }
                        if (parcelaContext.parcela_unario().identificador() != null) { //variavel
                            if (escoposAninhados.obterEscopoAtual().existe(parcelaContext.parcela_unario().identificador().ident1.getText())) {
                                TipoVariavel tipo = escoposAninhados.obterEscopoAtual().verificar(parcelaContext.parcela_unario().identificador().ident1.getText()).tipoObjeto;
                                if (!ponteiro && !num && !literal && !logico && !registro) {
                                    switch (tipo) {
                                        case INTEIRO:
                                        case REAL:
                                            num = true;
                                            tipoEsperadoDeclarracaoAtual = TipoVariavel.INTEIRO;
                                            break;
                                        case LITERAL:
                                            literal = true;
                                            tipoEsperadoDeclarracaoAtual = TipoVariavel.LITERAL;
                                            break;
                                        case LOGICO:
                                            logico = true;
                                            tipoEsperadoDeclarracaoAtual = TipoVariavel.LOGICO;
                                        default:
                                            break;
                                    }
                                }
                                if (num && (tipo != TipoVariavel.INTEIRO && tipo != TipoVariavel.REAL)) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().identificador().ident1, "atribuicao nao compativel para " + pai);
                                }
                                if (literal && tipo != TipoVariavel.LITERAL) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().identificador().ident1, "atribuicao nao compativel para " + pai);
                                }
                                if (logico && tipo != TipoVariavel.LOGICO) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().identificador().ident1, "atribuicao nao compativel para " + pai);
                                }
                                if (ponteiro && tipo != TipoVariavel.PONTEIRO) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().identificador().ident1, "atribuicao nao compativel para " + pai);
                                }
                            }
                        }
                        if (parcelaContext.parcela_unario().IDENT() != null) {//func
                            if (escoposAninhados.obterEscopoAtual().existe(parcelaContext.parcela_unario().IDENT().getText())) {
                                TipoVariavel tipo = escoposAninhados.obterEscopoAtual().verificar(parcelaContext.parcela_unario().IDENT().getText()).tipoObjeto;
                                if (!ponteiro && !num && !literal && !logico && !registro) {
                                    switch (tipo) {
                                        case INTEIRO:
                                        case REAL:
                                            num = true;
                                            tipoEsperadoDeclarracaoAtual = TipoVariavel.INTEIRO;
                                            break;
                                        case LITERAL:
                                            literal = true;
                                            tipoEsperadoDeclarracaoAtual = TipoVariavel.LITERAL;
                                            break;
                                        case LOGICO:
                                            logico = true;
                                            tipoEsperadoDeclarracaoAtual = TipoVariavel.LOGICO;
                                        default:
                                            break;
                                    }
                                }
                                if (num && (tipo != TipoVariavel.INTEIRO && tipo != TipoVariavel.REAL)) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().IDENT().getSymbol(), "atribuicao nao compativel para " + pai);
                                }
                                if (literal && tipo != TipoVariavel.LITERAL) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().IDENT().getSymbol(), "atribuicao nao compativel para " + pai);
                                }
                                if (logico && tipo != TipoVariavel.LOGICO) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().IDENT().getSymbol(), "atribuicao nao compativel para " + pai);
                                }
                                if (ponteiro && tipo != TipoVariavel.PONTEIRO) {
                                    SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_unario().IDENT().getSymbol(), "atribuicao nao compativel para " + pai);
                                }
                            }
                        }
                    } else if (parcelaContext.parcela_nao_unario() != null) {
                        if (parcelaContext.parcela_nao_unario().CADEIA() != null) {
                            if (!ponteiro && !num && !literal && !logico && !registro) {
                                literal = true;
                                tipoEsperadoDeclarracaoAtual = TipoVariavel.LITERAL;
                                System.out.println("EH CADEIA");
                            }
                            if (ponteiro || num || logico || registro) {
                                SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_nao_unario().CADEIA().getSymbol(), "atribuicao nao compativel para " + pai);
                            }
                        } else if (parcelaContext.parcela_nao_unario().identificador() != null) {
                            if (!ponteiro && !num && !literal && !logico && !registro) {
                                ponteiro = true;
                                tipoEsperadoDeclarracaoAtual = TipoVariavel.PONTEIRO;
                            }
                            if (ponteiro || num || logico || registro) {
                                SemanticoUtils.adicionarErroSemantico(parcelaContext.parcela_nao_unario().identificador().getStart(), "atribuicao nao compativel para " + pai);
                            }
                        }
                    }
                }
            }
        }
        return super.visitExp_aritmetica(ctx); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Void visitCmdLeia(PiaParser.CmdLeiaContext ctx) {
        if (!escoposAninhados.obterEscopoAtual().existe(ctx.ident1.getText())) {
            SemanticoUtils.adicionarErroSemantico(ctx.ident1.getStart(), "identificador " + ctx.ident1.getText() + " nao declarado");
        }
        for (PiaParser.IdentificadorContext identificadorContext : ctx.outrosIdent) {
            if (!escoposAninhados.obterEscopoAtual().existe(identificadorContext.getText())) {
                SemanticoUtils.adicionarErroSemantico(identificadorContext.getStart(), "identificador " + identificadorContext.getText() + " nao declarado");
            }
        }
        return null;
    }

    @Override
    public Void visitIdentificador(PiaParser.IdentificadorContext ctx) {
        EntradaTabelaDeSimbolos retornoIdent1 = escoposAninhados.obterEscopoAtual().verificar(ctx.ident1.getText());
        if (retornoIdent1 == null) {
            SemanticoUtils.adicionarErroSemantico(ctx.getStart(), "identificador " + ctx.ident1.getText() + " nao declarado");
        } else {
            TabelaDeSimbolos tab = retornoIdent1.subTabela;
            for (Token t : ctx.subIdent) {
                if (tab.verificar(t.getText()) == null) {
                    SemanticoUtils.adicionarErroSemantico(t, "identificador " + t.getText() + " nao declarado");
                    return null;
                }
                tab = tab.verificar(t.getText()).subTabela;
            }
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_global(PiaParser.Declaracao_globalContext ctx) {
        if (ctx.tipo_estendido() != null) { //funcao
            escoposAninhados.obterEscopoAtual().adicionar(ctx.IDENT().getText(), TipoEntradaTds.FUNCAO, SemanticoUtils.verificarTipo(ctx.tipo_estendido().getText()));
        } else { //proced
            escoposAninhados.obterEscopoAtual().adicionar(ctx.IDENT().getText(), TipoEntradaTds.PROCEDIMENTO, TipoVariavel.INVALIDO);
        }
        escoposAninhados.criarNovoEscopo();
        visitParametros(ctx.parametros());
        ctx.declaracao_local().forEach(loc -> {
            visitDeclaracao_local(loc);
        });
        ctx.cmd().forEach(cmd -> {
            visitCmd(cmd);
        });
        escoposAninhados.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitVariavel(PiaParser.VariavelContext ctx) {
        TipoVariavel tipo = SemanticoUtils.verificarTipo(ctx.tipo().getText());
        if (tipo == TipoVariavel.INVALIDO) {
            SemanticoUtils.adicionarErroSemantico(ctx.tipo().getStart(), "tipo " + ctx.tipo().getText() + " nao declarado");
        }
        doUpdateTable(ctx.ident1.getText(), TipoEntradaTds.VARIAVEL, tipo, ctx.ident1.getStart());
        ctx.outrosIdent.forEach(identificadorContext -> {
            doUpdateTable(identificadorContext.getText(), TipoEntradaTds.VARIAVEL, tipo, identificadorContext.getStart());
        });
        return null;
    }

    private Void doUpdateTable(String text, TipoEntradaTds tipoEntrada, TipoVariavel tipoObjeto, Token t) {
        if (escoposAninhados.obterEscopoAtual().existe(text)) {
            SemanticoUtils.adicionarErroSemantico(t, "identificador " + text + " ja declarado anteriormente");
        } else {
            escoposAninhados.obterEscopoAtual().adicionar(text, tipoEntrada, tipoObjeto);
        }
        return null;
    }

}
