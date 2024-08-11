/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufscar.dc.compiladores.algumasemantica;

import java.util.HashMap;

/**
 *
 * @author ana
 */
public class TabelaDeSimbolos {
    
    public enum TipoDeclaracao {
        REAL,
        INTEIRO,
        LOGICO,
        LITERAL,
        TIPO,
        INVALIDO,
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoDeclaracao tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoDeclaracao tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
        
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    
    public TabelaDeSimbolos() {
        this.tabelaDeSimbolos = new HashMap<>();  
    }
    
    public void adicionar(String nome, TipoDeclaracao tipo) {
        tabelaDeSimbolos.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
   
    public boolean existe(String nome) {
        return tabelaDeSimbolos.containsKey(nome);
    } 
    
    public TipoDeclaracao verificar(String nome) {
        return tabelaDeSimbolos.get(nome).tipo;
    }
     
}
