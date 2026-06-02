package com.treinamento.curso3_decomposicao_m3;

import java.util.Arrays;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 3: Manipulação de Submatrizes e Concatenação
 * LIÇÃO 1: Matrizes Intercaladas
 * 
 * CONCEITO:
 * A decomposição de tarefas em matrizes envolve entender como os índices de diferentes 
 * fontes se mapeiam para uma matriz de destino. Intercalar matrizes exige alternar 
 * a origem dos dados (Matriz A ou Matriz B) com base na linha ou coluna atual.
 * 
 * DESAFIO:
 * Dadas duas matrizes A e B de mesmas dimensões, crie uma matriz C onde as linhas 
 * pares vêm de A e as linhas ímpares vêm de B.
 * 
 * Exemplo:
 * A = [[1, 1], [1, 1]]
 * B = [[2, 2], [2, 2]]
 * Resultado = [[1, 1], [2, 2]] (Linha 0 de A, Linha 1 de B)
 */
public class Licao1_MatrizesIntercaladas {

    public static void main(String[] args) {
        int[][] A = {{1, 1}, {1, 1}};
        int[][] B = {{2, 2}, {2, 2}};
        int[][] C = intercalar(A, B);
        
        for (int[] linha : C) {
            System.out.println(Arrays.toString(linha));
        }
    }

    public static int[][] intercalar(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] res = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            // TODO: Se 'i' for par, copie a linha i de A para res[i]
            // TODO: Se 'i' for ímpar, copie a linha i de B para res[i]
        }
        return res;
    }
}
