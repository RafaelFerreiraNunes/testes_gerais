package com.treinamento.curso3_decomposicao.m2;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 2: Percurso em Matrizes e Decomposição
 * LIÇÃO 3: Percurso em ziguezague e índices primos
 * 
 * CONCEITO:
 * Este é o desafio integrador do módulo. Combina a navegação complexa (ziguezague) 
 * com um teste matemático de filtragem (números primos).
 * 
 * DESAFIO:
 * 1. Percorra a matriz em ziguezague (L0: esq->dir, L1: dir->esq, L2: esq->dir).
 * 2. Retorne os valores cujo ÍNDICE no percurso seja um número PRIMO.
 */
public class Licao3_ZiguezaguePrimos {

    public static void main(String[] args) {
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        System.out.println("Valores em índices primos: " + analisar(matriz));
        // Percurso: 10(0), 20(1), 30(2), 60(3), 50(4), 40(5), 70(6), 80(7), 90(8)
        // Índices primos: 2, 3, 5, 7
        // Valores: 30, 60, 40, 80
    }

    public static List<Integer> analisar(int[][] matriz) {
        List<Integer> percurso = new ArrayList<>();
        // TODO: Implementar percurso ziguezague horizontal
        
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < percurso.size(); i++) {
            if (isPrimo(i)) {
                resultado.add(percurso.get(i));
            }
        }
        return resultado;
    }

    private static boolean isPrimo(int n) {
        if (n < 2) return false;
        // TODO: Implementar verificação de número primo
        return true;
    }
}
