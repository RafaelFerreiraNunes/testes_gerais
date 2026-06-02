package com.treinamento.curso12_abstracao;

/**
 * CURSO 12: Abstração em Java
 * LIÇÃO 1: Corrigindo a identificação do tipo de combustível
 * 
 * CONCEITO:
 * Classes abstratas definem um "contrato" para as subclasses. 
 * Elas não podem ser instanciadas diretamente, mas obrigam as filhas 
 * a implementar métodos marcados como 'abstract'.
 * 
 * DESAFIO:
 * Temos uma classe abstrata 'Veiculo'. O 'CarroEletrico' está herdando dela, 
 * mas o método 'getTipoCombustivel' está retornando "Gasolina". 
 * Corrija a implementação para retornar "Eletricidade".
 */
public class Licao1_CarrosEletricos {

    static abstract class Veiculo {
        abstract String getTipoCombustivel();
        
        void ligar() {
            System.out.println("Veículo ligado.");
        }
    }

    static class CarroEletrico extends Veiculo {
        @Override
        String getTipoCombustivel() {
            // TODO: Corrigir o retorno
            return "Gasolina";
        }
    }

    public static void main(String[] args) {
        Veiculo meuTesla = new CarroEletrico();
        System.out.println("Combustível: " + meuTesla.getTipoCombustivel()); // Esperado: Eletricidade
    }
}
