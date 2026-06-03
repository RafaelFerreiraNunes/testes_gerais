package com.treinamento.curso6_estruturas_avancadas.m3;

import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

/**
 * CURSO 8: Mapas Ordenados com TreeMap
 * LIÇÃO 4: Rastreamento de pontuações (Leaderboard)
 * 
 * CONCEITO:
 * Podemos inverter a ordem natural do TreeMap usando um Comparator.
 * TreeMap<Integer, String> com Collections.reverseOrder() mantém a maior pontuação no topo.
 * 
 * DESAFIO:
 * Crie um ranking onde a chave é a pontuação (Integer) e o valor é o nome do jogador.
 * Implemente as funções para:
 * 1. Adicionar pontuação.
 * 2. Obter o campeão (maior pontuação).
 * 3. Obter o último colocado.
 */
public class Licao4_PontuacoesTreeMap {

    // TreeMap configurado para ordem decrescente (maior para menor)
    private TreeMap<Integer, String> ranking = new TreeMap<>(Collections.reverseOrder());

    public void adicionar(int pontos, String nome) {
        ranking.put(pontos, nome);
    }

    public String getCampeao() {
        // TODO: Retorne o nome do jogador com a maior pontuação
        // Se a ordem é reversa, a maior pontuação é a firstKey().
        return "";
    }

    public String getLanterna() {
        // TODO: Retorne o nome do jogador com a menor pontuação
        return "";
    }

    public static void main(String[] args) {
        Licao4_PontuacoesTreeMap torneio = new Licao4_PontuacoesTreeMap();
        torneio.adicionar(1500, "Rafael");
        torneio.adicionar(2800, "Ana");
        torneio.adicionar(900, "Bruno");

        System.out.println("Campeão: " + torneio.getCampeao());   // Ana
        System.out.println("Lanterna: " + torneio.getLanterna()); // Bruno
    }
}
