package com.treinamento.curso4_algoritmos;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 4: Mastering Algorithms: HashMaps, Two Pointers, and Beyond in Java
 * LIÇÃO 3: Janela Deslizante (Sliding Window) com HashMaps
 * 
 * CONCEITO:
 * Sliding Window é usada para sub-arrays ou sub-strings. O HashMap ajuda a rastrear 
 * frequências ou posições dentro dessa "janela".
 * 
 * DESAFIO:
 * Encontre o comprimento da maior sub-string sem caracteres repetidos.
 * 
 * Exemplo:
 * Entrada: "abcabcbb"
 * Saída: 3 (A maior é "abc")
 * 
 * Entrada: "bbbbb"
 * Saída: 1 (A maior é "b")
 */
public class Licao3_Pratica1 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Maior sub-string: " + comprimentoMaiorSubString(s)); // Esperado: 3
    }

    public static int comprimentoMaiorSubString(String s) {
        int n = s.length();
        int maxComprimento = 0;
        // Mapa para guardar o caractere e seu último índice visto
        Map<Character, Integer> mapa = new HashMap<>();

        for (int direita = 0, esquerda = 0; direita < n; direita++) {
            char c = s.charAt(direita);
            
            if (mapa.containsKey(c)) {
                // TODO: Mover o ponteiro 'esquerda' para a direita do índice anterior do caractere
                // para garantir que a janela não tenha duplicatas.
                // esquerda = Math.max(mapa.get(c) + 1, esquerda);
            }
            
            // TODO: Atualizar o mapa com o índice atual do caractere
            // TODO: Calcular maxComprimento (direita - esquerda + 1)
        }
        
        return maxComprimento;
    }
}
