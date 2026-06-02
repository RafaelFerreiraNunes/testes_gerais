package com.treinamento.curso4_algoritmos;

import java.util.HashMap;
import java.util.Stack;

/**
 * CURSO 4: Mastering Algorithms
 * LIÇÃO 5: Pilhas + HashMaps para Mapeamento de Pares
 * 
 * CONCEITO:
 * Quando lidamos com múltiplos tipos de parênteses (), [], {}, usar vários "if/else" 
 * torna o código sujo. Um HashMap pode mapear o fechamento ao seu respectivo abertura, 
 * tornando a lógica genérica.
 * 
 * DESAFIO:
 * Implementar o balanceamento para (), [] e {}.
 * 
 * CÓDIGO PARCIAL:
 * O mapeamento já foi iniciado. Complete a lógica de verificação.
 */
public class Licao5_Pratica2 {

    public static void main(String[] args) {
        System.out.println("'({[]})' balanceado? " + isParenBalanced("({[]})")); // true
        System.out.println("'({[)}' balanceado? " + isParenBalanced("({[)}"));   // false
    }

    public static boolean isParenBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> pares = new HashMap<>();
        pares.put(')', '(');
        pares.put(']', '[');
        pares.put('}', '{');

        for (char c : s.toCharArray()) {
            // Se for um caractere de ABERTURA
            if (pares.containsValue(c)) {
                stack.push(c);
            } 
            // Se for um caractere de FECHAMENTO
            else if (pares.containsKey(c)) {
                // TODO: 
                // 1. Verifique se a pilha está vazia (erro: fechamento sem abertura).
                // 2. Remova o topo da pilha e compare com o valor esperado do mapa (pares.get(c)).
                // 3. Se não coincidir, retorne false.
            }
        }
        
        return stack.isEmpty();
    }
}
