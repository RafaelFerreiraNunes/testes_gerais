package com.treinamento.curso6_estruturas_avancadas.m4;

import java.util.Objects;
import java.util.TreeMap;

/**
 * CURSO 9: Custom Objects no TreeMap
 * LIÇÃO 4: Sistema de Biblioteca com equals e hashCode
 * 
 * CONCEITO:
 * No TreeMap, a consistência entre compareTo e equals é vital. 
 * Se compareTo retornar 0, o TreeMap considera as chaves IGUAIS, 
 * mesmo que equals diga o contrário (embora o ideal seja serem consistentes).
 * 
 * DESAFIO:
 * Crie a classe LivroDetalhado que ordena por autor e depois por título.
 * Implemente equals e hashCode corretamente.
 */
public class Licao4_SistemaBibliotecaCompleto {

    static class LivroDetalhado implements Comparable<LivroDetalhado> {
        private String autor;
        private String titulo;

        public LivroDetalhado(String autor, String titulo) {
            this.autor = autor;
            this.titulo = titulo;
        }

        @Override
        public int compareTo(LivroDetalhado outro) {
            // TODO: Implementar lógica composta
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            // TODO: Gerar equals baseado em autor e titulo
            return false;
        }

        @Override
        public int hashCode() {
            // TODO: Gerar hashCode baseado em autor e titulo
            return 0;
        }

        @Override
        public String toString() { return autor + " - " + titulo; }
    }

    public static void main(String[] args) {
        TreeMap<LivroDetalhado, String> estante = new TreeMap<>();
        estante.put(new LivroDetalhado("Robert Martin", "Clean Code"), "A1");
        estante.put(new LivroDetalhado("Robert Martin", "Clean Architecture"), "A2");
        estante.put(new LivroDetalhado("Joshua Bloch", "Effective Java"), "B1");

        estante.forEach((livro, local) -> System.out.println(livro + " está em: " + local));
    }
}
