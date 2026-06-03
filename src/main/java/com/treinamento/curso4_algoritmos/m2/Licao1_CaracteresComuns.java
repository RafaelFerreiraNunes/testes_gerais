package com.treinamento.curso4_algoritmos.m2;

import java.util.HashSet;
import java.util.Set;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 2: HashSets e Busca em Tempo Constante
 * LIÇÃO 1: Tarefa de Extração de Caracteres Comuns
 * 
 * CONCEITO:
 * Encontrar elementos comuns entre duas coleções usando loops aninhados é O(N * M).
 * Ao usar um HashSet para armazenar a primeira coleção, podemos verificar cada elemento 
 * da segunda coleção em O(1), tornando o processo O(N + M).
 * 
 * DESAFIO:
 * Dadas duas strings, retorne um Set contendo apenas os caracteres que aparecem em ambas.
 */
public class Licao1_CaracteresComuns {

    public static void main(String[] args) {
        String s1 = "brasil";
        String s2 = "argentina";
        
        System.out.println("Letras comuns: " + extrairComuns(s1, s2)); // Esperado: [a, i, r, n] (ordem varia)
    }

    public static Set<Character> extrairComuns(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        // TODO: Adicionar todos os caracteres de s1 ao set1
        
        Set<Character> resultado = new HashSet<>();
        // TODO: Percorrer s2 e, se o caractere estiver no set1, adicionar ao resultado
        
        return resultado;
    }
}
