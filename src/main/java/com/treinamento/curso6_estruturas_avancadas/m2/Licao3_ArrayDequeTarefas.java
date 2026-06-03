package com.treinamento.curso6_estruturas_avancadas.m2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CURSO 7: Filas e Deques em Java
 * LIÇÃO 3: Gerenciando tarefas com ArrayDeque
 * 
 * CONCEITO:
 * O `Deque` (Double-Ended Queue) permite inserção e remoção em AMBAS as extremidades.
 * `ArrayDeque` é geralmente mais eficiente que `LinkedList` para pilhas e filas 
 * quando não precisamos de acessos aleatórios via índice.
 * 
 * DESAFIO:
 * Implemente um sistema onde:
 * 1. Tarefas comuns entram no FINAL da fila (addLast).
 * 2. Tarefas prioritárias entram no INÍCIO da fila (addFirst).
 */
public class Licao3_ArrayDequeTarefas {

    public static void main(String[] args) {
        Deque<String> tarefas = new ArrayDeque<>();
        
        adicionarTarefa(tarefas, "Limpar sala", false);
        adicionarTarefa(tarefas, "FOGO NA COZINHA!", true);
        adicionarTarefa(tarefas, "Lavar louça", false);

        System.out.println("Próxima tarefa: " + tarefas.pollFirst()); // Esperado: FOGO NA COZINHA!
    }

    public static void adicionarTarefa(Deque<String> deque, String tarefa, boolean isPrioridade) {
        // TODO: Se for prioridade, adicione no início. 
        // Caso contrário, adicione no fim.
    }
}
