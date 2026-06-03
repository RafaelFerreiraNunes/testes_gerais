package com.treinamento.curso6_estruturas_avancadas.m2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * CURSO 7: Filas e Deques em Java
 * LIÇÃO 2: Fila de tarefas matinais
 * 
 * CONCEITO:
 * O método `peek()` permite ver o próximo elemento da fila sem removê-lo.
 * 
 * DESAFIO:
 * Você tem uma fila de tarefas: "Escovar os dentes", "Tomar café", "Ir trabalhar".
 * Implemente uma função que verifica se a próxima tarefa urgente ("Tomar café") 
 * já é a próxima da fila. Se for, execute-a (remova). Se não for, apenas informe qual é a próxima.
 */
public class Licao2_TarefasMatinais {

    public static void main(String[] args) {
        Queue<String> tarefas = new LinkedList<>();
        tarefas.add("Escovar os dentes");
        tarefas.add("Tomar café");

        System.out.println(verificarTarefaUrgente(tarefas, "Tomar café"));
        System.out.println(verificarTarefaUrgente(tarefas, "Escovar os dentes"));
    }

    public static String verificarTarefaUrgente(Queue<String> fila, String tarefaUrgente) {
        if (fila.isEmpty()) return "Sem tarefas";
        
        // TODO: Use peek() para olhar a próxima tarefa.
        // Se for igual a tarefaUrgente, use poll() e retorne "Executando: " + tarefa.
        // Se não for, retorne "Aguarde, a próxima é: " + tarefa_espreitada.
        
        return "";
    }
}
