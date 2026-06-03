package com.treinamento.curso8_grafos_e_arvores.m4;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 4: Árvores Especiais e Aplicações
 * LIÇÃO 1: Árvores AVL (Balanceamento)
 *
 * CONCEITO:
 * Uma Árvore AVL é uma Árvore de Busca Binária (BST) auto-balanceada.
 * A propriedade de auto-balanceamento garante que a diferença de altura entre
 * as subárvores esquerda e direita de qualquer nó (fator de balanceamento)
 * nunca seja maior que 1. Isso assegura que as operações de busca, inserção
 * e remoção tenham complexidade de tempo O(log N), mesmo no pior caso.
 *
 * DESAFIO:
 * Implemente a inserção em uma Árvore AVL, incluindo as rotações necessárias
 * para manter o balanceamento. Para simplificar, foque apenas na inserção
 * e nas rotações simples (LL, RR, LR, RL).
 *
 * Exemplo de Inserção e Balanceamento:
 * Inserir 10, 20, 30:
 * 10 (raiz)
 *   \
 *    20
 *      \
 *       30
 * Fator de balanceamento de 10 é -2 (altura direita 2, altura esquerda 0).
 * Rotação à esquerda em 10.
 *
 * Árvore balanceada:
 *     20
 *    /  \
 *   10  30
 */
public class Licao1_ArvoreAVL {

    static class Node {
        int key;
        int height; // Altura do nó
        Node left, right;

        public Node(int d) {
            key = d;
            height = 1;
        }
    }

    static class AVLTree {
        Node root;

        // Retorna a altura do nó
        int height(Node N) {
            if (N == null)
                return 0;
            return N.height;
        }

        // Retorna o máximo de dois inteiros
        int max(int a, int b) {
            return (a > b) ? a : b;
        }

        // Rotação à direita (Right rotate)
        Node rightRotate(Node y) {
            Node x = y.left;
            Node T2 = x.right;

            // Perform rotation
            x.right = y;
            y.left = T2;

            // Update heights
            y.height = max(height(y.left), height(y.right)) + 1;
            x.height = max(height(x.left), height(x.right)) + 1;

            // Return new root
            return x;
        }

        // Rotação à esquerda (Left rotate)
        Node leftRotate(Node x) {
            Node y = x.right;
            Node T2 = y.left;

            // Perform rotation
            y.left = x;
            x.right = T2;

            // Update heights
            x.height = max(height(x.left), height(x.right)) + 1;
            y.height = max(height(y.left), height(y.right)) + 1;

            // Return new root
            return y;
        }

        // Retorna o fator de balanceamento de um nó
        int getBalance(Node N) {
            if (N == null)
                return 0;
            return height(N.left) - height(N.right);
        }

        // Método recursivo para inserir um nó e balancear a árvore
        Node insert(Node node, int key) {
            // 1. Perform the normal BST insertion
            if (node == null)
                return (new Node(key));

            if (key < node.key)
                node.left = insert(node.left, key);
            else if (key > node.key)
                node.right = insert(node.right, key);
            else // Duplicate keys not allowed
                return node;

            // 2. Update height of this ancestor node
            node.height = 1 + max(height(node.left), height(node.right));

            // 3. Get the balance factor of this ancestor node to check whether
            // this node became unbalanced
            int balance = getBalance(node);

            // TODO: Se o nó está desbalanceado, existem 4 casos:
            // Caso LL (Left Left): balance > 1 e key < node.left.key
            // Caso RR (Right Right): balance < -1 e key > node.right.key
            // Caso LR (Left Right): balance > 1 e key > node.left.key
            // Caso RL (Right Left): balance < -1 e key < node.right.key
            
            // Implemente as rotações para cada caso.
            // Exemplo: if (balance > 1 && key < node.left.key) return rightRotate(node);

            return node;
        }

        // Método para imprimir a árvore InOrder (para verificar o balanceamento)
        void printInOrder(Node node) {
            if (node != null) {
                printInOrder(node.left);
                System.out.print(node.key + " ");
                printInOrder(node.right);
            }
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        /* Construindo a árvore:
         * Inserir 10, 20, 30, 40, 50, 25
         * A árvore deve se auto-balancear.
         */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Travessia InOrder da árvore AVL balanceada:");
        tree.printInOrder(tree.root);
        // Esperado: 10 20 25 30 40 50 (e a estrutura deve estar balanceada)
    }
}
