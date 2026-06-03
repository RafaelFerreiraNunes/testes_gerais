package com.treinamento.curso8_grafos_e_arvores.m3;

import java.util.*;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 3: Algoritmos de Caminho Mínimo e Ciclos
 * LIÇÃO 2: Algoritmo de Dijkstra (Caminho Mínimo em Grafo Ponderado)
 *
 * CONCEITO:
 * O Algoritmo de Dijkstra encontra os caminhos mais curtos de um único vértice de origem
 * para todos os outros vértices em um grafo ponderado (com pesos de aresta não negativos).
 * Ele usa uma fila de prioridade (PriorityQueue) para sempre extrair o vértice com a menor
 * distância conhecida que ainda não foi visitado.
 *
 * DESAFIO:
 * Implemente o algoritmo de Dijkstra para encontrar o caminho mais curto de um vértice
 * de origem para todos os outros vértices em um grafo ponderado.
 *
 * Exemplo:
 * Grafo com 5 vértices e arestas ponderadas:
 * (0,1,4), (0,2,1), (1,3,1), (2,1,2), (2,3,5), (3,4,3)
 *
 * Caminhos mais curtos a partir do vértice 0:
 * 0 -> 0: 0
 * 0 -> 1: 3 (0->2->1)
 * 0 -> 2: 1 (0->2)
 * 0 -> 3: 4 (0->2->1->3)
 * 0 -> 4: 7 (0->2->1->3->4)
 */
public class Licao2_Dijkstra {

    static class Edge {
        int target;
        int weight;

        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    static class GrafoPonderado {
        private int numVertices;
        private List<List<Edge>> adj;

        public GrafoPonderado(int numVertices) {
            this.numVertices = numVertices;
            adj = new ArrayList<>(numVertices);
            for (int i = 0; i < numVertices; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void adicionarAresta(int source, int target, int weight) {
            adj.get(source).add(new Edge(target, weight));
            // Para grafo não direcionado, adicione também a aresta inversa:
            // adj.get(target).add(new Edge(source, weight));
        }

        public int[] dijkstra(int startNode) {
            int[] dist = new int[numVertices];
            Arrays.fill(dist, Integer.MAX_VALUE); // Inicializa distâncias como infinito
            dist[startNode] = 0; // Distância da origem para si mesma é 0

            // Fila de prioridade: armazena pares (distância, vértice)
            // Compara pelo primeiro elemento (distância)
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            pq.add(new int[]{0, startNode}); // Adiciona (distância, vértice) inicial

            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int d = current[0];
                int u = current[1];

                // Se já encontramos um caminho mais curto para 'u', ignore
                if (d > dist[u]) {
                    continue;
                }

                // TODO: Para cada vizinho 'v' de 'u':
                // 1. Calcule a nova distância: newDist = dist[u] + peso da aresta (u,v).
                // 2. Se newDist < dist[v]:
                //    Atualize dist[v] = newDist.
                //    Adicione (newDist, v) à fila de prioridade.
            }
            return dist;
        }
    }

    public static void main(String[] args) {
        GrafoPonderado g = new GrafoPonderado(5);
        g.adicionarAresta(0, 1, 4);
        g.adicionarAresta(0, 2, 1);
        g.adicionarAresta(1, 3, 1);
        g.adicionarAresta(2, 1, 2);
        g.adicionarAresta(2, 3, 5);
        g.adicionarAresta(3, 4, 3);

        int[] distancias = g.dijkstra(0);
        System.out.println("Distâncias mais curtas a partir do vértice 0:");
        for (int i = 0; i < distancias.length; i++) {
            System.out.println("0 -> " + i + ": " + distancias[i]);
        }
        /* Esperado:
         * 0 -> 0: 0
         * 0 -> 1: 3
         * 0 -> 2: 1
         * 0 -> 3: 4
         * 0 -> 4: 7
         */
    }
}
