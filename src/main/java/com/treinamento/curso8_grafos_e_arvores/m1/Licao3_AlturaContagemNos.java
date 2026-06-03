package com.treinamento.curso8_grafos_e_arvores.m1;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 1: Fundamentos de Árvores
 * LIÇÃO 3: Altura e Contagem de Nós
 *
 * CONCEITO:
 * A altura de uma árvore é o número de arestas no caminho mais longo da raiz até uma folha.
 * Uma árvore com apenas um nó (raiz) tem altura 0. Uma árvore vazia tem altura -1.
 * A contagem de nós é simplesmente o número total de nós na árvore.
 *
 * DESAFIO:
 * Implemente métodos para calcular a altura de uma árvore binária e o número total de nós.
 *
 * Exemplo (mesma árvore):
 *      4
 *     / \
 *    2   5
 *   / \
 *  1   3
 * Altura: 2 (caminho 4->2->1 ou 4->2->3)
 * Contagem de Nós: 5
 */
public class Licao3_AlturaContagemNos {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        public int calculateHeight() {
            return height(root);
        }

        public int countNodes() {
            return count(root);
        }

        // Método recursivo para calcular a altura
        int height(Node node) {
            if (node == null) {
                return -1; // Altura de uma árvore vazia é -1
            }
            // TODO: A altura é 1 + o máximo da altura das subárvores esquerda e direita
            return 0;
        }

        // Método recursivo para contar os nós
        int count(Node node) {
            if (node == null) {
                return 0;
            }
            // TODO: A contagem é 1 (o nó atual) + a contagem dos nós da subárvore esquerda + a contagem dos nós da subárvore direita
            return 0;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        System.out.println("Altura da árvore: " + tree.calculateHeight()); // Esperado: 2
        System.out.println("Número total de nós: " + tree.countNodes()); // Esperado: 5
    }
}
