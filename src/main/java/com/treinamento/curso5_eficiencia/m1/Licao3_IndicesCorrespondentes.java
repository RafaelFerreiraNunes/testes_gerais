package com.treinamento.curso5_eficiencia.m1;

import java.util.*;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 1: Eficiência com HashMaps
 * LIÇÃO 3: Encontrando índices de soma correspondente em duas matrizes
 * 
 * CONCEITO:
 * Este exercício é um degrau antes da "Soma de Quatro". Vamos encontrar 
 * se existem dois pares (um de cada matriz) que resultam na mesma soma.
 * 
 * DESAFIO:
 * Dadas duas matrizes A e B, encontre uma soma S que ocorra em ambas. 
 * Retorne os índices {i, j} de A e {k, l} de B tais que A[i]+A[j] == B[k]+B[l].
 */
public class Licao3_IndicesCorrespondentes {

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 0, 1};
        
        // Somas em A: 1+2=3, 1+3=4, 2+3=5
        // Somas em B: 4+0=4, 4+1=5, 0+1=1
        // Correspondência: 1+3 em A (soma 4) e 4+0 em B (soma 4)
        
        System.out.println("Resultado: " + encontrarSomaComum(A, B)); 
    }

    public static String encontrarSomaComum(int[] A, int[] B) {
        Map<Integer, int[]> somasA = new HashMap<>();
        
        // TODO: Passo 1 - Calcular todas as somas de pares em A e guardar no mapa: 
        // chave = soma, valor = índices {i, j}
        
        // TODO: Passo 2 - Calcular somas de pares em B. 
        // Se a soma existir no mapa somasA, você encontrou a correspondência!
        
        return "Nenhuma correspondência encontrada";
    }
}
