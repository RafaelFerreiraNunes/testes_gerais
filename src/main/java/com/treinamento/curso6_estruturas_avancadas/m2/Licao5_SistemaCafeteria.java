package com.treinamento.curso6_estruturas_avancadas.m2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CURSO 7: Filas e Deques em Java
 * LIÇÃO 5: Sistema de Gerenciamento de Pedidos (Cafeteria)
 * 
 * CONCEITO:
 * Uso avançado de Deque para simular um fluxo de trabalho real onde pedidos podem ser 
 * cancelados (removidos do fim) ou priorizados.
 * 
 * DESAFIO:
 * Implemente o gerenciador de pedidos:
 * 1. `novoPedido(String item)`: Adiciona ao fim da fila.
 * 2. `cancelarUltimo()`: Remove o último pedido feito (o cliente desistiu antes de começar).
 * 3. `atenderProximo()`: Remove e retorna o primeiro pedido da fila.
 * 4. `pedidoPrioritario(String item)`: Adiciona ao início da fila.
 */
public class Licao5_SistemaCafeteria {

    private Deque<String> pedidos = new ArrayDeque<>();

    public void novoPedido(String item) {
        // TODO
    }

    public void pedidoPrioritario(String item) {
        // TODO
    }

    public String cancelarUltimo() {
        // TODO: Remova do fim e retorne "Cancelado: [item]". Se vazio, "Sem pedidos".
        return "";
    }

    public String atenderProximo() {
        // TODO: Remova do início e retorne "Servindo: [item]". Se vazio, "Sem pedidos".
        return "";
    }

    public static void main(String[] args) {
        Licao5_SistemaCafeteria sistema = new Licao5_SistemaCafeteria();
        
        sistema.novoPedido("Café Preto");
        sistema.novoPedido("Latte");
        sistema.pedidoPrioritario("Cappuccino VIP");
        
        System.out.println(sistema.atenderProximo()); // Cappuccino VIP
        System.out.println(sistema.cancelarUltimo());  // Latte
        System.out.println(sistema.atenderProximo()); // Café Preto
    }
}
