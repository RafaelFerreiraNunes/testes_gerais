package com.treinamento.curso4_algoritmos.m4;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 4: Técnica de Dois Ponteiros / Janela Deslizante
 * LIÇÃO 2: Soma máxima de um subvetor de comprimento K
 * 
 * CONCEITO:
 * Quando os ponteiros se movem na mesma direção e mantêm uma distância fixa K, 
 * chamamos de Janela Deslizante de Tamanho Fixo. Isso evita recalcular 
 * somas do zero (O(n*k)), permitindo resolver em O(n).
 * 
 * DESAFIO:
 * Dado um array de inteiros e um número K, encontre a soma máxima de 
 * qualquer sub-array contíguo de tamanho K.
 */
public class Licao2_SomaMaximaSubvetor {

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int K = 3;
        System.out.println("Soma máxima: " + somaMaxima(nums, K)); // Esperado: 9 (5+1+3)
    }

    public static int somaMaxima(int[] nums, int K) {
        if (nums.length < K) return 0;

        int somaJanela = 0;
        // 1. Calcula a soma da primeira janela
        for (int i = 0; i < K; i++) {
            somaJanela += nums[i];
        }

        int maxSoma = somaJanela;

        // 2. Desliza a janela
        for (int i = K; i < nums.length; i++) {
            // TODO: A nova soma da janela é (somaJanela + novo_elemento - elemento_que_saiu)
            // novo_elemento = nums[i]
            // elemento_que_saiu = nums[i - K]
            
            // TODO: Atualize maxSoma se a somaJanela for maior
        }

        return maxSoma;
    }
}
