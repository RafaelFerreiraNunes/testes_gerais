package com.treinamento.curso5_eficiencia_m1;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 1: Eficiência com HashMaps
 * LIÇÃO 2: Mapeamento de pontuações de jogadores
 * 
 * CONCEITO:
 * HashMaps permitem agregação e consulta rápida. Quando recebemos múltiplas 
 * consultas (queries), pré-processar os dados em um mapa é muito mais 
 * eficiente do que percorrer a lista para cada consulta.
 * 
 * DESAFIO:
 * Dado uma lista de nomes de jogadores e suas pontuações, e uma lista de 
 * nomes para consulta, retorne a soma das pontuações dos nomes consultados.
 */
public class Licao2_PontuacoesJogadores {

    public static void main(String[] args) {
        String[] jogadores = {"Alice", "Bob", "Alice", "Charlie"};
        int[] pontos = {10, 20, 5, 30};
        String[] consultas = {"Alice", "Charlie"};

        System.out.println("Total: " + calcularTotal(jogadores, pontos, consultas)); // Esperado: 45 (15 de Alice + 30 de Charlie)
    }

    public static int calcularTotal(String[] jogadores, int[] pontos, String[] consultas) {
        Map<String, Integer> pontuacaoTotal = new HashMap<>();
        
        // TODO: Passo 1 - Agregue os pontos de cada jogador no mapa
        
        int totalConsultado = 0;
        // TODO: Passo 2 - Percorra as consultas e some os valores encontrados no mapa
        
        return totalConsultado;
    }
}
