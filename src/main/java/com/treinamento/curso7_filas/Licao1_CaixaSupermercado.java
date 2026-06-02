package com.treinamento.curso7_filas;

import java.util.LinkedList;
import java.util.Queue;

/**
 * CURSO 7: Filas e Deques em Java
 * LIÇÃO 1: Corrigindo a fila do caixa do supermercado
 * 
 * CONCEITO:
 * Uma Fila (Queue) segue o princípio FIFO (First In, First Out). 
 * O primeiro a entrar é o primeiro a ser atendido. 
 * Em Java, LinkedList é uma implementação comum de Queue.
 * 
 * DESAFIO:
 * O sistema do supermercado está perdendo o nome do cliente ao atendê-lo.
 * Implemente a função de "Atendimento" que remove o cliente da fila e retorna 
 * "Atendendo: [NOME]". Se a fila estiver vazia, retorne "Caixa livre".
 */
public class Licao1_CaixaSupermercado {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");

        System.out.println(atenderProximo(fila)); // Esperado: Atendendo: João
        System.out.println("Restantes na fila: " + fila.size()); // Esperado: 2
    }

    public static String atenderProximo(Queue<String> fila) {
        // TODO: Verifique se a fila não está vazia.
        // Se estiver, retorne "Caixa livre".
        // Se não, use o método poll() para remover e obter o primeiro cliente.
        
        return "";
    }
}
