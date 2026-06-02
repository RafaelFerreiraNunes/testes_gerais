package com.treinamento.curso5_eficiencia;

import java.util.PriorityQueue;

/**
 * CURSO 5: Maximizing Efficiency in Problem-Solving Techniques in Java
 * LIÇÃO 1: Utilizando Heaps (PriorityQueue) para Eficiência
 * 
 * CONCEITO:
 * Um Heap (ou Fila de Prioridade) permite acessar o menor (ou maior) elemento 
 * de um conjunto em O(1) e inserir/remover em O(log N). 
 * É extremamente eficiente para problemas de "K-ésimo maior elemento" ou 
 * para fundir listas ordenadas.
 * 
 * DESAFIO:
 * Encontre o K-ésimo maior elemento em um array não ordenado.
 * (Dica: Use um Min-Heap de tamanho K).
 * 
 * Exemplo:
 * Array: [3, 2, 3, 1, 2, 4, 5, 5, 6], K: 4
 * Saída: 4
 */
public class Licao1_Pratica1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println("O " + k + "º maior elemento é: " + encontrarK_esimo(nums, k)); // Esperado: 4
    }

    public static int encontrarK_esimo(int[] nums, int k) {
        // Por padrão, PriorityQueue em Java é um Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.add(num);
            
            // TODO: Se o tamanho do heap exceder K, remova o menor elemento.
            // Assim, o topo do heap sempre será o K-ésimo maior elemento visto até agora.
        }
        
        return minHeap.peek();
    }
}
