package com.treinamento.curso8_grafos_e_arvores.m5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 5: Problemas Avançados de Grafos e Árvores
 * LIÇÃO 3: Componentes Fortemente Conectados (Kosaraju's Algorithm)
 *
 * CONCEITO:
 * Um Componente Fortemente Conectado (Strongly Connected Component - SCC) em um grafo
 * direcionado é um subgrafo onde, para cada par de vértices (u, v) no subgrafo,
 * existe um caminho de u para v E um caminho de v para u.
 *
 * O Algoritmo de Kosaraju é um algoritmo eficiente para encontrar todos os SCCs.
 * Ele envolve duas passagens de DFS e a construção de um grafo transposto.
 *
 * DESAFIO:
 * Implemente o Algoritmo de Kosaraju para encontrar e imprimir os SCCs de um grafo direcionado.
 *
 * Exemplo:
 * Grafo:
 * 0 -> 1
 * 1 -> 2
 * 2 -> 0
 * 1 -> 3
 * 3 -> 4
 * 4 -> 5
 * 5 -> 3
 *
 * SCCs esperados: {0, 1, 2}, {3, 4, 5}
 */
public class Licao3_ComponentesFortementeConectados {

    static class GrafoDirecionado {
        private int numVertices;
        private List<List<Integer>> adj; // Lista de adjacência
        private List<List<Integer>> adjTransposto; // Grafo transposto

        public GrafoDirecionado(int numVertices) {
            this.numVertices = numVertices;
            adj = new ArrayList<>(numVertices);
            adjTransposto = new ArrayList<>(numVertices);
            for (int i = 0; i < numVertices; i++) {
                adj.add(new ArrayList<>());
                adjTransposto.add(new ArrayList<>());
            }
        }

        public void adicionarAresta(int u, int v) {
            adj.get(u).add(v);
            adjTransposto.get(v).add(u); // Adiciona aresta no grafo transposto
        }

        // Primeira passagem de DFS: preenche a pilha com a ordem de finalização dos nós
        void fillOrder(int v, boolean[] visited, Stack<Integer> stack) {
            visited[v] = true;
            for (int neighbor : adj.get(v)) {
                if (!visited[neighbor]) {
                    fillOrder(neighbor, visited, stack);
                }
            }
            stack.push(v);
        }

        // Segunda passagem de DFS: encontra os SCCs no grafo transposto
        void DFSUtil(int v, boolean[] visited, List<Integer> scc) {
            visited[v] = true;
            scc.add(v);
            for (int neighbor : adjTransposto.get(v)) {
                if (!visited[neighbor]) {
                    DFSUtil(neighbor, visited, scc);
                }
            }
        }

        // Método principal para encontrar SCCs
        public void encontrarSCCs() {
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[numVertices];

            // 1. Preencher a pilha com a ordem de finalização dos nós
            for (int i = 0; i < numVertices; i++) {
                if (!visited[i]) {
                    fillOrder(i, visited, stack);
                }
            }

            // 2. Resetar o array de visitados para a segunda DFS
            Arrays.fill(visited, false);

            // 3. Processar os vértices na ordem da pilha no grafo transposto
            System.out.println("Componentes Fortemente Conectados:");
            while (!stack.isEmpty()) {
                int v = stack.pop();
                if (!visited[v]) {
                    List<Integer> scc = new ArrayList<>();
                    DFSUtil(v, visited, scc);
                    System.out.println(scc);
                }
            }
        }
    }

    public static void main(String[] args) {
        GrafoDirecionado g = new GrafoDirecionado(6);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(2, 0);
        g.adicionarAresta(1, 3);
        g.adicionarAresta(3, 4);
        g.adicionarAresta(4, 5);
        g.adicionarAresta(5, 3);

        g.encontrarSCCs();
        /* Esperado:
         * Componentes Fortemente Conectados:
         * [3, 5, 4] (ou outra ordem interna)
         * [0, 2, 1] (ou outra ordem interna)
         */
    }
}
