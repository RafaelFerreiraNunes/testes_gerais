package com.treinamento.curso4_algoritmos_m3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 3: HashMaps e Agregação de Dados
 * LIÇÃO 3: Particionamento de caracteres em subcadeias
 * 
 * CONCEITO:
 * Este desafio utiliza a técnica de 'Última Ocorrência' para definir fronteiras. 
 * Se um caractere aparece no índice 0 e a última vez no índice 8, 
 * a subcadeia deve ter pelo menos tamanho 9.
 * 
 * DESAFIO:
 * Particione a string no maior número de subcadeias possível de modo que cada 
 * caractere apareça em no máximo uma subcadeia. Retorne o tamanho das subcadeias.
 * 
 * Exemplo: "ababcbacadefegdehijhklij"
 * Saída: [9, 7, 8]
 * Explicação: "ababcbaca", "defegde", "hijhklij"
 */
public class Licao3_ParticionamentoCaracteres {

    public static void main(String[] args) {
        String s = "abacaba"; // "abacaba" (um único bloco pois 'a' está no início e no fim)
        System.out.println("Tamanhos: " + tamanhosSubcadeias(s)); // [7]
        
        String s2 = "abc"; // "a", "b", "c" (cada um é um bloco)
        System.out.println("Tamanhos: " + tamanhosSubcadeias(s2)); // [1, 1, 1]
    }

    public static List<Integer> tamanhosSubcadeias(String s) {
        Map<Character, Integer> ultimaOcorrencia = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ultimaOcorrencia.put(s.charAt(i), i);
        }

        List<Integer> resultado = new ArrayList<>();
        int inicio = 0;
        int fim = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // TODO: Atualize 'fim' para ser o máximo entre 'fim' e a última ocorrência do char atual
            // TODO: Se i == fim, você encontrou o fim de um bloco!
            // Adicione (fim - inicio + 1) ao resultado e atualize inicio = i + 1.
        }

        return resultado;
    }
}
