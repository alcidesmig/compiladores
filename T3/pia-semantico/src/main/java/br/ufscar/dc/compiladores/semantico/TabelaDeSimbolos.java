package br.ufscar.dc.compiladores.semantico;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {

    public enum TipoVariavel {
        LITERAL,
        INTEIRO,
        REAL,
        LOGICO,
        INVALIDO,
        PONTEIRO,
        STRUCT
    }

    public enum TipoEntradaTds {
        TIPO,
        FUNCAO,
        PROCEDIMENTO,
        VARIAVEL
    }

    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void adicionar(String nome, TipoEntradaTds tipoEntrada, TipoVariavel tipoObjeto) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipoEntrada, tipoObjeto));
    }

    public void adicionar(String nome, EntradaTabelaDeSimbolos etd) {
        tabela.put(nome, etd);
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public EntradaTabelaDeSimbolos verificar(String nome) {
        return tabela.get(nome);
    }
}
