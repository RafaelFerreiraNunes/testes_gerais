package com.treinamento.curso8_grafos_e_arvores.m1;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 1: Fundamentos de Árvores
 * LIÇÃO 1: Árvores Binárias e Travessia InOrder
 *
 * CONCEITO:
 * Uma Árvore Binária é uma estrutura de dados hierárquica onde cada nó tem no máximo dois filhos,
 * geralmente chamados de filho esquerdo e filho direito.
 *
 * Travessia InOrder: Visita os nós na seguinte ordem:
 * 1. Visita recursivamente a subárvore esquerda.
 * 2. Visita o nó raiz.
 * 3. Visita recursivamente a subárvore direita.
 * Para uma Árvore de Busca Binária (BST), a travessia InOrder retorna os elementos em ordem crescente.
 *
 * DESAFIO:
 * Implemente a travessia InOrder para uma Árvore Binária.
 *
 * Exemplo:
 *      4
 *     / \
 *    2   5
 *   / \
 *  1   3
 * Saída InOrder: 1 2 3 4 5
 */
public class Licao1_ArvoreInOrder {

    // Definição de um nó da árvore
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Classe para a Árvore Binária
    static class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        // Método público para iniciar a travessia InOrder
        public void printInOrder() {
            inOrder(root);
        }

        // Método recursivo para travessia InOrder
        void inOrder(Node node) {
            if (node == null) {
                return;
            }
            // TODO: Implementar a lógica da travessia InOrder
            // 1. Chamar inOrder para o filho esquerdo
            // 2. Imprimir os dados do nó atual
            // 3. Chamar inOrder para o filho direito
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        System.out.println("Travessia InOrder da árvore binária:");
        tree.printInOrder(); // Esperado: 1 2 3 4 5
    }
}
