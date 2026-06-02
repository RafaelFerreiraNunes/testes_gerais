package com.treinamento.curso3_decomposicao_m3;

import java.util.Arrays;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 3: Manipulação de Submatrizes e Concatenação
 * LIÇÃO 2: Concatenação de limites de matriz
 * 
 * CONCEITO:
 * Extrair limites (bordas) exige isolar intervalos de índices. 
 * É uma sub-tarefa comum antes de realizar operações de fusão.
 * 
 * DESAFIO:
 * Dada uma matriz quadrada N x N, extraia a primeira linha e a última linha, 
 * e concatene-as em uma nova matriz de 2 linhas.
 */
public class Licao2_ConcatenacaoLimites {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] limites = extrairLimites(matriz);
        for (int[] l : limites) System.out.println(Arrays.toString(l));
        // Esperado:
        // [1, 2, 3]
        // [7, 8, 9]
    }

    public static int[][] extrairLimites(int[][] m) {
        int n = m.length;
        int[][] res = new int[2][n];

        // TODO: Copiar a linha 0 de 'm' para 'res[0]'
        // TODO: Copiar a linha n-1 de 'm' para 'res[1]'
        
        return res;
    }
}
