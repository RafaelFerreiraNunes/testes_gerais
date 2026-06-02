package com.treinamento.curso10_revisao_avancada;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CURSO 10: Revisão de Estruturas Integradas
 * LIÇÃO 2: Sistema de gerenciamento do histórico do navegador
 * 
 * CONCEITO:
 * Históricos de navegação usam o conceito de Pilha (LIFO) para o botão "Voltar".
 * Embora usemos Deque, aqui a lógica será de Pilha.
 * 
 * DESAFIO:
 * Implemente as funções 'visitarPagina' (push) e 'voltarPagina' (pop).
 */
public class Licao2_HistoricoNavegador {

    static class BrowserHistory {
        private Deque<String> historico = new ArrayDeque<>();

        public void visitarPagina(String url) {
            // TODO: Adicionar a página ao topo da pilha
        }

        public String voltarPagina() {
            if (historico.isEmpty()) return "Página inicial";
            // TODO: Remover e retornar a última página visitada
            return "";
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visitarPagina("google.com");
        bh.visitarPagina("github.com");
        
        System.out.println("Voltar: " + bh.voltarPagina()); // github.com
        System.out.println("Voltar: " + bh.voltarPagina()); // google.com
    }
}
