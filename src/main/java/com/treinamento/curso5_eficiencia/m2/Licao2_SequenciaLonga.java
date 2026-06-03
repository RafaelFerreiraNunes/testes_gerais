package com.treinamento.curso5_eficiencia.m2;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 2: Otimização por Pré-cálculo e Redundância
 * LIÇÃO 2: Sequência mais longa após remoção
 * 
 * CONCEITO:
 * Às vezes, para encontrar o melhor resultado global, podemos pré-calcular 
 * informações da esquerda para a direita (prefixos) e da direita para a 
 * esquerda (sufixos).
 * 
 * DESAFIO:
 * Dado um array binário (0s e 1s), encontre o comprimento da sequência mais 
 * longa de 1s que você pode obter ao remover exatamente UM elemento '0'.
 * 
 * Exemplo: [1, 1, 0, 1, 1, 1, 0, 1, 1]
 * Ao remover o primeiro 0: temos cinco 1s seguidos (1,1,1,1,1).
 */
public class Licao2_SequenciaLonga {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println("Maior sequência: " + maiorSequencia(arr)); // Esperado: 5
    }

    public static int maiorSequencia(int[] arr) {
        int n = arr.length;
        int[] esquerda = new int[n];
        int[] direita = new int[n];

        // TODO: Pré-calcular 'esquerda[i]': quantos 1s existem seguidos à esquerda do índice i
        // TODO: Pré-calcular 'direita[i]': quantos 1s existem seguidos à direita do índice i
        
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                // TODO: Se removermos este 0, a nova sequência será esquerda[i] + direita[i]
                // Calcule o maxLen baseado nisso.
            }
        }
        return maxLen;
    }
}
