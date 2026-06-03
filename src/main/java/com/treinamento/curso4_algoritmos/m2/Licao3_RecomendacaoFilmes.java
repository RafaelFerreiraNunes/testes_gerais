package com.treinamento.curso4_algoritmos.m2;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 2: HashSets e Busca em Tempo Constante
 * LIÇÃO 3: Sistema de recomendação de filmes
 * 
 * CONCEITO:
 * Operações de Conjunto (Diferença). Para recomendar algo novo, 
 * pegamos uma lista de sugestões e removemos tudo o que o usuário já viu. 
 * A operação `removeAll` em um HashSet é muito eficiente.
 * 
 * DESAFIO:
 * Dada uma lista de filmes sugeridos e o histórico do usuário, 
 * retorne apenas os filmes que o usuário ainda não viu.
 */
public class Licao3_RecomendacaoFilmes {

    public static void main(String[] args) {
        List<String> sugestoes = List.of("Matrix", "Inception", "Interstellar", "Avatar");
        List<String> historico = List.of("Matrix", "Avatar");

        System.out.println("Recomendações: " + filtrarVistos(sugestoes, historico));
        // Esperado: [Inception, Interstellar]
    }

    public static Set<String> filtrarVistos(List<String> sugestoes, List<String> historico) {
        // TODO: Converta as sugestões para um HashSet para permitir manipulação de conjunto
        Set<String> naoVistos = new HashSet<>(sugestoes);
        
        // TODO: Use o histórico para remover os filmes que o usuário já viu
        // Dica: use o método removeAll() ou um loop com remove()
        
        return naoVistos;
    }
}
