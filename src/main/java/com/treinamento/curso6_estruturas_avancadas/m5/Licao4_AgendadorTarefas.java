package com.treinamento.curso6_estruturas_avancadas.m5;

import java.util.TreeMap;
import java.util.Objects;

/**
 * CURSO 10: Revisão de Estruturas Integradas
 * LIÇÃO 4: Agendador de Tarefas com Chaves Personalizadas
 * 
 * CONCEITO:
 * Integração total: Classe personalizada como Chave, interface Comparable, 
 * e uso em TreeMap para agendamento.
 * 
 * DESAFIO:
 * Crie um agendador onde a chave é a classe 'Tarefa'. 
 * A Tarefa deve ser ordenada por:
 * 1. Hora (crescente)
 * 2. Minuto (crescente)
 * 3. Descrição (alfabética) em caso de empate de horário.
 */
public class Licao4_AgendadorTarefas {

    static class Tarefa implements Comparable<Tarefa> {
        int hora;
        int minuto;
        String descricao;

        public Tarefa(int h, int m, String d) {
            this.hora = h;
            this.minuto = m;
            this.descricao = d;
        }

        @Override
        public int compareTo(Tarefa outra) {
            // TODO: Implementar lógica de comparação tripla:
            // Primeiro hora, se igual minuto, se igual descricao.
            return 0;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d - %s", hora, minuto, descricao);
        }
        
        // Dica: Sempre que implementar Comparable, é boa prática implementar equals/hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tarefa)) return false;
            Tarefa t = (Tarefa) o;
            return hora == t.hora && minuto == t.minuto && descricao.equals(t.descricao);
        }

        @Override
        public int hashCode() {
            return Objects.hash(hora, minuto, descricao);
        }
    }

    public static void main(String[] args) {
        TreeMap<Tarefa, String> agenda = new TreeMap<>();
        
        agenda.put(new Tarefa(9, 30, "Reunião Daily"), "Sala 1");
        agenda.put(new Tarefa(14, 0, "Almoço com Cliente"), "Restaurante");
        agenda.put(new Tarefa(9, 30, "Ajuste de Bug"), "Home Office");

        // A saída deve mostrar as tarefas de 09:30 antes da de 14:00.
        // Entre as de 09:30, "Ajuste de Bug" vem antes de "Reunião Daily" alfabeticamente.
        agenda.forEach((tarefa, local) -> System.out.println(tarefa + " @ " + local));
    }
}
