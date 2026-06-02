package com.treinamento.curso5_eficiencia_m1;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 1: Eficiência com HashMaps
 * LIÇÃO 1: Encontrar um par de números com uma soma dada
 * 
 * CONCEITO:
 * A busca por dois números que somam um alvo (target) pode ser feita em O(n^2) 
 * com loops aninhados, ou em O(n) usando um HashMap para armazenar os 
 * valores já vistos e seus índices.
 * 
 * DESAFIO:
 * Retorne os índices dos dois números que somam o valor alvo.
 */
public class Licao1_ParSoma {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int alvo = 9;
        int[] resultado = encontrarPar(nums, alvo);
        if (resultado != null) {
            System.out.println("Índices: " + resultado[0] + ", " + resultado[1]); // 0, 1
        }
    }

    public static int[] encontrarPar(int[] nums, int alvo) {
        Map<Integer, Integer> mapa = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complemento = alvo - nums[i];
            
            // TODO: Se o mapa contiver o complemento, retorne os índices {mapa.get(complemento), i}
            // Caso contrário, adicione o número atual e seu índice ao mapa.
        }
        
        return null;
    }
}
