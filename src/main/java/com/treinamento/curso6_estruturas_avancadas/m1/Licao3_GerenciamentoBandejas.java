package com.treinamento.curso6_estruturas_avancadas.m1;

import java.util.Stack;
import java.util.List;

/**
 * CURSO 6: Advanced Integrated Data Structures
 * LIÇÃO 3: Gerenciando sistemas de empilhamento
 * 
 * CONCEITO:
 * Sistemas reais exigem manipulação de múltiplos elementos e transferências.
 * 
 * DESAFIO:
 * Você recebeu um lote de novas bandejas (uma lista). Você deve:
 * 1. Empilhar todas na pilha principal.
 * 2. Se a pilha atingir um limite máximo, as excedentes devem ir para uma "pilha de reserva".
 * 
 * Nesta lição, você deve escrever quase toda a lógica.
 */
public class Licao3_GerenciamentoBandejas {

    public static void main(String[] args) {
        Stack<String> principal = new Stack<>();
        Stack<String> reserva = new Stack<>();
        List<String> novasBandejas = List.of("B1", "B2", "B3", "B4", "B5");
        int limite = 3;

        processarLote(novasBandejas, principal, reserva, limite);
        
        System.out.println("Principal: " + principal.size()); // Esperado: 3
        System.out.println("Reserva: " + reserva.size());     // Esperado: 2
    }

    public static void processarLote(List<String> lote, Stack<String> p, Stack<String> r, int limite) {
        for (String b : lote) {
            // TODO: Implementar lógica de desvio para reserva se atingir o limite
        }
    }
}
