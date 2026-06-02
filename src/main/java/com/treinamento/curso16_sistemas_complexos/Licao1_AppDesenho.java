package com.treinamento.curso16_sistemas_complexos;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 16: Mastering Complex System Design with OOP
 * LIÇÃO 1: Miniaplicativo de desenho (Abstração e Composição)
 * 
 * CONCEITO:
 * O padrão Composite permite que você trate objetos individuais e grupos de objetos 
 * de forma idêntica. Uma "Forma Composta" é uma forma que contém outras formas.
 * 
 * DESAFIO:
 * Implemente a classe 'Desenho' (o composite) que pode conter várias 'Formas'.
 * Adicione um método para calcular a área total do desenho somando as áreas de todas 
 * as formas contidas nele.
 */
public class Licao1_AppDesenho {

    static abstract class Forma {
        abstract void desenhar();
        abstract double calcularArea();
    }

    static class Circulo extends Forma {
        private double raio;
        public Circulo(double raio) { this.raio = raio; }
        @Override void desenhar() { System.out.println("Desenhando Círculo"); }
        @Override double calcularArea() { return Math.PI * raio * raio; }
    }

    static class Retangulo extends Forma {
        private double b, h;
        public Retangulo(double b, double h) { this.b = b; this.h = h; }
        @Override void desenhar() { System.out.println("Desenhando Retângulo"); }
        @Override double calcularArea() { return b * h; }
    }

    static class Desenho extends Forma {
        private List<Forma> formas = new ArrayList<>();

        public void adicionar(Forma f) {
            formas.add(f);
        }

        @Override
        void desenhar() {
            System.out.println("=== Início do Desenho ===");
            // TODO: Chamar desenhar() para cada forma na lista
            System.out.println("=== Fim do Desenho ===");
        }

        @Override
        double calcularArea() {
            // TODO: Calcular e retornar a soma das áreas de todas as formas
            return 0;
        }
    }

    public static void main(String[] args) {
        Desenho meuQuadro = new Desenho();
        meuQuadro.adicionar(new Circulo(5));
        meuQuadro.adicionar(new Retangulo(10, 2));

        meuQuadro.desenhar();
        System.out.println("Área Total: " + meuQuadro.calcularArea());
    }
}
