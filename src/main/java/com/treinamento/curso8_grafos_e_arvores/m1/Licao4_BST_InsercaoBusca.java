package com.treinamento.curso8_grafos_e_arvores.m1;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 1: Fundamentos de Árvores
 * LIÇÃO 4: Árvore de Busca Binária (BST) - Inserção e Busca
 *
 * CONCEITO:
 * Uma Árvore de Busca Binária (Binary Search Tree - BST) é um tipo especial de árvore binária
 * onde, para cada nó:
 * 1. Todos os nós na subárvore esquerda têm um valor menor que o nó.
 * 2. Todos os nós na subárvore direita têm um valor maior que o nó.
 * Isso permite operações de busca, inserção e remoção eficientes (em média O(log N)).
 *
 * DESAFIO:
 * Implemente os métodos de inserção e busca para uma BST.
 *
 * Exemplo:
 * Inserir: 4, 2, 5, 1, 3
 * BST resultante:
 *      4
 *     / \
 *    2   5
 *   / \
 *  1   3
 * Buscar 3: true
 * Buscar 6: false
 */
public class Licao4_BST_InsercaoBusca {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BST {
        Node root;

        public BST() {
            root = null;
        }

        // Método público para inserção
        public void insert(int data) {
            root = insertRec(root, data);
        }

        // Método recursivo para inserção
        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            // TODO: Implementar a lógica de inserção
            // Se data < root.data, insere na esquerda
            // Se data > root.data, insere na direita
            return root;
        }

        // Método público para busca
        public boolean search(int data) {
            return searchRec(root, data);
        }

        // Método recursivo para busca
        boolean searchRec(Node root, int data) {
            if (root == null || root.data == data) {
                return root != null;
            }
            // TODO: Implementar a lógica de busca
            // Se data < root.data, busca na esquerda
            // Se data > root.data, busca na direita
            return false;
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        bst.insert(3);

        System.out.println("Buscar 3: " + bst.search(3)); // Esperado: true
        System.out.println("Buscar 6: " + bst.search(6)); // Esperado: false
    }
}
