package com.treinamento.curso6_estruturas_avancadas.m1;

import java.util.Stack;

/**
 * CURSO 6: Advanced Integrated Data Structures
 * LIÇÃO 5: Avaliando a Notação Polonesa Inversa (RPN)
 * 
 * CONCEITO:
 * Na RPN, os operadores seguem seus operandos. 
 * Exemplo: "3 4 +" é o mesmo que "3 + 4". 
 * Vantagem: Não precisa de parênteses para definir precedência.
 * 
 * LOGICA:
 * 1. Se for número, empilha.
 * 2. Se for operador (+, -, *, /), desempilha dois números, aplica a operação 
 *    e empilha o resultado.
 * 
 * DESAFIO:
 * Calcule o resultado da expressão RPN.
 * Entrada: ["2", "1", "+", "3", "*"] -> (2 + 1) * 3 = 9
 */
public class Licao5_RPN {

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println("Resultado RPN: " + avaliarRPN(tokens)); // Esperado: 9
    }

    public static int avaliarRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {
            if (isOperador(t)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(aplicarOperacao(a, b, t));
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }

    private static boolean isOperador(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private static int aplicarOperacao(int a, int b, String op) {
        // TODO: Implementar switch case para +, -, *, /
        return 0;
    }
}
