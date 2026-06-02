package com.treinamento.curso14_composicao;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 14: Composição em Java
 * LIÇÃO 5: Sistema de computador (Agregação vs Composição)
 * 
 * CONCEITO:
 * Agregação é uma forma de composição onde os objetos podem existir 
 * independentemente do objeto pai (ex: Periféricos de um PC).
 * 
 * DESAFIO:
 * 1. O 'Computador' possui componentes fixos (Processador, PlacaMae) - Composição.
 * 2. O 'Computador' possui uma LISTA de periféricos (Teclado, Mouse) - Agregação.
 * 3. Implemente 'conectarPeriferico(Periferico p)'.
 */
public class Licao5_ComputadorAvancado {

    static class PlacaMae { String modelo = "Z590"; }
    
    static class Periferico {
        String nome;
        Periferico(String n) { this.nome = n; }
    }

    static class Computador {
        private PlacaMae placa = new PlacaMae(); // Composição
        private List<Periferico> perifericos = new ArrayList<>(); // Agregação

        public void conectarPeriferico(Periferico p) {
            // TODO: Adicionar à lista
        }

        public void listarTudo() {
            System.out.println("Placa: " + placa.modelo);
            System.out.println("Periféricos:");
            // TODO: Listar nomes dos periféricos
        }
    }

    public static void main(String[] args) {
        Computador gamer = new Computador();
        gamer.conectarPeriferico(new Periferico("Mouse Gamer"));
        gamer.conectarPeriferico(new Periferico("Teclado Mecânico"));
        
        gamer.listarTudo();
    }
}
