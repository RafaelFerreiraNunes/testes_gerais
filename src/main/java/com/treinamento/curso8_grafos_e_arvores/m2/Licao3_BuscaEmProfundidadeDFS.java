package com.treinamento.curso8_grafos_e_arvores.m2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 2: Representação e Travessias de Grafos
 * LIÇÃO 3: Busca em Profundidade (DFS - Depth-First Search)
 *
 * CONCEITO:
 * DFS é um algoritmo para percorrer ou pesquisar estruturas de dados em árvore ou grafo.
 * Ele começa na raiz (ou em um nó arbitrário do grafo) e explora o máximo possível
 * ao longo de cada ramo antes de fazer o backtracking.
 *
 * A DFS usa uma pilha (Stack) ou recursão (que usa a pilha de chamadas do sistema)
 * para gerenciar os nós a serem visitados.
 * É útil para encontrar componentes conectados, detecção de ciclos, ordenação topológica.
 *
 * DESAFIO:
 * Implemente a Busca em Profundidade (DFS) para um grafo dado.
 *
 * Exemplo (usando o grafo da Licao1):
 * Grafo:
 * 0: [1, 2]
 * 1: [0, 2]
 * 2: [0, 1, 3]
 * 3: [2]
 *
 * DFS a partir do vértice 0: 0 1 2 3 (a ordem pode variar dependendo da lista de adjacência)
 */
public class Licao3_BuscaEmProfundidadeDFS {

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

        // Método público para iniciar a DFS
        public void DFS(int startNode) {
            boolean[] visited = new boolean[numVertices];
            System.out.print("DFS a partir do vértice " + startNode + ": ");
            DFSUtil(startNode, visited);
            System.out.println();
        }

        // Método recursivo auxiliar para DFS
        void DFSUtil(int currentNode, boolean[] visited) {
            visited[currentNode] = true;
            System.out.print(currentNode + " ");

            // TODO: Para cada vizinho do currentNode:
            // 1. Se o vizinho não foi visitado:
            // 2. Chame DFSUtil recursivamente para o vizinho.
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(2, 3);

        g.DFS(0); // Esperado: DFS a partir do vértice 0: 0 1 2 3 (ou outra ordem válida)
    }
}
