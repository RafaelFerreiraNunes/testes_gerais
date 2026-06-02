package com.treinamento.curso9_custom_treemap;

import java.util.TreeMap;

/**
 * CURSO 9: Custom Objects no TreeMap
 * LIÇÃO 1: Corrigindo o Comparador de Funcionários
 * 
 * CONCEITO:
 * Para usar uma classe personalizada como chave em um TreeMap, ela DEVE 
 * implementar a interface Comparable ou você deve fornecer um Comparator.
 * O método compareTo define a "ordem natural" da classe.
 * 
 * DESAFIO:
 * A classe Funcionario está sendo usada no TreeMap, mas a ordenação por ID 
 * está incorreta ou ausente. Corrija o método compareTo para ordenar pelo id crescente.
 */
public class Licao1_Funcionarios {

    static class Funcionario implements Comparable<Funcionario> {
        private int id;
        private String nome;

        public Funcionario(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        @Override
        public int compareTo(Funcionario outro) {
            // TODO: Implementar comparação por ID (crescente)
            return 0; 
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Nome: " + nome;
        }
    }

    public static void main(String[] args) {
        TreeMap<Funcionario, String> cargos = new TreeMap<>();
        cargos.put(new Funcionario(105, "Rafael"), "Sênior");
        cargos.put(new Funcionario(101, "Ana"), "Diretora");
        cargos.put(new Funcionario(103, "Bruno"), "Pleno");

        // Se o compareTo estiver correto, a saída será 101, 103, 105.
        for (Funcionario f : cargos.keySet()) {
            System.out.println(f);
        }
    }
}
