package br.ufscar.dc.compiladores.builder;

import java.util.List;

public class EntradaTabelaDeSimbolos {

    String nome;
    TabelaDeSimbolos.TipoEntradaTds tipoEntrada;
    TabelaDeSimbolos.TipoVariavel tipoObjeto;
    String identTipo;
    List<TabelaDeSimbolos.TipoVariavel> tiposFuncao;
    TabelaDeSimbolos subTabela;

    public EntradaTabelaDeSimbolos(String nome, TabelaDeSimbolos.TipoEntradaTds tipoEntrada, TabelaDeSimbolos.TipoVariavel tipoObjeto) {
        this.nome = nome;
        this.tipoEntrada = tipoEntrada;
        this.tipoObjeto = tipoObjeto;
    }
    
    public EntradaTabelaDeSimbolos(String nome, TabelaDeSimbolos.TipoEntradaTds tipoEntrada, TabelaDeSimbolos.TipoVariavel tipoObjeto, List<TabelaDeSimbolos.TipoVariavel> tiposFuncao) {
        this.nome = nome;
        this.tipoEntrada = tipoEntrada;
        this.tipoObjeto = tipoObjeto;
        this.tiposFuncao = tiposFuncao;
    }

    public EntradaTabelaDeSimbolos(TabelaDeSimbolos.TipoEntradaTds tipoEntrada, TabelaDeSimbolos subTabela) {
        this.tipoEntrada = tipoEntrada;
        this.subTabela = subTabela;
    }
    
    public EntradaTabelaDeSimbolos(TabelaDeSimbolos.TipoEntradaTds tipoEntrada, TabelaDeSimbolos subTabela, String identTipo) {
        this.tipoEntrada = tipoEntrada;
        this.subTabela = subTabela;
        this.identTipo = identTipo;
    }

}
