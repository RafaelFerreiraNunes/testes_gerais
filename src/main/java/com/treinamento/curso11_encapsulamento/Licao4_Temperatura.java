package com.treinamento.curso11_encapsulamento;

/**
 * CURSO 11: Encapsulamento em Java
 * LIÇÃO 4: Gerenciando medições de temperatura com segurança
 * 
 * CONCEITO:
 * O encapsulamento permite transformar os dados ao acessá-los. 
 * Podemos armazenar em Celsius e permitir a leitura em Fahrenheit, 
 * mantendo a lógica de conversão oculta.
 * 
 * DESAFIO:
 * Implemente o termômetro.
 * 1. Armazene o valor em Celsius internamente (private).
 * 2. setter setCelsius(double c) deve validar se é maior que o zero absoluto (-273.15).
 * 3. getter getFahrenheit() deve retornar (Celsius * 9/5) + 32.
 */
public class Licao4_Temperatura {

    static class Termometro {
        private double celsius;

        // TODO: Implementar setCelsius com validação
        
        // TODO: Implementar getCelsius
        
        // TODO: Implementar getFahrenheit
    }

    public static void main(String[] args) {
        Termometro t = new Termometro();
        t.setCelsius(25.0);
        System.out.println("Celsius: " + t.getCelsius());
        // System.out.println("Fahrenheit: " + t.getFahrenheit()); // Esperado: 77.0
    }
}
