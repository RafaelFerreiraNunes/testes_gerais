package com.treinamento.curso4_algoritmos_m2;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 2: HashSets e Busca em Tempo Constante
 * LIÇÃO 2: Busca eficiente de corpos celestes
 * 
 * CONCEITO:
 * HashSets são ideais para listas de "proibição" ou "exclusão" e para 
 * filtrar duplicatas instantaneamente.
 * 
 * DESAFIO:
 * Você tem um catálogo de todos os corpos celestes observados. 
 * Implemente um sistema que:
 * 1. Adiciona novos corpos.
 * 2. Remove corpos que se revelaram ser ruído de imagem.
 * 3. Verifica se um corpo específico já foi catalogado.
 */
public class Licao2_BuscaCeleste {

    static class CatalogoCeleste {
        private Set<String> corpos = new HashSet<>();

        public void catalogar(String nome) {
            // TODO: Adicionar ao set
        }

        public void removerRuido(String nome) {
            // TODO: Remover do set
        }

        public boolean jaExiste(String nome) {
            // TODO: Retornar se o set contém o nome
            return false;
        }

        public int totalCorpos() {
            // TODO: Retornar o tamanho do catálogo
            return 0;
        }
    }

    public static void main(String[] args) {
        CatalogoCeleste cat = new CatalogoCeleste();
        cat.catalogar("Marte");
        cat.catalogar("Júpiter");
        cat.catalogar("Estrela X-1");
        cat.removerRuido("Estrela X-1");

        System.out.println("Total: " + cat.totalCorpos()); // 2
        System.out.println("Existe Marte? " + cat.jaExiste("Marte")); // true
    }
}
