package com.treinamento.curso8_grafos_e_arvores.m3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 3: Algoritmos de Caminho Mínimo e Ciclos
 * LIÇÃO 3: Algoritmo de Bellman-Ford (Caminho Mínimo com Arestas Negativas)
 *
 * CONCEITO:
 * O Algoritmo de Bellman-Ford é mais versátil que Dijkstra, pois pode lidar com
 * arestas com pesos negativos. Ele funciona relaxando todas as arestas V-1 vezes,
 * onde V é o número de vértices. Uma V-ésima iteração pode detectar ciclos de peso negativo.
 *
 * DESAFIO:
 * Implemente o algoritmo de Bellman-Ford para encontrar o caminho mais curto de um vértice
 * de origem para todos os outros vértices em um grafo direcionado com arestas ponderadas,
 * que podem ser negativas.
 *
 * Exemplo:
 * Grafo com 5 vértices e arestas ponderadas (algumas negativas):
 * (0,1,-1), (0,2,4), (1,2,3), (1,3,2), (1,4,2), (3,2,5), (3,1,1), (4,3,-3)
 *
 * Caminhos mais curtos a partir do vértice 0:
 * 0 -> 0: 0
 * 0 -> 1: -1
 * 0 -> 2: 2
 * 0 -> 3: -2
 * 0 -> 4: 1
 */
public class Licao3_BellmanFord {

    static class Edge {
        int source, target, weight;

        public Edge(int source, int target, int weight) {
            this.source = source;
            this.target = target;
            this.weight = weight;
        }
    }

    static class GrafoBellmanFord {
        private int numVertices;
        private List<Edge> edges;

        public GrafoBellmanFord(int numVertices) {
            this.numVertices = numVertices;
            this.edges = new ArrayList<>();
        }

        public void adicionarAresta(int source, int target, int weight) {
            edges.add(new Edge(source, target, weight));
        }

        public int[] bellmanFord(int startNode) {
            int[] dist = new int[numVertices];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[startNode] = 0;

            // Relaxa todas as arestas V-1 vezes
            for (int i = 1; i < numVertices; i++) {
                for (Edge edge : edges) {
                    // TODO: Se dist[edge.source] não é infinito E
                    // dist[edge.source] + edge.weight < dist[edge.target]:
                    // Atualize dist[edge.target] = dist[edge.source] + edge.weight.
                }
            }

            // TODO: Detectar ciclos de peso negativo (V-ésima iteração)
            // Se uma distância ainda pode ser relaxada, há um ciclo negativo.
            // Para este desafio, apenas retorne as distâncias.
            
            return dist;
        }
    }

    public static void main(String[] args) {
        GrafoBellmanFord g = new GrafoBellmanFord(5);
        g.adicionarAresta(0, 1, -1);
        g.adicionarAresta(0, 2, 4);
        g.adicionarAresta(1, 2, 3);
        g.adicionarAresta(1, 3, 2);
        g.adicionarAresta(1, 4, 2);
        g.adicionarAresta(3, 2, 5);
        g.adicionarAresta(3, 1, 1);
        g.adicionarAresta(4, 3, -3);

        int[] distancias = g.bellmanFord(0);
        System.out.println("Distâncias mais curtas a partir do vértice 0 (Bellman-Ford):");
        for (int i = 0; i < distancias.length; i++) {
            System.out.println("0 -> " + i + ": " + distancias[i]);
        }
        /* Esperado:
         * 0 -> 0: 0
         * 0 -> 1: -1
         * 0 -> 2: 2
         * 0 -> 3: -2
         * 0 -> 4: 1
         */
    }
}
