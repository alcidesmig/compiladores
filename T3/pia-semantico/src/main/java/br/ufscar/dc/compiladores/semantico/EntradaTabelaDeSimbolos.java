/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.semantico;

public class EntradaTabelaDeSimbolos {

    String nome;
    TabelaDeSimbolos.TipoEntradaTds tipoEntrada;
    TabelaDeSimbolos.TipoVariavel tipoObjeto;

    TabelaDeSimbolos subTabela;

    public EntradaTabelaDeSimbolos(String nome, TabelaDeSimbolos.TipoEntradaTds tipoEntrada, TabelaDeSimbolos.TipoVariavel tipoObjeto) {
        this.nome = nome;
        this.tipoEntrada = tipoEntrada;
        this.tipoObjeto = tipoObjeto;
    }

    public EntradaTabelaDeSimbolos(String nome, TabelaDeSimbolos.TipoEntradaTds tipoEntrada, TabelaDeSimbolos subTabela) {
        this.nome = nome;
        this.tipoEntrada = tipoEntrada;
        this.subTabela = new TabelaDeSimbolos();
    }

}