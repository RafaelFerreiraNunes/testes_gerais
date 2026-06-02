package com.treinamento.curso13_polimorfismo;

/**
 * CURSO 13: Polimorfismo em Java
 * LIÇÃO 1: Corrigindo o programa de sons de animais
 * 
 * CONCEITO:
 * Polimorfismo de Sobrescrita (Runtime Polymorphism) permite que uma subclasse 
 * forneça uma implementação específica de um método que já é fornecido por sua 
 * classe pai.
 * 
 * DESAFIO:
 * O programa abaixo deveria imprimir sons diferentes para cada animal, 
 * mas o Gato está latindo! Corrija a classe Gato para miar.
 */
public class Licao1_SonsAnimais {

    static class Animal {
        void fazerSom() {
            System.out.println("O animal faz um som");
        }
    }

    static class Cachorro extends Animal {
        @Override
        void fazerSom() {
            System.out.println("Au Au!");
        }
    }

    static class Gato extends Animal {
        @Override
        void fazerSom() {
            // TODO: Corrigir para "Miau!"
            System.out.println("Au Au!"); 
        }
    }

    public static void main(String[] args) {
        Animal meuPet1 = new Cachorro();
        Animal meuPet2 = new Gato();

        meuPet1.fazerSom(); // Esperado: Au Au!
        meuPet2.fazerSom(); // Esperado: Miau!
    }
}
