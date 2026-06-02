package com.treinamento.curso9_custom_treemap;

import java.util.TreeMap;

/**
 * CURSO 9: Custom Objects no TreeMap
 * LIÇÃO 2: Adicionando livros por Título
 * 
 * CONCEITO:
 * Quando o campo de comparação é uma String, podemos delegar a comparação 
 * para o método compareTo da própria classe String.
 * 
 * DESAFIO:
 * Implemente o compareTo na classe Livro para que a biblioteca mantenha os 
 * livros organizados alfabeticamente pelo título.
 */
public class Licao2_BibliotecaSimples {

    static class Livro implements Comparable<Livro> {
        private String titulo;

        public Livro(String titulo) {
            this.titulo = titulo;
        }

        @Override
        public int compareTo(Livro outro) {
            // TODO: Comparar títulos usando o compareTo da String
            return 0;
        }

        @Override
        public String toString() { return titulo; }
    }

    public static void main(String[] args) {
        TreeMap<Livro, Integer> estoque = new TreeMap<>();
        estoque.put(new Livro("Java Efetivo"), 10);
        estoque.put(new Livro("Arquitetura Limpa"), 5);
        estoque.put(new Livro("Código Limpo"), 8);

        System.out.println("Biblioteca: " + estoque.keySet());
        // Esperado: [Arquitetura Limpa, Código Limpo, Java Efetivo]
    }
}
