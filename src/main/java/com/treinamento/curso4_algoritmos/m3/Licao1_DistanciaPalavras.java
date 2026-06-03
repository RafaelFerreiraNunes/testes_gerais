package com.treinamento.curso4_algoritmos.m3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 3: HashMaps e Agregação de Dados
 * LIÇÃO 1: Distância mais curta entre ocorrências de palavras
 * 
 * CONCEITO:
 * Assim como no problema do 'MinimalMaxBlock', podemos usar um HashMap para 
 * rastrear a 'última ocorrência' de um elemento enquanto percorremos a lista. 
 * Isso nos permite calcular distâncias em uma única passagem (O(n)).
 * 
 * DESAFIO:
 * Dada uma lista de palavras, encontre a menor distância entre duas palavras idênticas.
 * Distância é a diferença entre seus índices.
 * 
 * Exemplo: ["java", "python", "java", "ruby", "python"]
 * "java" aparece em 0 e 2 (distância 2)
 * "python" aparece em 1 e 4 (distância 3)
 * Menor distância = 2.
 */
public class Licao1_DistanciaPalavras {

    public static void main(String[] args) {
        List<String> palavras = List.of("pão", "leite", "café", "pão", "manteiga", "café");
        System.out.println("Menor distância: " + menorDistancia(palavras)); // Esperado: 3
    }

    public static int menorDistancia(List<String> palavras) {
        Map<String, Integer> ultimaPosicao = new HashMap<>();
        int min_dist = Integer.MAX_VALUE;

        for (int i = 0; i < palavras.size(); i++) {
            String p = palavras.get(i);
            
            // TODO: Se a palavra já foi vista, calcule a distância (i - ultimaPosicao.get(p))
            // e atualize min_dist se a nova distância for menor.
            
            // TODO: Atualize a última posição da palavra atual.
        }

        return min_dist == Integer.MAX_VALUE ? -1 : min_dist;
    }
}
