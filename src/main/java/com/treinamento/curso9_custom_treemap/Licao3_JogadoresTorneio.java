package com.treinamento.curso9_custom_treemap;

import java.util.TreeMap;

/**
 * CURSO 9: Custom Objects no TreeMap
 * LIÇÃO 3: Classificação Personalizada (Múltiplos Campos)
 * 
 * CONCEITO:
 * Muitas vezes precisamos de um critério de desempate. 
 * Se as pontuações forem iguais, ordenamos pelo nome.
 * 
 * DESAFIO:
 * Implemente o compareTo para ordenar Jogadores:
 * 1. Pela pontuação (DECRESCENTE - maior primeiro).
 * 2. Pelo nome (CRESCENTE - alfabético) em caso de empate na pontuação.
 */
public class Licao3_JogadoresTorneio {

    static class Jogador implements Comparable<Jogador> {
        private String nome;
        private int pontos;

        public Jogador(String nome, int pontos) {
            this.nome = nome;
            this.pontos = pontos;
        }

        @Override
        public int compareTo(Jogador outro) {
            // TODO: 
            // 1. Comparar pontos (outro.pontos vs this.pontos para decrescente)
            // 2. Se pontos forem iguais, comparar this.nome com outro.nome
            return 0;
        }

        @Override
        public String toString() { return nome + " (" + pontos + ")"; }
    }

    public static void main(String[] args) {
        TreeMap<Jogador, String> ranking = new TreeMap<>();
        ranking.put(new Jogador("Ana", 100), "Top 1");
        ranking.put(new Jogador("Zeca", 100), "Top 2");
        ranking.put(new Jogador("Bruno", 150), "Master");

        for (Jogador j : ranking.keySet()) {
            System.out.println(j);
        }
        // Esperado:
        // Bruno (150)
        // Ana (100)
        // Zeca (100)
    }
}
