package com.treinamento.curso5_eficiencia.m5;

import java.util.*;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 5: Estruturas Ordenadas e Consultas Eficientes
 * LIÇÃO 2: Processamento de operações distintas
 * 
 * CONCEITO:
 * Uso de TreeSet para gerenciar estados e responder consultas de existência 
 * e vizinhança simultaneamente.
 * 
 * DESAFIO:
 * Processe uma lista de operações:
 * [0, x]: Adiciona x. Retorna o tamanho do set.
 * [1, x]: Remove x. Retorna o tamanho do set.
 * [2, x]: Retorna o maior elemento estritamente menor que x (higher/lower).
 */
public class Licao2_OperacoesConjunto {

    public static void main(String[] args) {
        List<int[]> ops = Arrays.asList(
            new int[]{0, 50},
            new int[]{0, 20},
            new int[]{0, 80},
            new int[]{2, 50} // Deve retornar 20
        );
        
        System.out.println(executar(ops));
    }

    public static List<Integer> executar(List<int[]> consultas) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> res = new ArrayList<>();

        for (int[] q : consultas) {
            int op = q[0];
            int val = q[1];

            // TODO: Implementar lógica de adicionar, remover e buscar o vizinho 'lower'
        }
        return res;
    }
}
