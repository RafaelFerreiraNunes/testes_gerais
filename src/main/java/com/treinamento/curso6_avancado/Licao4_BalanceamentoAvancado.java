package com.treinamento.curso6_avancado;

import java.util.Stack;
import java.util.HashMap;

/**
 * CURSO 6: Advanced Integrated Data Structures
 * LIÇÃO 4: Balanceamento de parênteses com tipos variados
 * 
 * CONCEITO:
 * Aplicação prática de Pilha + Mapa para resolver problemas de sintaxe.
 * 
 * DESAFIO:
 * Implemente o validador para (), [] e {} garantindo que a ordem de fechamento
 * respeite a ordem de abertura.
 */
public class Licao4_BalanceamentoAvancado {

    public static void main(String[] args) {
        String code = "public void test() { int[] a = {1, 2}; }";
        System.out.println("Código válido? " + isBalanced(code)); // true
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        // Mapeamento de fechamento -> abertura
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        // TODO: Implementar lógica completa de balanceamento
        // Ignorar caracteres que não estão no mapa ou não são aberturas
        
        return false; 
    }
}
