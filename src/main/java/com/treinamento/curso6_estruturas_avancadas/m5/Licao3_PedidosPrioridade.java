package com.treinamento.curso6_estruturas_avancadas.m5;

import java.util.TreeMap;
import java.util.Map;

/**
 * CURSO 10: Revisão de Estruturas Integradas
 * LIÇÃO 3: Processamento de pedidos baseado em prioridade com TreeMap
 * 
 * CONCEITO:
 * O TreeMap pode atuar como uma "Fila de Prioridade" onde a chave define a urgência.
 * 
 * DESAFIO:
 * O sistema recebe pedidos com um nível de prioridade (Integer).
 * Menor número = Maior prioridade (Ex: 1 é mais urgente que 10).
 * Implemente a função para obter o pedido mais urgente.
 */
public class Licao3_PedidosPrioridade {

    static class GerenciadorPedidos {
        // Chave: Prioridade, Valor: Descrição do Pedido
        private TreeMap<Integer, String> mapaPrioridade = new TreeMap<>();

        public void registrarPedido(int nivel, String desc) {
            mapaPrioridade.put(nivel, desc);
        }

        public String processarMaisUrgente() {
            if (mapaPrioridade.isEmpty()) return null;
            // TODO: Obter e remover a entrada com a MENOR chave (mais urgente)
            // Dica: use pollFirstEntry()
            return "";
        }
    }

    public static void main(String[] args) {
        GerenciadorPedidos gp = new GerenciadorPedidos();
        gp.registrarPedido(5, "Limpeza Geral");
        gp.registrarPedido(1, "VAZAMENTO DE GÁS");
        gp.registrarPedido(3, "Troca de Lâmpada");

        System.out.println("Urgente: " + gp.processarMaisUrgente()); // VAZAMENTO DE GÁS
    }
}
