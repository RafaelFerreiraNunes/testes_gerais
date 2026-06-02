package com.treinamento.curso4_algoritmos_m1;

import java.util.Arrays;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 1: Análise de Complexidade e Otimização
 * LIÇÃO 3: Substituição otimizada de matrizes
 * 
 * CONCEITO:
 * Às vezes a otimização vem de usar fórmulas matemáticas para evitar loops. 
 * Substituir cada elemento pelo produto de todos os outros pode ser feito em O(n).
 * 
 * DESAFIO:
 * Dado um array, substitua cada elemento pelo produto de todos os outros elementos 
 * do array SEM usar a operação de divisão.
 * 
 * Dica: Use dois arrays auxiliares (produtos à esquerda e produtos à direita).
 */
public class Licao3_SubstituicaoMatriz {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] resultado = produtoExcetoProprio(nums);
        System.out.println(Arrays.toString(resultado)); 
        // Esperado: [24, 12, 8, 6] 
        // Explicação: 2*3*4=24, 1*3*4=12, 1*2*4=8, 1*2*3=6
    }

    public static int[] produtoExcetoProprio(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // TODO: 1. Criar um array 'esquerda' onde esquerda[i] é o produto de tudo antes de i
        // TODO: 2. Criar um array 'direita' onde direita[i] é o produto de tudo depois de i
        // TODO: 3. res[i] = esquerda[i] * direita[i]
        
        return res;
    }
}
