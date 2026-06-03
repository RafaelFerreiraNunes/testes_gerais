package com.treinamento.curso8_grafos_e_arvores.m4;

import java.util.Arrays;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 4: Árvores Especiais e Aplicações
 * LIÇÃO 3: Árvores de Segmento (Segment Tree)
 *
 * CONCEITO:
 * Uma Árvore de Segmento é uma estrutura de dados de árvore usada para
 * armazenar informações sobre intervalos ou "segmentos". Ela permite
 * realizar consultas eficientes sobre intervalos (como soma, mínimo, máximo)
 * e atualizações de elementos em tempo O(log N).
 *
 * Cada nó na árvore de segmento representa um intervalo do array original.
 * A raiz representa o intervalo completo. Os filhos de um nó representam
 * as duas metades do intervalo do pai.
 *
 * DESAFIO:
 * Implemente uma Árvore de Segmento para realizar consultas de soma em intervalos
 * e atualizações de elementos.
 *
 * Exemplo:
 * Array original: [1, 3, 5, 7, 9, 11]
 * Consulta de soma [1, 4] (índices): 3 + 5 + 7 + 9 = 24
 * Atualizar índice 2 para 6: [1, 3, 6, 7, 9, 11]
 * Nova consulta de soma [1, 4]: 3 + 6 + 7 + 9 = 25
 */
public class Licao3_ArvoreSegmento {

    static class SegmentTree {
        int[] tree; // Array que representa a árvore de segmento
        int[] arr;  // Array original
        int n;      // Tamanho do array original

        public SegmentTree(int[] inputArr) {
            this.arr = inputArr;
            this.n = inputArr.length;
            // O tamanho da árvore de segmento é geralmente 2 * (próxima potência de 2 de n) - 1
            // ou simplesmente 4 * n para garantir espaço suficiente.
            this.tree = new int[4 * n];
            build(0, 0, n - 1); // Constrói a árvore a partir da raiz (índice 0 da tree)
        }

        // Constrói a árvore de segmento recursivamente
        void build(int treeIndex, int start, int end) {
            if (start == end) {
                tree[treeIndex] = arr[start];
            } else {
                int mid = (start + end) / 2;
                build(2 * treeIndex + 1, start, mid); // Constrói filho esquerdo
                build(2 * treeIndex + 2, mid + 1, end); // Constrói filho direito
                tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2]; // Soma dos filhos
            }
        }

        // Atualiza um elemento no array original e na árvore de segmento
        void update(int treeIndex, int start, int end, int idx, int val) {
            if (start == end) { // Nó folha
                arr[idx] = val;
                tree[treeIndex] = val;
            } else {
                int mid = (start + end) / 2;
                if (start <= idx && idx <= mid) { // Se o índice está na subárvore esquerda
                    update(2 * treeIndex + 1, start, mid, idx, val);
                } else { // Se o índice está na subárvore direita
                    update(2 * treeIndex + 2, mid + 1, end, idx, val);
                }
                tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2]; // Atualiza o nó pai
            }
        }

        // Consulta a soma de um intervalo [queryStart, queryEnd]
        int query(int treeIndex, int start, int end, int queryStart, int queryEnd) {
            // Caso 1: Intervalo da consulta está fora do intervalo do nó
            if (queryStart > end || queryEnd < start) {
                return 0;
            }
            // Caso 2: Intervalo da consulta cobre completamente o intervalo do nó
            if (queryStart <= start && end <= queryEnd) {
                return tree[treeIndex];
            }
            // Caso 3: Intervalo da consulta se sobrepõe parcialmente
            int mid = (start + end) / 2;
            // TODO: Retorne a soma das consultas recursivas nos filhos esquerdo e direito
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree st = new SegmentTree(arr);

        System.out.println("Soma do intervalo [1, 4]: " + st.query(0, 0, arr.length - 1, 1, 4)); // Esperado: 24

        st.update(0, 0, arr.length - 1, 2, 6); // Atualiza arr[2] de 5 para 6
        System.out.println("Array após atualização: " + Arrays.toString(arr));

        System.out.println("Nova soma do intervalo [1, 4]: " + st.query(0, 0, arr.length - 1, 1, 4)); // Esperado: 25
    }
}
