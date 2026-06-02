package com.treinamento.curso5_eficiencia_m2;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 2: Otimização por Pré-cálculo e Redundância
 * LIÇÃO 1: Consultas de Soma Cumulativa (Prefix Sum)
 * 
 * CONCEITO:
 * Se precisamos responder a várias perguntas sobre a soma de elementos em um 
 * intervalo [L, R], em vez de somar tudo toda vez (O(n) por consulta), 
 * podemos pré-calcular a soma acumulada (Prefix Sum) em O(n) e responder 
 * cada consulta em O(1).
 * 
 * DESAFIO:
 * Implemente o pré-calculo das somas e responda às consultas de intervalo.
 */
public class Licao1_SomaCumulativa {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] consultas = {{0, 2}, {1, 4}, {2, 2}};
        
        int[] resultado = processarConsultas(arr, consultas);
        // Esperado: 6 (1+2+3), 14 (2+3+4+5), 3 (3)
        for (int r : resultado) System.out.println(r);
    }

    public static int[] processarConsultas(int[] arr, int[][] consultas) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];

        // TODO: Pré-calcular prefixSum onde prefixSum[i] contém a soma de arr[0...i-1]
        // prefixSum[0] = 0; prefixSum[1] = arr[0]; prefixSum[2] = arr[0] + arr[1]...

        int[] respostas = new int[consultas.length];
        for (int i = 0; i < consultas.length; i++) {
            int L = consultas[i][0];
            int R = consultas[i][1];
            // TODO: Usar a fórmula (prefixSum[R+1] - prefixSum[L]) para obter a soma em O(1)
        }
        return respostas;
    }
}
