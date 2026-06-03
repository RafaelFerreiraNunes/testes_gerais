package com.treinamento.curso8_grafos_e_arvores.m5;

import java.util.*;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 5: Problemas Avançados de Grafos e Árvores
 * LIÇÃO 1: Árvore Geradora Mínima (MST) - Algoritmo de Prim
 *
 * CONCEITO:
 * Uma Árvore Geradora Mínima (Minimum Spanning Tree - MST) de um grafo conectado,
 * não direcionado e ponderado é uma subárvore que conecta todos os vértices
 * com o menor peso total possível das arestas.
 *
 * O Algoritmo de Prim é um algoritmo guloso que constrói a MST adicionando
 * arestas uma por uma, sempre escolhendo a aresta de menor peso que conecta
 * um vértice na MST a um vértice fora da MST. Ele utiliza uma fila de prioridade.
 *
 * DESAFIO:
 * Implemente o Algoritmo de Prim para encontrar o peso total da MST de um grafo.
 *
 * Exemplo:
 * Grafo com 5 vértices e arestas ponderadas:
 * (0,1,2), (0,3,6), (1,2,3), (1,3,8), (1,4,5), (2,4,7), (3,4,9)
 *
 * MST esperada (peso total): 16
 * Arestas: (0,1,2), (1,2,3), (1,4,5), (0,3,6)
 */
public class Licao1_MST_Prim {

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

        public void adicionarAresta(int u, int v, int weight) {
            adj.get(u).add(new Edge(v, weight));
            adj.get(v).add(new Edge(u, weight)); // Grafo não direcionado
        }

        public int primMST() {
            int totalWeight = 0;
            boolean[] inMST = new boolean[numVertices];
            // Fila de prioridade: armazena pares (peso, vértice)
            // Compara pelo peso da aresta
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

            // Começa do vértice 0
            pq.add(new int[]{0, 0}); // (peso da aresta para entrar na MST, vértice)

            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int weight = current[0];
                int u = current[1];

                // Se o vértice já está na MST, continue
                if (inMST[u]) {
                    continue;
                }

                inMST[u] = true;
                totalWeight += weight;

                // TODO: Para cada vizinho 'v' de 'u':
                // 1. Se 'v' ainda não está na MST:
                // 2. Adicione a aresta (u,v) à fila de prioridade (pq.add(new int[]{peso_da_aresta, v})).
            }
            return totalWeight;
        }
    }

    public static void main(String[] args) {
        GrafoPonderado g = new GrafoPonderado(5);
        g.adicionarAresta(0, 1, 2);
        g.adicionarAresta(0, 3, 6);
        g.adicionarAresta(1, 2, 3);
        g.adicionarAresta(1, 3, 8);
        g.adicionarAresta(1, 4, 5);
        g.adicionarAresta(2, 4, 7);
        g.adicionarAresta(3, 4, 9);

        System.out.println("Peso total da MST (Prim): " + g.primMST()); // Esperado: 16
    }
}
