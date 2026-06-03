package com.treinamento.curso8_grafos_e_arvores.m2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 2: Representação e Travessias de Grafos
 * LIÇÃO 1: Representação de Grafos (Lista de Adjacência)
 *
 * CONCEITO:
 * Um Grafo é uma estrutura de dados composta por um conjunto de vértices (ou nós) e um conjunto de arestas
 * que conectam pares de vértices.
 *
 * Existem duas formas principais de representar um grafo em código:
 * 1. Matriz de Adjacência: Uma matriz V x V (onde V é o número de vértices) onde M[i][j] = 1 se há uma aresta
 *    entre o vértice i e o vértice j, e 0 caso contrário. Boa para grafos densos, mas gasta muita memória para grafos esparsos.
 * 2. Lista de Adjacência: Um array de listas, onde o índice i do array contém uma lista de todos os vértices
 *    adjacentes ao vértice i. É mais eficiente em termos de memória para grafos esparsos e para travessias.
 *
 * DESAFIO:
 * Implemente uma classe `Grafo` que utiliza a representação de Lista de Adjacência.
 * O grafo será não direcionado e não ponderado.
 *
 * Exemplo:
 * Vértices: 0, 1, 2, 3
 * Arestas: (0, 1), (0, 2), (1, 2), (2, 3)
 *
 * Lista de Adjacência esperada:
 * 0: [1, 2]
 * 1: [0, 2]
 * 2: [0, 1, 3]
 * 3: [2]
 */
public class Licao1_RepresentacaoGrafo {

    static class Grafo {
        private int numVertices;
        private List<List<Integer>> adj; // Lista de adjacência

        public Grafo(int numVertices) {
            this.numVertices = numVertices;
            adj = new ArrayList<>(numVertices);
            for (int i = 0; i < numVertices; i++) {
                adj.add(new ArrayList<>());
            }
        }

        // Adiciona uma aresta entre v e w (não direcionado)
        public void adicionarAresta(int v, int w) {
            // TODO: Adicionar w à lista de adjacência de v
            // TODO: Adicionar v à lista de adjacência de w
        }

        // Retorna a lista de adjacência de um vértice
        public List<Integer> getAdjacentes(int v) {
            return adj.get(v);
        }

        public void imprimirGrafo() {
            for (int i = 0; i < numVertices; i++) {
                System.out.print("Vértice " + i + ":");
                for (Integer vizinho : adj.get(i)) {
                    System.out.print(" -> " + vizinho);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(4); // 4 vértices (0, 1, 2, 3)
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(2, 3);

        System.out.println("Representação do Grafo:");
        g.imprimirGrafo();
        /* Esperado:
         * Vértice 0: -> 1 -> 2
         * Vértice 1: -> 0 -> 2
         * Vértice 2: -> 0 -> 1 -> 3
         * Vértice 3: -> 2
         */
    }
}
