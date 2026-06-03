package com.treinamento.curso6_estruturas_avancadas.m2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CURSO 7: Filas e Deques em Java
 * LIÇÃO 4: Gire a Deque (O último será o primeiro)
 * 
 * CONCEITO:
 * A capacidade de manipular as duas pontas permite "girar" os dados de forma eficiente.
 * 
 * DESAFIO:
 * Implemente uma função que move o último elemento da Deque para a primeira posição.
 * 
 * Exemplo:
 * Deque: [A, B, C, D]
 * Após girar: [D, A, B, C]
 */
public class Licao4_GirarDeque {

    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<>();
        d.add("A"); d.add("B"); d.add("C"); d.add("D");

        girar(d);
        System.out.println("Após girar: " + d); // Esperado: [D, A, B, C]
    }

    public static void girar(Deque<String> deque) {
        if (deque.size() <= 1) return;

        // TODO: Remova o último elemento (pollLast) e insira-o no início (addFirst).
    }
}
