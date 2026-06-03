package com.treinamento.curso8_grafos_e_arvores.m4;

import java.util.Arrays;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 4: Árvores Especiais e Aplicações
 * LIÇÃO 4: Árvores Fenwick (BIT - Binary Indexed Tree)
 *
 * CONCEITO:
 * Uma Árvore Fenwick, ou Binary Indexed Tree (BIT), é uma estrutura de dados
 * que pode eficientemente calcular somas de prefixo e atualizar elementos
 * em um array. Ela é mais simples de implementar que uma Segment Tree e
 * oferece complexidade de tempo O(log N) para ambas as operações.
 *
 * A ideia principal é que cada índice na BIT armazena a soma de um certo
 * intervalo do array original. O intervalo que um índice `i` representa
 * é determinado pelo bit menos significativo de `i`.
 *
 * DESAFIO:
 * Implemente uma Árvore Fenwick para realizar:
 * 1. `update(idx, val)`: Adiciona `val` ao elemento no `idx` do array original.
 * 2. `query(idx)`: Retorna a soma dos elementos do array original de `0` a `idx`.
 *
 * Exemplo:
 * Array original: [1, 2, 3, 4, 5, 6, 7, 8]
 * BIT inicializada com zeros.
 *
 * update(0, 1) -> array[0] = 1
 * update(1, 2) -> array[1] = 2
 * ...
 * update(7, 8) -> array[7] = 8
 *
 * query(3) -> soma de array[0] a array[3] = 1 + 2 + 3 + 4 = 10
 *
 * update(2, 10) -> array[2] += 10 (agora array[2] = 13)
 * query(3) -> soma de array[0] a array[3] = 1 + 2 + 13 + 4 = 20
 */
public class Licao4_ArvoreFenwick {

    static class FenwickTree {
        int[] bit; // Binary Indexed Tree array
        int size;  // Size of the original array

        public FenwickTree(int size) {
            this.size = size;
            bit = new int[size + 1]; // BIT é 1-indexada
        }

        // Adiciona 'val' ao elemento no índice 'idx' (0-indexado)
        public void update(int idx, int val) {
            idx = idx + 1; // Converte para 1-indexado
            // TODO: Percorra a BIT, adicionando 'val' aos índices afetados
            // O próximo índice a atualizar é idx + (idx & -idx)
        }

        // Retorna a soma dos elementos de 0 a 'idx' (0-indexado)
        public int query(int idx) {
            idx = idx + 1; // Converte para 1-indexado
            int sum = 0;
            // TODO: Percorra a BIT, somando os valores dos índices relevantes
            // O próximo índice a consultar é idx - (idx & -idx)
            return sum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        FenwickTree ft = new FenwickTree(arr.length);

        // Inicializa a BIT com os valores do array original
        for (int i = 0; i < arr.length; i++) {
            ft.update(i, arr[i]);
        }

        System.out.println("Soma de 0 a 3: " + ft.query(3)); // Esperado: 10 (1+2+3+4)

        ft.update(2, 10); // Adiciona 10 ao elemento no índice 2 (agora arr[2] = 13)
        System.out.println("Soma de 0 a 3 após atualização: " + ft.query(3)); // Esperado: 20 (1+2+13+4)
    }
}
