package com.treinamento.curso4_algoritmos_m1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 1: Análise de Complexidade e Otimização
 * LIÇÃO 1: Pontos de soma entre duas cidades em Integerland
 * 
 * CONCEITO:
 * Identificar se um par de números atende a uma condição (soma) é o primeiro passo 
 * para entender complexidade. 
 * - Força Bruta: O(n^2) - dois loops aninhados.
 * - Otimizado: O(n log n) - Ordenar e usar dois ponteiros.
 * 
 * DESAFIO:
 * Verifique se existem dois "pontos" (números) cuja soma seja exatamente o alvo.
 * Implemente a versão otimizada usando ordenação.
 */
public class Licao1_PontosSoma {

    public static void main(String[] args) {
        List<Integer> pontos = new ArrayList<>(List.of(10, 15, 3, 7));
        int alvo = 17;
        System.out.println("Existe soma? " + temSoma(pontos, alvo)); // true (10 + 7)
    }

    public static boolean temSoma(List<Integer> pontos, int alvo) {
        // TODO: 1. Ordenar a lista (Collections.sort) - O(n log n)
        // TODO: 2. Usar dois ponteiros (inicio e fim) para encontrar a soma - O(n)
        // Complexidade Final: O(n log n)
        
        return false;
    }
}
