package com.treinamento.curso4_algoritmos;

/**
 * CURSO 4: Mastering Algorithms: HashMaps, Two Pointers, and Beyond in Java
 * LIÇÃO 4: Soma de Prefixos (Prefix Sum)
 * 
 * CONCEITO:
 * A técnica de Soma de Prefixos consiste em pré-processar um array para permitir 
 * o cálculo da soma de qualquer intervalo [i, j] em tempo O(1).
 * Fórmula: soma(i, j) = prefixSum[j] - prefixSum[i-1]
 * 
 * DESAFIO:
 * Dado um array de números, responda a múltiplas consultas de soma de intervalo.
 * 
 * Exemplo:
 * Array: [1, 2, 3, 4, 5]
 * Consultas: (0, 2) -> 1+2+3 = 6; (2, 4) -> 3+4+5 = 12
 */
public class Licao4_Pratica1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[][] consultas = {{0, 2}, {2, 4}};
        
        int[] prefixos = calcularPrefixos(nums);
        
        for (int[] c : consultas) {
            System.out.println("Soma [" + c[0] + "," + c[1] + "]: " + consultarSoma(prefixos, c[0], c[1]));
        }
    }

    private static int[] calcularPrefixos(int[] nums) {
        int[] prefixos = new int[nums.length];
        prefixos[0] = nums[0];
        // TODO: Preencher o restante do array de prefixos
        // prefixos[i] = prefixos[i-1] + nums[i]
        return prefixos;
    }

    private static int consultarSoma(int[] prefixos, int i, int j) {
        // TODO: Implementar o retorno da soma usando a fórmula de prefixo
        // Lembre-se de tratar o caso onde i = 0
        return 0;
    }
}
