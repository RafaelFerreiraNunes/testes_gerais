package com.treinamento.curso5_eficiencia_m3;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 3: Raciocínio Combinatório e Contagem Eficiente
 * LIÇÃO 3: Número de maneiras de formar combinações de 3 letras
 * 
 * CONCEITO:
 * Problemas de combinações de 3 ou mais elementos seguem a mesma lógica: 
 * Contagem e Frequência. 
 * Se temos N itens, o número de trios (combinações de 3) é N * (N - 1) * (N - 2) / 6.
 * 
 * DESAFIO:
 * Dada uma string, conte quantos trios de índices (i, j, k) com i < j < k 
 * existem tais que s.charAt(i) == s.charAt(j) == s.charAt(k).
 */
public class Licao3_CombinacoesLetras {

    public static void main(String[] args) {
        String s = "aaaaa"; // 5 letras 'a'
        System.out.println("Trios idênticos: " + contarTrios(s)); 
        // Esperado: 5 * 4 * 3 / 6 = 10
    }

    public static long contarTrios(String s) {
        Map<Character, Long> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0L) + 1);
        }

        long totalTrios = 0;
        for (long k : freq.values()) {
            if (k >= 3) {
                // TODO: Aplicar a fórmula de combinação C(k, 3) = k * (k-1) * (k-2) / 6
            }
        }
        
        return totalTrios;
    }
}
