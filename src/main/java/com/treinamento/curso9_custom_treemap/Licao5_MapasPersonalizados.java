package com.treinamento.curso9_custom_treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * CURSO 9: Custom Objects no TreeMap
 * LIÇÃO 5: Comparadores Externos (Decoupled Sorting)
 * 
 * CONCEITO:
 * Às vezes não podemos modificar a classe original (ex: de uma biblioteca externa). 
 * Podemos passar um Comparator no construtor do TreeMap para definir a ordem.
 * 
 * DESAFIO:
 * Use a classe Produto fornecida (que não possui Comparable) e crie um 
 * TreeMap que ordene os produtos pelo preço (do mais barato para o mais caro).
 */
public class Licao5_MapasPersonalizados {

    // Esta classe NÃO pode ser modificada (simulando biblioteca externa)
    static class Produto {
        String nome;
        double preco;
        Produto(String n, double p) { nome = n; preco = p; }
        @Override
        public String toString() { return nome + " ($" + preco + ")"; }
    }

    public static void main(String[] args) {
        // TODO: Criar o Comparator aqui (Lambda ou Classe Anônima)
        // Comparator<Produto> porPreco = ...
        
        // TODO: Inicializar o TreeMap passando o comparator
        // TreeMap<Produto, Integer> estoque = new TreeMap<>(porPreco);
        
        TreeMap<Produto, Integer> estoque = null; // Substitua por sua implementação

        if (estoque != null) {
            estoque.put(new Produto("Monitor", 800.0), 5);
            estoque.put(new Produto("Mouse", 50.0), 20);
            estoque.put(new Produto("Teclado", 150.0), 10);

            estoque.forEach((p, q) -> System.out.println(p + " Qtd: " + q));
        }
    }
}
