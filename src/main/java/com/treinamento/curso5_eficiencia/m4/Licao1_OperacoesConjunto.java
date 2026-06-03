package com.treinamento.curso5_eficiencia.m4;

import java.util.PriorityQueue;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 4: Heaps e Gestão de Fluxos de Dados
 * LIÇÃO 1: Realizar operações em um conjunto de números
 * 
 * CONCEITO:
 * Uma Fila de Prioridade (Heap) é ideal quando precisamos acessar repetidamente 
 * o menor ou o maior elemento de um conjunto que muda constantemente.
 * 
 * DESAFIO:
 * Dado um conjunto de números, realize a seguinte operação até sobrar apenas um:
 * Retire os dois menores números, some-os e insira a soma de volta no conjunto.
 * Retorne o valor final.
 */
public class Licao1_OperacoesConjunto {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Resultado final: " + reduzirConjunto(nums)); 
        // 1+2=3 -> {3, 3, 4}
        // 3+3=6 -> {6, 4}
        // 4+6=10 -> {10}
    }

    public static int reduzirConjunto(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int n : nums) heap.add(n);

        while (heap.size() > 1) {
            // TODO: Remova os dois menores usando poll()
            // TODO: Adicione a soma de volta usando add()
        }
        
        return heap.poll();
    }
}
