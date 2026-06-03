package com.treinamento.curso8_grafos_e_arvores.m2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 2: Representação e Travessias de Grafos
 * LIÇÃO 2: Busca em Largura (BFS - Breadth-First Search)
 *
 * CONCEITO:
 * BFS é um algoritmo para percorrer ou pesquisar estruturas de dados em árvore ou grafo.
 * Ele começa na raiz (ou em um nó arbitrário do grafo) e explora todos os nós vizinhos
 * no nível atual antes de passar para os nós no próximo nível.
 *
 * A BFS usa uma fila (Queue) para gerenciar os nós a serem visitados.
 * É garantido que encontra o caminho mais curto em grafos não ponderados.
 *
 * DESAFIO:
 * Implemente a Busca em Largura (BFS) para um grafo dado.
 *
 * Exemplo (usando o grafo da Licao1):
 * Grafo:
 * 0: [1, 2]
 * 1: [0, 2]
 * 2: [0, 1, 3]
 * 3: [2]
 *
 * BFS a partir do vértice 0: 0 1 2 3 (a ordem pode variar para 1 e 2 dependendo da lista de adjacência)
 */
public class Licao2_BuscaEmLarguraBFS {

    static class Grafo {
        private int numVertices;
        private List<List<Integer>> adj;

        public Grafo(int numVertices) {
            this.numVertices = numVertices;
            adj = new ArrayList<>(numVertices);
            for (int i = 0; i < numVertices; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void adicionarAresta(int v, int w) {
            adj.get(v).add(w);
            adj.get(w).add(v);
        }

        // Método para realizar a BFS a partir de um vértice inicial
        public void BFS(int startNode) {
            boolean[] visited = new boolean[numVertices];
            Queue<Integer> queue = new LinkedList<>();

            visited[startNode] = true;
            queue.add(startNode);

            System.out.print("BFS a partir do vértice " + startNode + ": ");
            while (!queue.isEmpty()) {
                int currentNode = queue.poll();
                System.out.print(currentNode + " ");

                // TODO: Para cada vizinho do currentNode:
                // 1. Se o vizinho não foi visitado:
                // 2. Marque-o como visitado.
                // 3. Adicione-o à fila.
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(2, 3);

        g.BFS(0); // Esperado: BFS a partir do vértice 0: 0 1 2 3
    }
}
