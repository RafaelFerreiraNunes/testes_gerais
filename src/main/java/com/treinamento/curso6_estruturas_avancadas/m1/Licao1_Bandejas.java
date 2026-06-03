package com.treinamento.curso6_estruturas_avancadas.m1;

import java.util.Stack;

/**
 * CURSO 6: Advanced Integrated Data Structures
 * LIÇÃO 1: Corrigindo a notificação de remoção de bandejas
 * 
 * CONCEITO:
 * Uma Pilha (Stack) é ideal para modelar objetos empilhados fisicamente.
 * Operações básicas: push (adicionar no topo) e pop (remover do topo).
 * 
 * DESAFIO:
 * No sistema da cafeteria, ao remover uma bandeja, o sistema deve retornar:
 * "Bandeja [COR] removida". 
 * O código atual está removendo a bandeja mas retornando a cor errada ou falhando 
 * quando a pilha está vazia.
 */
public class Licao1_Bandejas {

    public static void main(String[] args) {
        Stack<String> pilhaDeBandejas = new Stack<>();
        pilhaDeBandejas.push("Verde");
        pilhaDeBandejas.push("Azul");
        pilhaDeBandejas.push("Vermelha");

        System.out.println(removerBandeja(pilhaDeBandejas)); // Esperado: Bandeja Vermelha removida
        System.out.println(removerBandeja(pilhaDeBandejas)); // Esperado: Bandeja Azul removida
    }

    public static String removerBandeja(Stack<String> pilha) {
        // TODO: Verifique se a pilha não está vazia.
        // Se estiver vazia, retorne "Nenhuma bandeja disponível".
        // Se não, remova a bandeja do topo e retorne a mensagem formatada.
        
        return ""; 
    }
}
