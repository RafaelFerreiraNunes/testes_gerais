package com.treinamento.curso8_grafos_e_arvores.m5;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 8: Algoritmos de Grafos e Árvores
 * MÓDULO 5: Problemas Avançados de Grafos e Árvores
 * LIÇÃO 4: Menor Ancestral Comum (LCA) em Árvore
 *
 * CONCEITO:
 * O Menor Ancestral Comum (Lowest Common Ancestor - LCA) de dois nós 'n1' e 'n2'
 * em uma árvore é o nó mais baixo (mais distante da raiz) que é ancestral de ambos 'n1' e 'n2'.
 *
 * DESAFIO:
 * Implemente um método para encontrar o LCA de dois nós em uma Árvore Binária.
 *
 * Exemplo:
 *      1
 *     / \
 *    2   3
 *   / \
 *  4   5
 *
 * LCA(4, 5) = 2
 * LCA(4, 3) = 1
 * LCA(2, 4) = 2
 */
public class Licao4_MenorAncestralComumLCA {

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

        // Método público para encontrar o LCA
        public Node findLCA(int n1, int n2) {
            return findLCAUtil(root, n1, n2);
        }

        // Método recursivo auxiliar para encontrar o LCA
        Node findLCAUtil(Node node, int n1, int n2) {
            // Caso base: se o nó é nulo, ou se o nó é um dos nós que estamos procurando
            if (node == null || node.data == n1 || node.data == n2) {
                return node;
            }

            // TODO: Chame recursivamente para as subárvores esquerda e direita
            Node leftLCA = null; // findLCAUtil(node.left, n1, n2);
            Node rightLCA = null; // findLCAUtil(node.right, n1, n2);

            // TODO: Se ambos os filhos retornaram um nó não nulo, significa que n1 e n2
            // estão em subárvores diferentes, então o nó atual é o LCA.
            // TODO: Se apenas um dos filhos retornou um nó não nulo, esse nó é o LCA.
            // TODO: Se ambos retornaram nulo, não encontramos n1 ou n2 nesta subárvore.
            
            return null;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5): " + tree.findLCA(4, 5).data); // Esperado: 2
        System.out.println("LCA(4, 6): " + tree.findLCA(4, 6).data); // Esperado: 1
        System.out.println("LCA(3, 4): " + tree.findLCA(3, 4).data); // Esperado: 1
        System.out.println("LCA(2, 4): " + tree.findLCA(2, 4).data); // Esperado: 2
    }
}
