package com.treinamento.curso8_grafos_e_arvores.m3;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 3: Algoritmos de Caminho Mínimo e Ciclos
 * LIÇÃO 1: Detecção de Ciclos em Grafo Não Direcionado (DFS)
 *
 * CONCEITO:
 * A detecção de ciclos é um problema fundamental em grafos. Em grafos não direcionados,
 * um ciclo existe se, ao fazer uma travessia DFS, encontramos um nó que já foi visitado
 * e não é o pai imediato do nó atual.
 *
 * DESAFIO:
 * Implemente um método para detectar se um grafo não direcionado contém um ciclo.
 *
 * Exemplo:
 * Grafo com ciclo: 0-1, 1-2, 2-0 -> true
 * Grafo sem ciclo: 0-1, 1-2, 2-3 -> false
 */
public class Licao1_DeteccaoCiclosDFS {

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

        // Método público para verificar se há ciclo
        public boolean temCiclo() {
            boolean[] visited = new boolean[numVertices];
            for (int i = 0; i < numVertices; i++) {
                if (!visited[i]) {
                    if (detectarCicloDFS(i, visited, -1)) { // -1 indica que não há pai para o nó inicial
                        return true;
                    }
                }
            }
            return false;
        }

        // Método recursivo auxiliar para detecção de ciclo
        boolean detectarCicloDFS(int currentNode, boolean[] visited, int parent) {
            visited[currentNode] = true;

            // TODO: Para cada vizinho do currentNode:
            // 1. Se o vizinho não foi visitado:
            //    Chame detectarCicloDFS recursivamente. Se retornar true, retorne true.
            // 2. Se o vizinho foi visitado E não é o pai (parent):
            //    Significa que encontramos um ciclo, retorne true.
            
            return false;
        }
    }

    public static void main(String[] args) {
        Grafo g1 = new Grafo(3);
        g1.adicionarAresta(0, 1);
        g1.adicionarAresta(1, 2);
        g1.adicionarAresta(2, 0);
        System.out.println("Grafo 1 tem ciclo? " + g1.temCiclo()); // Esperado: true

        Grafo g2 = new Grafo(4);
        g2.adicionarAresta(0, 1);
        g2.adicionarAresta(1, 2);
        g2.adicionarAresta(2, 3);
        System.out.println("Grafo 2 tem ciclo? " + g2.temCiclo()); // Esperado: false
    }
}
