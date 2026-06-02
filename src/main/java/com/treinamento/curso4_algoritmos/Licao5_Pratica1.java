package com.treinamento.curso4_algoritmos;

import java.util.Stack;

/**
 * CURSO 4: Mastering Algorithms
 * LIÇÃO 5: Pilhas (Stacks) e o Princípio LIFO
 * 
 * CONCEITO:
 * Uma Pilha (Stack) segue o princípio LIFO (Last In, First Out). 
 * É a estrutura perfeita para validar estruturas aninhadas, como parênteses, 
 * pois o último parêntese aberto deve ser o primeiro a ser fechado.
 * 
 * DESAFIO:
 * Verifique se uma string contendo APENAS '(' e ')' está balanceada.
 * 
 * Exemplo:
 * "(())" -> true
 * "(()" -> false
 * ")(" -> false
 */
public class Licao5_Pratica1 {

    public static void main(String[] args) {
        System.out.println("'(())' balanceado? " + isSimplesBalanceado("(())")); // true
        System.out.println("'(()' balanceado? " + isSimplesBalanceado("(()"));   // false
    }

    public static boolean isSimplesBalanceado(String s) {
        Stack<Character> pilha = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                // TODO: Se encontrar um ')' mas a pilha estiver vazia, retorne false.
                // Caso contrário, remova (pop) o '(' correspondente da pilha.
            }
        }
        
        // TODO: A string só está balanceada se a pilha terminar vazia.
        return false; 
    }
}
