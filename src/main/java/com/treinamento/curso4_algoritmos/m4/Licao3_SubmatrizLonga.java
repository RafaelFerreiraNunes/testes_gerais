package com.treinamento.curso4_algoritmos.m4;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 4: Técnica de Dois Ponteiros / Janela Deslizante
 * LIÇÃO 3: Sub-array mais longo com soma dada
 * 
 * CONCEITO:
 * Janela Deslizante de Tamanho Variável. Os dois ponteiros (início e fim) 
 * expandem e contraem a janela dinamicamente para satisfazer uma condição (soma).
 * 
 * DESAFIO:
 * Dado um array de números positivos e um valor S, encontre o comprimento 
 * do sub-array mais longo cuja soma seja EXATAMENTE S.
 * 
 * Exemplo: [1, 2, 3, 4, 2], S = 6
 * Sub-arrays: [1,2,3] (tamanho 3), [4,2] (tamanho 2)
 * Resultado: 3
 */
public class Licao3_SubmatrizLonga {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 2};
        int S = 4;
        System.out.println("Tamanho máximo: " + maiorSubArray(nums, S)); // Esperado: 4 ([1,1,1,1])
    }

    public static int maiorSubArray(int[] nums, int S) {
        int inicio = 0;
        int somaAtual = 0;
        int maxLen = 0;

        for (int fim = 0; fim < nums.length; fim++) {
            somaAtual += nums[fim];

            // TODO: Enquanto a somaAtual for maior que S, subtraia o elemento do 'inicio'
            // e incremente o 'inicio' (contraindo a janela).
            
            // TODO: Se somaAtual == S, atualize maxLen com o máximo entre maxLen e (fim - inicio + 1).
        }

        return maxLen;
    }
}
