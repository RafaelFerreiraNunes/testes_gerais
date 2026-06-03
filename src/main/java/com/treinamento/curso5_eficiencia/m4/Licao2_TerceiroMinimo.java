package com.treinamento.curso5_eficiencia.m4;

import java.util.PriorityQueue;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 4: Heaps e Gestão de Fluxos de Dados
 * LIÇÃO 2: Encontre o 3º mínimo com eliminações
 * 
 * CONCEITO:
 * Podemos usar um Heap para extrair os K menores elementos. 
 * Se precisarmos do 3º mínimo, extraímos dois e o próximo 'peek()' será o nosso alvo.
 * 
 * DESAFIO:
 * Dado um array, encontre o 3º menor número único. 
 * Se o array tiver menos de 3 números únicos, retorne -1.
 */
public class Licao2_TerceiroMinimo {

    public static void main(String[] args) {
        int[] nums = {10, 5, 8, 5, 2, 10, 15}; 
        // Únicos: 2, 5, 8, 10, 15
        // 3º mínimo: 8
        System.out.println("3º Mínimo: " + encontrarTerceiroMinimo(nums));
    }

    public static int encontrarTerceiroMinimo(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        // TODO: Adicione os números ao heap (dica: use um Set para garantir unicidade antes de por no heap)
        
        // TODO: Remova os dois primeiros elementos
        
        // TODO: Retorne o terceiro (ou -1 se não existir)
        return -1;
    }
}
