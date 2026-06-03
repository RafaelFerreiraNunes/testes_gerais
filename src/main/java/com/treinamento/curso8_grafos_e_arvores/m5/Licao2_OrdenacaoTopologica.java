package com.treinamento.curso8_grafos_e_arvores.m5;

import java.util.*;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 5: Problemas Avançados de Grafos e Árvores
 * LIÇÃO 2: Ordenação Topológica (Kahn's Algorithm)
 *
 * CONCEITO:
 * A Ordenação Topológica é uma ordenação linear dos vértices de um Grafo Acíclico Direcionado (DAG)
 * tal que para toda aresta direcionada u -> v, o vértice u vem antes de v na ordenação.
 *
 * O Algoritmo de Kahn (baseado em BFS) funciona encontrando vértices com grau de entrada (in-degree) 0,
 * adicionando-os a uma fila e, em seguida, removendo-os do grafo e atualizando os graus de entrada
 * de seus vizinhos.
 *
 * DESAFIO:
 * Implemente o Algoritmo de Kahn para realizar a ordenação topológica de um DAG.
 *
 * Exemplo:
 * Grafo (tarefas e dependências):
 * 0 -> 1
 * 0 -> 2
 * 1 -> 3
 * 2 -> 3
 *
 * Ordenação Topológica esperada: 0 1 2 3 (ou 0 2 1 3)
 */
public class Licao2_OrdenacaoTopologica {

    static class GrafoDirecionado {
        private int numVertices;
        private List<List<Integer>> adj; // Lista de adjacência
        private int[] inDegree; // Grau de entrada de cada vértice

        public GrafoDirecionado(int numVertices) {
            this.numVertices = numVertices;
            adj = new ArrayList<>(numVertices);
            for (int i = 0; i < numVertices; i++) {
                adj.add(new ArrayList<>());
            }
            inDegree = new int[numVertices];
        }

        public void adicionarAresta(int u, int v) {
            adj.get(u).add(v);
            inDegree[v]++; // Incrementa o grau de entrada do vértice v
        }

        public List<Integer> topologicalSort() {
            List<Integer> result = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();

            // 1. Adicionar todos os vértices com grau de entrada 0 à fila
            for (int i = 0; i < numVertices; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }

            int count = 0; // Conta os vértices processados
            while (!queue.isEmpty()) {
                int u = queue.poll();
                result.add(u);
                count++;

                // TODO: Para cada vizinho 'v' de 'u':
                // 1. Decremente o grau de entrada de 'v'.
                // 2. Se o grau de entrada de 'v' se tornar 0, adicione 'v' à fila.
            }

            // Se count for diferente de numVertices, há um ciclo no grafo
            if (count != numVertices) {
                System.out.println("O grafo contém um ciclo, ordenação topológica não é possível.");
                return Collections.emptyList();
            }

            return result;
        }
    }

    public static void main(String[] args) {
        GrafoDirecionado g = new GrafoDirecionado(4);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(2, 3);

        List<Integer> sortedOrder = g.topologicalSort();
        System.out.println("Ordenação Topológica: " + sortedOrder); // Esperado: [0, 1, 2, 3] ou [0, 2, 1, 3]
    }
}
