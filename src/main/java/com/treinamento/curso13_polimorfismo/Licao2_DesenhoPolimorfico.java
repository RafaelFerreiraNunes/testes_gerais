package com.treinamento.curso13_polimorfismo;

/**
 * CURSO 13: Polimorfismo em Java
 * LIÇÃO 2: Implementando o método de desenho polimórfico
 * 
 * CONCEITO:
 * Polimorfismo permite tratar diferentes objetos de forma uniforme. 
 * Uma lista de 'Forma' pode conter Círculos e Quadrados, e todos podem ser "desenhados".
 * 
 * DESAFIO:
 * Implemente o método 'desenhar()' nas subclasses Quadrado e Triangulo.
 */
public class Licao2_DesenhoPolimorfico {

    static abstract class Forma {
        abstract void desenhar();
    }

    static class Quadrado extends Forma {
        // TODO: Sobrescrever desenhar() imprimindo "Desenhando um Quadrado"
        @Override
        void desenhar() {}
    }

    static class Triangulo extends Forma {
        // TODO: Sobrescrever desenhar() imprimindo "Desenhando um Triângulo"
        @Override
        void desenhar() {}
    }

    public static void main(String[] args) {
        Forma[] formas = {new Quadrado(), new Triangulo()};
        
        for (Forma f : formas) {
            f.desenhar();
        }
    }
}
