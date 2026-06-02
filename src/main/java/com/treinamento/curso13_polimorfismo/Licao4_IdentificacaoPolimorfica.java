package com.treinamento.curso13_polimorfismo;

/**
 * CURSO 13: Polimorfismo em Java
 * LIÇÃO 4: Identificação de formas (instanceof)
 * 
 * CONCEITO:
 * O operador 'instanceof' permite verificar o tipo real de um objeto em tempo de execução 
 * antes de realizar um casting seguro.
 * 
 * DESAFIO:
 * No método 'identificar', use instanceof para dizer se a Forma é um 
 * Circulo ou um Retangulo.
 */
public class Licao4_IdentificacaoPolimorfica {

    static abstract class Forma {}
    static class Circulo extends Forma { void girar() { System.out.println("Girando..."); } }
    static class Retangulo extends Forma { void redimensionar() { System.out.println("Redimensionando..."); } }

    public static void identificar(Forma f) {
        // TODO: 
        // 1. Se for Circulo, imprima "É um Círculo" e chame girar()
        // 2. Se for Retangulo, imprima "É um Retângulo" e chame redimensionar()
    }

    public static void main(String[] args) {
        identificar(new Circulo());
        identificar(new Retangulo());
    }
}
