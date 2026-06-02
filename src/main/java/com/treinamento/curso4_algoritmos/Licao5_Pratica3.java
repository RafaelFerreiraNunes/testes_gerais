package com.treinamento.curso4_algoritmos;

import java.util.HashMap;
import java.util.Stack;

/**
 * CURSO 4: Mastering Algorithms
 * LIÇÃO 5: Desafio Final - Validador de Expressões
 * 
 * CONCEITO:
 * Em entrevistas reais, os parênteses não vêm sozinhos. Eles estão misturados 
 * com outros caracteres (letras, números, operadores). O algoritmo deve ignorar 
 * o que não é parêntese.
 * 
 * DESAFIO:
 * Refatore a lógica anterior para ignorar qualquer caractere que não seja 
 * um dos delimitadores: (), [], {}.
 * 
 * Exemplo:
 * "if (x > [y + 1]) { return; }" -> true
 * "((a + b)" -> false
 */
public class Licao5_Pratica3 {

    public static void main(String[] args) {
        String expressao1 = "if (a[0] == {b:1})";
        String expressao2 = "((x + y) * z";
        
        System.out.println("Exp 1 válida: " + isExpressaoValida(expressao1)); // true
        System.out.println("Exp 2 válida: " + isExpressaoValida(expressao2)); // false
    }

    public static boolean isExpressaoValida(String s) {
        // TODO: Implementar a solução completa do zero.
        // Dica: Use a lógica de Stack e HashMap vista anteriormente,
        // mas certifique-se de ignorar caracteres que não estão no seu mapa de pares
        // nem são valores de abertura.
        
        return false;
    }
}
