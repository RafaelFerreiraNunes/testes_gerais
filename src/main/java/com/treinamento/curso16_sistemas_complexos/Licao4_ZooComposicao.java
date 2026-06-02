package com.treinamento.curso16_sistemas_complexos;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 16: Mastering Complex System Design with OOP
 * LIÇÃO 4: Zoo Avançado (Encapsulamento e Composição)
 * 
 * CONCEITO:
 * Um 'Recinto' (Habitat) é composto por Animais. O 'Zoológico' é composto por Recintos. 
 * Hierarquia de composição para organizar o sistema.
 * 
 * DESAFIO:
 * 1. Classe 'Recinto' com lista de Animais e capacidade máxima.
 * 2. Método 'adicionarAnimal(Animal a)' no Recinto que valida se há espaço.
 * 3. Classe 'Zoo' que gerencia múltiplos Recintos.
 */
public class Licao4_ZooComposicao {

    static class Recinto {
        private String tipo; // Ex: "Savana", "Aquário"
        private int capacidade;
        private List<Licao3_SimulacaoZoo.Animal> moradores = new ArrayList<>();

        public Recinto(String tipo, int capacidade) {
            this.tipo = tipo;
            this.capacidade = capacidade;
        }

        public boolean adicionarAnimal(Licao3_SimulacaoZoo.Animal a) {
            // TODO: Se moradores.size() < capacidade, adiciona e retorna true
            return false;
        }
    }

    static class Zoo {
        private List<Recinto> recintos = new ArrayList<>();
        
        public void adicionarRecinto(Recinto r) { recintos.add(r); }
        // TODO: Implementar método para contar total de animais no zoo
    }

    public static void main(String[] args) {
        Zoo meuZoo = new Zoo();
        Recinto savana = new Recinto("Savana", 2);
        
        // savana.adicionarAnimal(new Leao("Mufasa"));
        meuZoo.adicionarRecinto(savana);
    }
}
