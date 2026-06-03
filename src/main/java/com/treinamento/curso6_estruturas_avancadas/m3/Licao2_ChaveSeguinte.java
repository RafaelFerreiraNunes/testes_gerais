package com.treinamento.curso6_estruturas_avancadas.m3;

import java.util.TreeMap;

/**
 * CURSO 8: Mapas Ordenados com TreeMap
 * LIÇÃO 2: Chave seguindo entrada específica
 * 
 * CONCEITO:
 * Assim como podemos olhar para trás, podemos olhar para frente no TreeMap.
 * 
 * MÉTODOS CHAVE:
 * - higherKey(K key): Retorna a menor chave estritamente maior que 'key'.
 * - ceilingKey(K key): Retorna a menor chave maior ou igual a 'key'.
 * 
 * DESAFIO:
 * No sistema de estoque, as chaves são IDs de produtos (ex: "ID100", "ID200").
 * Dada uma consulta para um ID, se o ID exato não existir, retorne o próximo ID 
 * disponível que seja maior que ele.
 */
public class Licao2_ChaveSeguinte {

    public static void main(String[] args) {
        TreeMap<String, String> estoque = new TreeMap<>();
        estoque.put("P10", "Teclado");
        estoque.put("P30", "Mouse");
        estoque.put("P50", "Monitor");

        System.out.println("Busca P30: " + buscarProximo(estoque, "P30")); // P30
        System.out.println("Busca P35: " + buscarProximo(estoque, "P35")); // P50
    }

    public static String buscarProximo(TreeMap<String, String> mapa, String id) {
        // TODO: Retorne o ID que seja igual ao pesquisado OU o próximo maior (ceiling).
        return "";
    }
}
