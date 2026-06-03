package com.treinamento.curso8_grafos_e_arvores.m1;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 1: Fundamentos de Árvores
 * LIÇÃO 2: Travessias PreOrder e PostOrder
 *
 * CONCEITO:
 * Além da InOrder, existem outras formas de percorrer uma árvore binária:
 *
 * Travessia PreOrder: Visita os nós na ordem: Raiz -> Esquerda -> Direita.
 * É útil para criar uma cópia da árvore ou para prefix expressions.
 *
 * Travessia PostOrder: Visita os nós na ordem: Esquerda -> Direita -> Raiz.
 * É útil para deletar a árvore (liberar memória) ou para postfix expressions.
 *
 * DESAFIO:
 * Implemente as travessias PreOrder e PostOrder para a mesma Árvore Binária da lição anterior.
 *
 * Exemplo (mesma árvore):
 *      4
 *     / \
 *    2   5
 *   / \
 *  1   3
 * Saída PreOrder: 4 2 1 3 5
 * Saída PostOrder: 1 3 2 5 4
 */
public class Licao2_TravessiasPrePostOrder {

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

        public void printPreOrder() {
            preOrder(root);
        }

        public void printPostOrder() {
            postOrder(root);
        }

        void preOrder(Node node) {
            if (node == null) {
                return;
            }
            // TODO: Implementar a lógica da travessia PreOrder
            // 1. Imprimir os dados do nó atual
            // 2. Chamar preOrder para o filho esquerdo
            // 3. Chamar preOrder para o filho direito
        }

        void postOrder(Node node) {
            if (node == null) {
                return;
            }
            // TODO: Implementar a lógica da travessia PostOrder
            // 1. Chamar postOrder para o filho esquerdo
            // 2. Chamar postOrder para o filho direito
            // 3. Imprimir os dados do nó atual
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        System.out.println("Travessia PreOrder da árvore binária:");
        tree.printPreOrder(); // Esperado: 4 2 1 3 5
        System.out.println("\nTravessia PostOrder da árvore binária:");
        tree.printPostOrder(); // Esperado: 1 3 2 5 4
    }
}
