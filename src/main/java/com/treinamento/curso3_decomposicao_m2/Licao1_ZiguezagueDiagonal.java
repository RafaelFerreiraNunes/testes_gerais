package com.treinamento.curso3_decomposicao_m2;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 2: Percurso em Matrizes e Decomposição
 * LIÇÃO 1: Percurso matricial em ziguezague diagonal
 * 
 * CONCEITO:
 * Percorrer uma matriz em diagonal exige controle estrito de limites (bordas).
 * A decomposição aqui consiste em separar a lógica de 'navegação' da lógica de 'processamento'.
 * 
 * DESAFIO:
 * Implemente o percurso diagonal simples (cima-direita) e retorne os valores.
 * Quando atingir o topo ou a lateral direita, pare.
 */
public class Licao1_ZiguezagueDiagonal {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Diagonal: " + percursoDiagonal(matriz));
        // Esperado: [7, 5, 3] (Diagonal secundária subindo)
    }

    public static List<Integer> percursoDiagonal(int[][] matrix) {
        List<Integer> resultado = new ArrayList<>();
        int r = matrix.length - 1; // Começa na última linha
        int c = 0;                 // Primeira coluna

        // TODO: Enquanto r >= 0 e c < matrix[0].length:
        // 1. Adicione matrix[r][c] ao resultado.
        // 2. Mova para cima e para a direita (r--, c++).
        
        return resultado;
    }
}
