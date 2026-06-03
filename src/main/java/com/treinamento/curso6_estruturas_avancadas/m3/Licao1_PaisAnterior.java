package com.treinamento.curso6_estruturas_avancadas.m3;

import java.util.TreeMap;

/**
 * CURSO 8: Mapas Ordenados com TreeMap
 * LIÇÃO 1: Encontrando o país anterior ao Paquistão
 * 
 * CONCEITO:
 * O `TreeMap` é uma implementação de `Map` que mantém suas chaves em ordem natural 
 * (alfabética para Strings, numérica para números). 
 * Diferente do HashMap, ele permite navegar pelos vizinhos de uma chave.
 * 
 * MÉTODOS CHAVE:
 * - lowerKey(K key): Retorna a maior chave estritamente menor que 'key'.
 * - floorKey(K key): Retorna a maior chave menor ou igual a 'key'.
 * 
 * DESAFIO:
 * Dado um mapa de países e suas populações, encontre qual país vem imediatamente 
 * antes de "Pakistan" na ordem alfabética.
 */
public class Licao1_PaisAnterior {

    public static void main(String[] args) {
        TreeMap<String, Integer> paises = new TreeMap<>();
        paises.put("Brazil", 214);
        paises.put("Pakistan", 231);
        paises.put("Norway", 5);
        paises.put("Zambia", 19);
        paises.put("France", 67);

        String anterior = encontrarAnterior(paises, "Pakistan");
        System.out.println("País antes do Paquistão: " + anterior); // Esperado: Norway (F, N, P...)
    }

    public static String encontrarAnterior(TreeMap<String, Integer> mapa, String alvo) {
        // TODO: Use o método que retorna a chave estritamente menor que o alvo.
        return "";
    }
}
