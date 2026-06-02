package com.treinamento.curso4_algoritmos_m3;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 3: HashMaps e Agregação de Dados
 * LIÇÃO 2: Maximizando palavras únicas ao remover um caractere
 * 
 * CONCEITO:
 * Problemas que envolvem "remover um elemento para otimizar o resto" 
 * geralmente exigem que contemos a frequência total antes de testar a remoção.
 * 
 * DESAFIO:
 * Dada uma string de palavras separadas por espaço, qual caractere (de 'a' a 'z') 
 * você deve remover para que o número de palavras ÚNICAS restantes seja o máximo possível?
 * Se uma palavra se tornar vazia após a remoção, ela deixa de existir.
 */
public class Licao2_PalavrasUnicas {

    public static void main(String[] args) {
        String s = "aba aca ada"; 
        // Remover 'a' -> "b", "c", "d" (3 únicas)
        // Remover 'b' -> "aa", "aca", "ada" (3 únicas)
        System.out.println("Caractere a remover: " + melhorRemocao(s)); // a
    }

    public static char melhorRemocao(String s) {
        String[] palavras = s.split(" ");
        int maxUnicas = -1;
        char melhorChar = ' ';

        for (char c = 'a'; c <= 'z'; c++) {
            Map<String, Integer> unicas = new HashMap<>();
            for (String p : palavras) {
                // TODO: Remova o caractere 'c' da palavra 'p'
                // TODO: Se a palavra resultante não for vazia, adicione ao mapa de unicas
            }
            
            // TODO: Se unicas.size() > maxUnicas, atualize melhorChar e maxUnicas
        }

        return melhorChar;
    }
}
