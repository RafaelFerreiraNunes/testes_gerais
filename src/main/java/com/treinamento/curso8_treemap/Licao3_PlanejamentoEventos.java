package com.treinamento.curso8_treemap;

import java.util.TreeMap;
import java.util.Map;

/**
 * CURSO 8: Mapas Ordenados com TreeMap
 * LIÇÃO 3: Planejamento de eventos com TreeMap
 * 
 * CONCEITO:
 * TreeMap é excelente para séries temporais ou horários, pois as chaves numéricas 
 * (ou Strings de data ISO) ficam ordenadas cronologicamente.
 * 
 * DESAFIO:
 * Um sistema de agenda precisa saber qual foi o ÚLTIMO evento do dia e o 
 * PRIMEIRO evento do dia seguinte.
 */
public class Licao3_PlanejamentoEventos {

    public static void main(String[] args) {
        TreeMap<String, String> agenda = new TreeMap<>();
        agenda.put("08:00", "Café");
        agenda.put("12:00", "Almoço");
        agenda.put("18:00", "Academia");
        agenda.put("22:00", "Leitura");

        System.out.println("Primeiro: " + agenda.firstKey());
        System.out.println("Último: " + agenda.lastKey());
        
        // TODO: Remova o primeiro evento da agenda e retorne o nome dele.
        String primeiroNome = removerPrimeiro(agenda);
        System.out.println("Removido: " + primeiroNome); // Café
    }

    public static String removerPrimeiro(TreeMap<String, String> agenda) {
        if (agenda.isEmpty()) return null;
        // Dica: use pollFirstEntry() para obter e remover ao mesmo tempo.
        return "";
    }
}
