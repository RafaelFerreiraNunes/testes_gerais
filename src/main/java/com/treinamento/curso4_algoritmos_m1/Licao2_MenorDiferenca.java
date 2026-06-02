package com.treinamento.curso4_algoritmos_m1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 1: Análise de Complexidade e Otimização
 * LIÇÃO 2: Encontrando a menor diferença absoluta
 * 
 * CONCEITO:
 * Comparar todos os pares para achar a menor diferença é O(n^2). 
 * Porém, em uma lista ORDENADA, a menor diferença sempre estará entre elementos 
 * ADJACENTES. Isso reduz a busca para O(n) após a ordenação.
 * 
 * DESAFIO:
 * Retorne o valor da menor diferença absoluta entre quaisquer dois números da lista.
 */
public class Licao2_MenorDiferenca {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 19, 5, 25, 12));
        System.out.println("Menor diferença: " + encontrarMenorDiferenca(nums)); 
        // Ordenado: [1, 5, 12, 19, 25] -> Diferenças: 4, 7, 7, 6 -> Menor: 4
    }

    public static int encontrarMenorDiferenca(List<Integer> nums) {
        if (nums.size() < 2) return 0;

        // TODO: Ordenar a lista
        
        int minDiff = Integer.MAX_VALUE;
        // TODO: Percorrer a lista comparando o elemento atual com o anterior
        
        return minDiff;
    }
}
