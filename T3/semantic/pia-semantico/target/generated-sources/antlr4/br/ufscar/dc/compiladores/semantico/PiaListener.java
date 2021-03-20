// Generated from br/ufscar/dc/compiladores/semantico/Pia.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.semantico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PiaParser}.
 */
public interface PiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PiaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PiaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PiaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(PiaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(PiaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(PiaParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(PiaParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(PiaParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(PiaParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(PiaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(PiaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(PiaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(PiaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(PiaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(PiaParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PiaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PiaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(PiaParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(PiaParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(PiaParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(PiaParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(PiaParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(PiaParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(PiaParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(PiaParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(PiaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(PiaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(PiaParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(PiaParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(PiaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(PiaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PiaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PiaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(PiaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(PiaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(PiaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(PiaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(PiaParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(PiaParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(PiaParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(PiaParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(PiaParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(PiaParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(PiaParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(PiaParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(PiaParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(PiaParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(PiaParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(PiaParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(PiaParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(PiaParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(PiaParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(PiaParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(PiaParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(PiaParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(PiaParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(PiaParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(PiaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(PiaParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(PiaParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(PiaParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(PiaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(PiaParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(PiaParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(PiaParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(PiaParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(PiaParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(PiaParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(PiaParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(PiaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(PiaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(PiaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(PiaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(PiaParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(PiaParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(PiaParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(PiaParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(PiaParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(PiaParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(PiaParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(PiaParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(PiaParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(PiaParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(PiaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(PiaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(PiaParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(PiaParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(PiaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(PiaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(PiaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(PiaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(PiaParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(PiaParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(PiaParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(PiaParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(PiaParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(PiaParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(PiaParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(PiaParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PiaParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(PiaParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PiaParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(PiaParser.Op_logico_2Context ctx);
}