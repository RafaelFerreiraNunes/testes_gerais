package com.treinamento.curso8_grafos_e_arvores.m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 4: Árvores Especiais e Aplicações
 * LIÇÃO 2: Árvores B (Otimização de Disco)
 *
 * CONCEITO:
 * Árvores B são árvores de busca auto-balanceadas, generalizações das árvores binárias
 * de busca. Elas são otimizadas para sistemas que leem e escrevem grandes blocos de dados,
 * como sistemas de arquivos e bancos de dados, onde o acesso a disco é caro.
 * Uma árvore B de ordem 'm' tem as seguintes propriedades:
 * 1. Cada nó tem no máximo 'm' filhos.
 * 2. Cada nó interno (exceto a raiz) tem pelo menos 'm/2' filhos.
 * 3. A raiz tem pelo menos 2 filhos (a menos que seja uma folha).
 * 4. Todos os nós folha estão no mesmo nível.
 *
 * DESAFIO:
 * Implemente a estrutura básica de um nó de uma Árvore B e o método de inserção
 * para um caso simplificado (sem divisão de nós, apenas inserção em nós folha existentes).
 * O objetivo é entender a estrutura de um nó de Árvore B.
 *
 * Exemplo:
 * Inserir 10, 20, 5, 15, 30 em uma Árvore B de ordem 3 (m=3).
 * Um nó pode ter no máximo 2 chaves e 3 filhos.
 *
 * Árvore B (simplificada, sem divisões):
 * [5, 10, 15, 20, 30] em um único nó folha (se couber)
 *
 * Para este desafio, vamos focar apenas na representação do nó e na inserção
 * em um nó folha que ainda tem espaço.
 */
public class Licao2_ArvoreB {

    // Nó de uma Árvore B
    static class BTreeNode {
        List<Integer> keys; // Chaves armazenadas no nó
        List<BTreeNode> children; // Ponteiros para os filhos
        boolean isLeaf; // Verdadeiro se o nó é uma folha
        int t; // Grau mínimo (m = 2t)

        public BTreeNode(int t, boolean isLeaf) {
            this.t = t;
            this.isLeaf = isLeaf;
            this.keys = new ArrayList<>(2 * t - 1); // Máximo de 2t-1 chaves
            this.children = new ArrayList<>(2 * t); // Máximo de 2t filhos
        }

        // Método para encontrar a posição de uma chave no nó
        int findKey(int key) {
            int idx = 0;
            while (idx < keys.size() && keys.get(idx) < key) {
                idx++;
            }
            return idx;
        }

        // Método para inserir uma chave em um nó folha que não está cheio
        void insertNonFull(int key) {
            int i = keys.size() - 1;

            if (isLeaf) {
                // TODO: Inserir a chave na posição correta no nó folha
                // 1. Encontrar a posição 'i' onde a chave deve ser inserida.
                // 2. Deslocar as chaves maiores para a direita.
                // 3. Inserir a nova chave.
            } else {
                // Este desafio não aborda a inserção em nós internos com divisão.
                // Apenas para fins de demonstração, vamos simular a busca pelo filho correto.
                int idx = findKey(key);
                // children.get(idx).insertNonFull(key); // Chamada recursiva para o filho
                System.out.println("Inserção em nó interno não implementada para este desafio.");
            }
        }

        // Método para imprimir o nó (apenas as chaves)
        void printNode() {
            System.out.print(keys + " ");
        }
    }

    static class BTree {
        BTreeNode root;
        int t; // Grau mínimo

        public BTree(int t) {
            this.t = t;
            root = new BTreeNode(t, true); // Começa com uma raiz que é folha
        }

        public void insert(int key) {
            // Para este desafio simplificado, apenas inserimos na raiz se ela for folha e não estiver cheia.
            // A lógica completa de divisão de raiz e nós internos é mais complexa.
            if (root.isLeaf && root.keys.size() < (2 * t - 1)) {
                root.insertNonFull(key);
            } else {
                System.out.println("Inserção completa com divisão de nós não implementada para este desafio.");
            }
        }

        public void printTree() {
            if (root != null) {
                root.printNode();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BTree tree = new BTree(2); // Ordem 2 (m=2t=4), máximo 3 chaves por nó

        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(15);
        tree.insert(30);

        System.out.println("Chaves na raiz (simplificado):");
        tree.printTree(); // Esperado: [5, 10, 15, 20, 30] (se couberem todas no nó raiz)
    }
}
