package com.treinamento.curso5_eficiencia_m3;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 3: Raciocínio Combinatório e Contagem Eficiente
 * LIÇÃO 1: Contando pares idênticos em um vetor
 * 
 * CONCEITO:
 * O número total de pares que podem ser formados a partir de N itens é N * (N - 1) / 2.
 * Se um número aparece 'K' vezes, ele forma K * (K - 1) / 2 pares idênticos.
 * Usar um HashMap para contar frequências permite resolver isso em O(N).
 * 
 * DESAFIO:
 * Dado um array de inteiros, conte quantos pares de índices (i, j) existem 
 * tais que i < j e arr[i] == arr[j].
 */
public class Licao1_ContarParesVetor {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println("Pares idênticos: " + contarPares(nums)); 
        // Esperado: 4. (Os 1s formam 3 pares, os 3s formam 1 par)
    }

    public static int contarPares(int[] nums) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        
        // TODO: Passo 1 - Contar a frequência de cada número usando o mapa
        
        int totalPares = 0;
        // TODO: Passo 2 - Para cada contagem 'K' no mapa, 
        // adicione (K * (K - 1) / 2) ao totalPares.
        
        return totalPares;
    }
}
