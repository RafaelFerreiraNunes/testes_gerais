package com.treinamento.curso3_decomposicao_m1;

import java.util.*;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 1: Processamento de Dados e Timestamps
 * LIÇÃO 2: Analisar registros de competição
 * 
 * CONCEITO:
 * Converter horários (HH:MM) para uma unidade única (minutos ou segundos) 
 * facilita o cálculo de durações e intervalos.
 * 
 * DESAFIO:
 * Registros: "ID_ATLETA INICIO_FIM" (Ex: "1 09:00-09:45").
 * Calcule quantos minutos cada atleta competiu.
 */
public class Licao2_RegistrosCompeticao {

    public static void main(String[] args) {
        String[] registros = {"1 08:30-09:00", "2 10:00-11:00", "1 14:00-14:30"};
        Map<Integer, Integer> tempos = analisar(registros);
        System.out.println(tempos);
        // Esperado: {1=60, 2=60}
    }

    public static Map<Integer, Integer> analisar(String[] registros) {
        Map<Integer, Integer> totais = new HashMap<>();

        for (String reg : registros) {
            String[] partes = reg.split(" ");
            int id = Integer.parseInt(partes[0]);
            String[] horario = partes[1].split("-");
            
            int duracao = calcularDiferenca(horario[0], horario[1]);
            // TODO: Acumular a duracao no mapa para o atleta 'id'
        }
        return totais;
    }

    private static int calcularDiferenca(String inicio, String fim) {
        // TODO: Decompor HH:MM em minutos totais e retornar a diferença (fim - inicio)
        return 0;
    }
}
