package com.treinamento.curso3_decomposicao_m3;

import java.util.Arrays;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 3: Manipulação de Submatrizes e Concatenação
 * LIÇÃO 3: Troca de submatrizes
 * 
 * CONCEITO:
 * Este é o desafio integrador do módulo. Exige extrair duas regiões da mesma matriz 
 * e trocar seus valores. A decomposição ajuda a evitar erros de índice.
 * 
 * DESAFIO:
 * Dada uma matriz 4x4, divida-a em 4 quadrantes (2x2). 
 * Troque o quadrante Superior Esquerdo com o Inferior Direito.
 * 
 * Matriz inicial:
 * [[1, 1, 2, 2],
 *  [1, 1, 2, 2],
 *  [3, 3, 4, 4],
 *  [3, 3, 4, 4]]
 * 
 * Após troca (1 com 4):
 * [[4, 4, 2, 2],
 *  [4, 4, 2, 2],
 *  [3, 3, 1, 1],
 *  [3, 3, 1, 1]]
 */
public class Licao3_TrocaSubmatrizes {

    public static void main(String[] args) {
        int[][] m = {
            {1, 1, 2, 2},
            {1, 1, 2, 2},
            {3, 3, 4, 4},
            {3, 3, 4, 4}
        };
        trocarQuadrantes(m);
        for (int[] l : m) System.out.println(Arrays.toString(l));
    }

    public static void trocarQuadrantes(int[][] m) {
        // Quadrantes 2x2 em uma matriz 4x4
        int size = 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // TODO: 1. Guardar valor de m[i][j] (Sup. Esq) em temp
                // TODO: 2. m[i][j] = m[i + size][j + size] (Inf. Dir)
                // TODO: 3. m[i + size][j + size] = temp
            }
        }
    }
}
