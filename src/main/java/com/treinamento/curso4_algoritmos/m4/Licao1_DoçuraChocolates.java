package com.treinamento.curso4_algoritmos.m4;

import java.util.Arrays;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 4: Técnica de Dois Ponteiros
 * LIÇÃO 1: Tarefa de Combinação de Doçura de Chocolates
 * 
 * CONCEITO:
 * A técnica de dois ponteiros em um array ordenado permite encontrar pares que 
 * satisfazem uma condição em tempo O(n). Ao mover os ponteiros das extremidades 
 * para o centro, reduzimos o espaço de busca de forma inteligente.
 * 
 * DESAFIO:
 * Você tem uma caixa de chocolates com diferentes níveis de doçura. 
 * Verifique se existem dois chocolates que, somados, resultam em um nível 
 * de doçura 'alvo'. O array já deve ser ordenado para aplicar a técnica.
 */
public class Licao1_DoçuraChocolates {

    public static void main(String[] args) {
        int[] docuras = {1, 2, 4, 7, 11};
        int alvo = 9;
        System.out.println("Par encontrado? " + temCombinacao(docuras, alvo)); // true (2 + 7)
    }

    public static boolean temCombinacao(int[] docuras, int alvo) {
        // Garantindo que está ordenado
        Arrays.sort(docuras);
        
        int esquerda = 0;
        int direita = docuras.length - 1;

        while (esquerda < direita) {
            int soma = docuras[esquerda] + docuras[direita];
            
            // TODO: Se soma == alvo, retorne true.
            // TODO: Se soma < alvo, mova o ponteiro da esquerda para a direita (esquerda++).
            // TODO: Se soma > alvo, mova o ponteiro da direita para a esquerda (direita--).
            
            // Placeholder para evitar loop infinito
            esquerda++; 
        }
        
        return false;
    }
}
