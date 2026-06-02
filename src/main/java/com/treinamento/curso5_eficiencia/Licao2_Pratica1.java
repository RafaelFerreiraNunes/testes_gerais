package com.treinamento.curso5_eficiencia;

import java.util.Arrays;

/**
 * CURSO 5: Maximizing Efficiency in Problem-Solving Techniques in Java
 * LIÇÃO 2: Otimizando Força Bruta com Ordenação
 * 
 * CONCEITO:
 * Frequentemente, ordenar os dados antes de processar permite reduzir drasticamente 
 * a complexidade de algoritmos de O(n^2) ou pior para O(n log n).
 * 
 * DESAFIO:
 * "Intervalos de Tempo": Dada uma lista de horários de início e fim de reuniões, 
 * verifique se uma pessoa pode comparecer a todas as reuniões (sem sobreposição).
 * 
 * Exemplo:
 * [[0, 30], [5, 10], [15, 20]] -> false (sobreposição)
 * [[7, 10], [2, 4]] -> true (reordenado: [[2, 4], [7, 10]])
 */
public class Licao2_Pratica1 {

    public static void main(String[] args) {
        int[][] reunioes = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println("Pode comparecer? " + podeComparecer(reunioes)); // Esperado: false
    }

    public static boolean podeComparecer(int[][] intervalos) {
        if (intervalos.length <= 1) return true;

        // 1. Ordenar os intervalos com base no horário de início
        Arrays.sort(intervalos, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Comparar o fim da reunião atual com o início da próxima
        for (int i = 0; i < intervalos.length - 1; i++) {
            // TODO: Se o fim do intervalo i for maior que o início do intervalo i+1, retorne false.
        }

        return true;
    }
}
