package com.treinamento.curso5_eficiencia.m5;

import java.util.TreeSet;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 5: Estruturas Ordenadas e Consultas Eficientes
 * LIÇÃO 3: Consultas de intervalo eficientes (subSet)
 * 
 * CONCEITO:
 * O método `subSet(from, to)` do TreeSet retorna uma "view" dos elementos 
 * dentro de um intervalo. Isso permite contar ou processar elementos 
 * em um range específico de forma extremamente rápida.
 * 
 * DESAFIO:
 * Dado um conjunto de IDs de usuários ativos, responda: 
 * "Quantos usuários com IDs entre minID e maxID estão online no momento?"
 */
public class Licao3_IntervalosEficientes {

    public static void main(String[] args) {
        TreeSet<Integer> idsOnline = new TreeSet<>();
        idsOnline.add(101);
        idsOnline.add(205);
        idsOnline.add(300);
        idsOnline.add(450);
        idsOnline.add(510);

        System.out.println("Usuários entre 200 e 500: " + contarNoRange(idsOnline, 200, 500));
        // Esperado: 3 (205, 300, 450)
    }

    public static int contarNoRange(TreeSet<Integer> set, int min, int max) {
        // TODO: Use set.subSet(min, true, max, true) para obter o intervalo inclusive.
        // Retorne o tamanho (size) desse sub-conjunto.
        return 0;
    }
}
