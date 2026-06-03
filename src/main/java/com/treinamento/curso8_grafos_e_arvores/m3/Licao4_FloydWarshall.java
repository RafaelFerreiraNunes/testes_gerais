package com.treinamento.curso8_grafos_e_arvores.m3;

import java.util.Arrays;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 3: Algoritmos de Caminho Mínimo e Ciclos
 * LIÇÃO 4: Algoritmo de Floyd-Warshall (Todos os Pares de Caminhos Mínimos)
 *
 * CONCEITO:
 * O Algoritmo de Floyd-Warshall encontra os caminhos mais curtos entre *todos*
 * os pares de vértices em um grafo ponderado (com ou sem arestas negativas, mas sem ciclos negativos).
 * Ele usa Programação Dinâmica, iterando sobre todos os vértices como possíveis vértices intermediários.
 *
 * DESAFIO:
 * Implemente o algoritmo de Floyd-Warshall para encontrar a matriz de distâncias
 * de caminho mínimo entre todos os pares de vértices em um grafo.
 *
 * Exemplo:
 * Grafo com 4 vértices e arestas ponderadas:
 * (0,1,3), (0,3,7), (1,0,8), (1,2,2), (2,0,5), (2,3,1), (3,0,2)
 *
 * Matriz de adjacência inicial (representando o grafo):
 *   0  1  2  3
 * 0[0, 3, I, 7]
 * 1[8, 0, 2, I]
 * 2[5, I, 0, 1]
 * 3[2, I, I, 0]
 * (I = infinito)
 *
 * Matriz de distâncias de caminho mínimo esperada:
 *   0  1  2  3
 * 0[0, 3, 5, 6]
 * 1[8, 0, 2, 3]
 * 2[3, 6, 0, 1]
 * 3[2, 5, 7, 0]
 */
public class Licao4_FloydWarshall {

    private static final int INF = 99999; // Representa infinito

    public static int[][] floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        // Inicializa a matriz de distâncias com o próprio grafo
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // TODO: Implementar as 3 loops aninhados do Floyd-Warshall
        // O loop mais externo (k) representa o vértice intermediário.
        // Os loops internos (i, j) representam os vértices de origem e destino.
        // dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
        
        return dist;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 3, INF, 7},
            {8, 0, 2, INF},
            {5, INF, 0, 1},
            {2, INF, INF, 0}
        };

        int[][] result = floydWarshall(graph);
        System.out.println("Matriz de distâncias de caminho mínimo (Floyd-Warshall):");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        /* Esperado:
         * [0, 3, 5, 6]
         * [8, 0, 2, 3]
         * [3, 6, 0, 1]
         * [2, 5, 7, 0]
         */
    }
}
