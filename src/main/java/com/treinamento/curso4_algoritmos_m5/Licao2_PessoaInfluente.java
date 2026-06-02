package com.treinamento.curso4_algoritmos_m5;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 5: Técnicas Avançadas de Ordenação e Busca
 * LIÇÃO 2: Identificando a pessoa mais influente
 * 
 * CONCEITO:
 * Problemas de rede social geralmente envolvem contagem de conexões. 
 * A pessoa mais influente é aquela com o maior "grau de entrada" (in-degree).
 * 
 * DESAFIO:
 * Dada uma lista de pares [A, B] indicando que A segue B, 
 * encontre a pessoa que possui o maior número de seguidores. 
 * Se houver empate, retorne o nome que vem primeiro alfabeticamente.
 */
public class Licao2_PessoaInfluente {

    public static void main(String[] args) {
        String[][] conexoes = {
            {"João", "Maria"},
            {"Ana", "Maria"},
            {"Maria", "João"},
            {"Pedro", "Ana"},
            {"Carlos", "Ana"}
        };
        
        System.out.println("Influencer: " + encontrarInfluencer(conexoes)); // Ana ou Maria?
        // Maria: 2 seguidores (João, Ana)
        // Ana: 2 seguidores (Pedro, Carlos)
        // João: 1 seguidor (Maria)
        // Empate Maria e Ana -> Ana vem antes alfabeticamente.
    }

    public static String encontrarInfluencer(String[][] conexoes) {
        Map<String, Integer> seguidores = new HashMap<>();
        
        // TODO: Passo 1 - Popular o mapa contando quantos seguidores cada pessoa (conexoes[i][1]) tem.
        
        String influencer = "";
        int maxSeguidores = -1;

        // TODO: Passo 2 - Iterar sobre o mapa para encontrar quem tem mais seguidores. 
        // Tratar o critério de desempate alfabético.
        
        return influencer;
    }
}
