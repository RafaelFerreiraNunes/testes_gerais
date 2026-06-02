package com.treinamento.curso5_eficiencia_m4;

import java.util.*;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 4: Heaps e Gestão de Fluxos de Dados
 * LIÇÃO 3: Menor elemento de ordem k/3 para cada prefixo
 * 
 * CONCEITO:
 * Este é um desafio similar à "Mediana de Prefixo", mas em vez de 
 * dividir o array ao meio (1/2), queremos o elemento que está na 
 * posição N/3. Usaremos dois Heaps para manter essa proporção.
 * 
 * DESAFIO:
 * Para cada prefixo de tamanho 'i', encontre o (i/3 + 1)-ésimo menor elemento.
 * Exemplo: Se i=3, queremos o 2º menor. Se i=6, o 3º menor.
 */
public class Licao3_ElementoK_Terco {

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30, 2};
        int[] resultados = calcularK_Terco(arr);
        System.out.println(Arrays.toString(resultados));
    }

    public static int[] calcularK_Terco(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        // maxHeap guarda os menores elementos (tamanho k/3)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        // minHeap guarda o restante dos elementos
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            minHeap.add(arr[i]);
            
            int tamanhoDesejadoMaxHeap = (i + 1) / 3;
            
            // TODO: Ajustar os heaps. 
            // 1. Mova o menor do minHeap para o maxHeap.
            // 2. Enquanto o maxHeap for maior que o tamanhoDesejado, mova de volta para o minHeap.
            
            // O (i/3 + 1)-ésimo menor será o topo do minHeap 
            // (pois o maxHeap já "segurou" os i/3 menores que ele).
            res[i] = minHeap.peek();
        }
        
        return res;
    }
}
