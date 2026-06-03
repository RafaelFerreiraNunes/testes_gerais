package com.treinamento.curso6_estruturas_avancadas.m5;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CURSO 10: Revisão de Estruturas Integradas
 * LIÇÃO 1: Construindo um sistema de filas para um café
 * 
 * CONCEITO:
 * Revisitando o padrão Wrapper. Criamos uma classe 'CafeQueue' que encapsula 
 * um Deque para garantir que apenas operações de Fila (FIFO) sejam permitidas.
 * 
 * DESAFIO:
 * Complete a classe CafeQueue para gerenciar pedidos.
 * Ela deve permitir adicionar pedidos e processá-los na ordem de chegada.
 */
public class Licao1_FilaCafe {

    static class CafeQueue {
        private Deque<String> pedidos = new ArrayDeque<>();

        public void adicionarPedido(String pedido) {
            // TODO: Adicionar ao final da fila
        }

        public String processarProximo() {
            if (pedidos.isEmpty()) return "Sem pedidos";
            // TODO: Remover e retornar o primeiro da fila
            return "";
        }

        public int totalPendentes() {
            return pedidos.size();
        }
    }

    public static void main(String[] args) {
        CafeQueue fila = new CafeQueue();
        fila.adicionarPedido("Expresso");
        fila.adicionarPedido("Capuccino");

        System.out.println("Processando: " + fila.processarProximo()); // Expresso
        System.out.println("Pendentes: " + fila.totalPendentes());    // 1
    }
}
