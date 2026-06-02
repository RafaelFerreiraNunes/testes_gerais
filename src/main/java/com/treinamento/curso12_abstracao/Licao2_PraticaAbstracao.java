package com.treinamento.curso12_abstracao;

/**
 * CURSO 12: Abstração em Java
 * LIÇÃO 2: Prática de abstração básica
 * 
 * CONCEITO:
 * Abstração foca no "o que" o objeto faz, não no "como". 
 * 'Animal' faz 'emitirSom()', mas cada animal faz de um jeito.
 * 
 * DESAFIO:
 * Implemente a classe 'Cachorro' herdando de 'Animal' e defina o som como "Au Au".
 */
public class Licao2_PraticaAbstracao {

    static abstract class Animal {
        private String nome;
        public Animal(String nome) { this.nome = nome; }
        
        abstract String emitirSom();
        
        public String getNome() { return nome; }
    }

    // TODO: Criar a classe Cachorro que estende Animal
    
    public static void main(String[] args) {
        // Animal dog = new Cachorro("Rex");
        // System.out.println(dog.getNome() + " diz: " + dog.emitirSom());
    }
}
