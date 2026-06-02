package com.treinamento.curso5_eficiencia_m3;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 3: Raciocínio Combinatório e Contagem Eficiente
 * LIÇÃO 2: Contando pares com grande diferença (Lógica Reversa)
 * 
 * CONCEITO:
 * Às vezes é mais fácil calcular o Total de Pares e subtrair os pares que 
 * NÃO atendem ao critério (Lógica Reversa ou Complementar).
 * 
 * DESAFIO:
 * Dado um array de números positivos, conte quantos pares (i, j) com i < j 
 * possuem uma diferença absoluta |arr[i] - arr[j]| > K.
 * Dica: Total de Pares - Pares com diferença <= K.
 */
public class Licao2_ParesGrandeDiferenca {

    public static void main(String[] args) {
        int[] nums = {1, 10, 5, 2};
        int K = 3;
        System.out.println("Pares com diferença > 3: " + contarParesDiferenca(nums, K));
        // Pares totais: (1,10), (1,5), (1,2), (10,5), (10,2), (5,2) -> 6 pares
        // Diferenças: 9, 4, 1, 5, 8, 3
        // Maiores que 3: 9, 4, 5, 8 -> Resultado: 4
    }

    public static int contarParesDiferenca(int[] nums, int K) {
        int n = nums.length;
        int totalPossivel = n * (n - 1) / 2;
        int paresPequenos = 0;

        // Para fins didáticos, usaremos O(n^2), mas pense em como 
        // a lógica reversa facilita o entendimento do problema.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // TODO: Se Math.abs(nums[i] - nums[j]) <= K, incremente paresPequenos
            }
        }
        
        return totalPossivel - paresPequenos;
    }
}
