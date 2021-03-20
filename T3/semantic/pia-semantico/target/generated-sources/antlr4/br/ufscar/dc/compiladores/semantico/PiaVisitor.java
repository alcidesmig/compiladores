// Generated from br/ufscar/dc/compiladores/semantico/Pia.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.semantico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PiaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PiaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PiaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PiaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(PiaParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(PiaParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(PiaParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(PiaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(PiaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(PiaParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PiaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(PiaParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(PiaParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(PiaParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(PiaParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(PiaParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(PiaParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(PiaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(PiaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(PiaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(PiaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(PiaParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(PiaParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(PiaParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(PiaParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(PiaParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(PiaParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(PiaParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(PiaParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(PiaParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(PiaParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(PiaParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(PiaParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(PiaParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(PiaParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(PiaParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(PiaParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(PiaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(PiaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(PiaParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(PiaParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(PiaParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(PiaParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(PiaParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(PiaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(PiaParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(PiaParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(PiaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(PiaParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(PiaParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(PiaParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(PiaParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PiaParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(PiaParser.Op_logico_2Context ctx);
}