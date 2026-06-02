package com.treinamento.curso13_polimorfismo;

/**
 * CURSO 13: Polimorfismo em Java
 * LIÇÃO 3: Polimorfismo estático (Sobrecarga de Métodos)
 * 
 * CONCEITO:
 * Polimorfismo de Sobrecarga (Compile-time Polymorphism) ocorre quando 
 * vários métodos têm o mesmo nome, mas parâmetros diferentes (tipo ou quantidade).
 * 
 * DESAFIO:
 * Implemente sobrecargas para o método 'pintar':
 * 1. pintar(String cor): Imprime "Pintando com a cor [cor]"
 * 2. pintar(String cor, int camadas): Imprime "Pintando com [cor] por [camadas] vezes"
 */
public class Licao3_PintandoFormas {

    static class Pincel {
        // TODO: Implementar método pintar com 1 parâmetro
        
        // TODO: Implementar método pintar com 2 parâmetros
    }

    public static void main(String[] args) {
        Pincel p = new Pincel();
        // p.pintar("Azul");
        // p.pintar("Vermelho", 3);
    }
}
