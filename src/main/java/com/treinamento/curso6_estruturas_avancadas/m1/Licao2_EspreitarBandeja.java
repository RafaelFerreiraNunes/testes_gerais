package com.treinamento.curso6_estruturas_avancadas.m1;

import java.util.Stack;

/**
 * CURSO 6: Advanced Integrated Data Structures
 * LIÇÃO 2: Verificando a próxima bandeja (Peek)
 * 
 * CONCEITO:
 * Muitas vezes precisamos saber o que está no topo sem remover o elemento.
 * Para isso usamos o método `peek()`.
 * 
 * DESAFIO:
 * Implemente uma função que verifica se a próxima bandeja a ser retirada 
 * é de uma cor específica, sem retirá-la da pilha.
 */
public class Licao2_EspreitarBandeja {

    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Amarela");
        pilha.push("Cinza");

        boolean eCinza = isProximaCor(pilha, "Cinza");
        System.out.println("Próxima é Cinza? " + eCinza); // true
        System.out.println("Tamanho da pilha: " + pilha.size()); // Deve continuar sendo 2
    }

    public static boolean isProximaCor(Stack<String> pilha, String corAlvo) {
        // TODO: Implementar usando peek(). 
        // Lembre-se de validar se a pilha está vazia para evitar EmptyStackException.
        return false;
    }
}
