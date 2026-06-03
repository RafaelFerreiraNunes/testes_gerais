package com.treinamento.curso4_algoritmos.m5;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 5: Técnicas Avançadas de Ordenação e Busca
 * LIÇÃO 3: Subcadeia mais longa com K caracteres distintos
 * 
 * CONCEITO:
 * Este desafio combina a Janela Deslizante (Two Pointers) com um HashMap 
 * para rastrear a frequência dos caracteres dentro da janela.
 * 
 * DESAFIO:
 * Dada uma string e um número K, encontre o comprimento da maior subcadeia 
 * que contém no máximo K caracteres distintos.
 * 
 * Exemplo: "eceba", K=2
 * "ece" (tamanho 3, caracteres: e, c)
 * Saída: 3
 */
public class Licao3_SubcadeiaKDistintos {

    public static void main(String[] args) {
        String s = "araaci";
        int k = 2;
        System.out.println("Max Comprimento: " + maiorSubcadeia(s, k)); // 4 ("araa")
    }

    public static int maiorSubcadeia(String s, int k) {
        int inicio = 0, maxLen = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int fim = 0; fim < s.length(); fim++) {
            char c = s.charAt(fim);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // TODO: Enquanto freq.size() > k:
            // 1. Pegue o char no 'inicio'.
            // 2. Diminua sua frequência no mapa.
            // 3. Se a frequência chegar a 0, remova o char do mapa.
            // 4. Incremente o 'inicio'.
            
            // TODO: Atualize maxLen = Math.max(maxLen, fim - inicio + 1)
        }

        return maxLen;
    }
}
