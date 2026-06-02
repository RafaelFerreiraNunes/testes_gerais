package com.treinamento.curso11_encapsulamento;

/**
 * CURSO 11: Encapsulamento em Java
 * LIÇÃO 2: Consertar o encapsulamento da torradeira
 * 
 * CONCEITO:
 * Atributos públicos permitem que qualquer parte do código altere valores 
 * de forma inválida (ex: intensidade de tostagem negativa ou absurda).
 * 
 * DESAFIO:
 * Torne os atributos privados e crie um método setter 'setIntensidade' 
 * que valide se o valor está entre 1 e 5.
 */
public class Licao2_Torradeira {

    static class Torradeira {
        // TODO: Mudar para privado
        public int intensidade; 

        public Torradeira() {
            this.intensidade = 1; // Valor padrão
        }

        // TODO: Criar o método setIntensidade(int valor) com validação
        
        public void torrar() {
            System.out.println("Torrando na intensidade: " + intensidade);
        }
    }

    public static void main(String[] args) {
        Torradeira t = new Torradeira();
        // Atualmente permite isso (ERRO):
        t.intensidade = -10; 
        t.torrar();
        
        // O objetivo é que após o conserto, usemos:
        // t.setIntensidade(3);
    }
}
