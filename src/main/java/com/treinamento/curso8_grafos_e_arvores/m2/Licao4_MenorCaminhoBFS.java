package com.treinamento.curso8_grafos_e_arvores.m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 2: Representação e Travessias de Grafos
 * LIÇÃO 4: Menor Caminho em Grafo Não Ponderado (BFS)
 *
 * CONCEITO:
 * A BFS é o algoritmo ideal para encontrar o caminho mais curto (em número de arestas)
 * entre dois nós em um grafo não ponderado. Isso ocorre porque ela explora o grafo
 * "camada por camada".
 *
 * DESAFIO:
 * Implemente um método que encontra o menor número de arestas entre um nó de origem
 * e um nó de destino em um grafo não ponderado.
 *
 * Exemplo (usando o grafo da Licao1):
 * Grafo:
 * 0: [1, 2]
 * 1: [0, 2]
 * 2: [0, 1, 3]
 * 3: [2]
 *
 * Menor caminho de 0 para 3: 2 arestas (0 -> 2 -> 3)
 */
public class Licao4_MenorCaminhoBFS {

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

        // Método para encontrar o menor caminho (número de arestas)
        public int encontrarMenorCaminho(int startNode, int endNode) {
            if (startNode == endNode) return 0;

            boolean[] visited = new boolean[numVertices];
            int[] distance = new int[numVertices]; // Armazena a distância de startNode
            Queue<Integer> queue = new LinkedList<>();

            Arrays.fill(distance, -1); // Inicializa distâncias como -1 (inalcançável)

            visited[startNode] = true;
            distance[startNode] = 0;
            queue.add(startNode);

            while (!queue.isEmpty()) {
                int currentNode = queue.poll();

                // TODO: Para cada vizinho do currentNode:
                // 1. Se o vizinho não foi visitado:
                // 2. Marque-o como visitado.
                // 3. Defina a distância do vizinho como distance[currentNode] + 1.
                // 4. Adicione o vizinho à fila.
                // 5. Se o vizinho for o endNode, retorne distance[endNode].
            }
            return -1; // Destino não alcançável
        }
    }

    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(2, 3);

        System.out.println("Menor caminho de 0 para 3: " + g.encontrarMenorCaminho(0, 3)); // Esperado: 2
        System.out.println("Menor caminho de 1 para 3: " + g.encontrarMenorCaminho(1, 3)); // Esperado: 2
        System.out.println("Menor caminho de 0 para 0: " + g.encontrarMenorCaminho(0, 0)); // Esperado: 0
    }
}
