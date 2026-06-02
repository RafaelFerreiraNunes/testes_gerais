package com.treinamento.curso14_composicao;

/**
 * CURSO 14: Composição em Java
 * LIÇÃO 1: Corrigindo a composição do carro elétrico
 * 
 * CONCEITO:
 * Composição é o princípio de design "Has-A" (Tem um). Em vez de herdar comportamentos, 
 * uma classe é composta por outras classes menores. Isso aumenta a flexibilidade.
 * 
 * DESAFIO:
 * Um CarroEletrico deve ter um 'MotorEletrico' e uma 'Bateria'. 
 * O código atual está tentando usar um 'MotorCombustao' por engano. 
 * Corrija a composição para que o carro use os componentes corretos.
 */
public class Licao1_CarroEletrico {

    static class MotorEletrico {
        void rodar() { System.out.println("Motor elétrico silêncioso rodando."); }
    }

    static class Bateria {
        void consumir() { System.out.println("Consumindo carga da bateria."); }
    }

    static class CarroEletrico {
        private MotorEletrico motor;
        private Bateria bateria;

        public CarroEletrico() {
            // TODO: Inicialize o motor e a bateria corretamente
            this.motor = null; 
            this.bateria = null;
        }

        public void dirigir() {
            if (motor != null && bateria != null) {
                bateria.consumir();
                motor.rodar();
            } else {
                System.out.println("Carro incompleto!");
            }
        }
    }

    public static void main(String[] args) {
        CarroEletrico tesla = new CarroEletrico();
        tesla.dirigir();
    }
}
