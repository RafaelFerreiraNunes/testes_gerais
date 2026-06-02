package com.treinamento.curso16_sistemas_complexos;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 16: Mastering Complex System Design with OOP
 * LIÇÃO 3: Simulação de zoológico (Encapsulamento e Polimorfismo)
 * 
 * CONCEITO:
 * Polimorfismo em métodos de ação. O 'Zoo' interage com a classe base 'Animal', 
 * mas o comportamento de 'comer' e 'falar' varia por espécie.
 * 
 * DESAFIO:
 * Implemente as classes Leao e Girafa. Garanta que o nível de fome (privado) 
 * seja reduzido ao chamar o método 'alimentar()'.
 */
public class Licao3_SimulacaoZoo {

    static abstract class Animal {
        private String nome;
        protected int fome = 100; // 100 = com fome, 0 = satisfeito

        public Animal(String nome) { this.nome = nome; }
        public String getNome() { return nome; }
        
        abstract void emitirSom();
        
        public void alimentar() {
            System.out.println("Alimentando " + nome);
            fome = Math.max(0, fome - 20);
        }
    }

    // TODO: Criar Leao (emitirSom: "Rugido!", alimentar reduz mais a fome)
    
    // TODO: Criar Girafa (emitirSom: "Silêncio...", alimentar reduz menos a fome)

    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        // zoo.add(new Leao("Simba"));
        // zoo.add(new Girafa("Melman"));

        for (Animal a : zoo) {
            a.emitirSom();
            a.alimentar();
        }
    }
}
