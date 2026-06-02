package com.treinamento.curso12_abstracao;

/**
 * CURSO 12: Abstração em Java
 * LIÇÃO 4: Projetando eletrodomésticos com abstração
 * 
 * CONCEITO:
 * Classes abstratas podem ter campos e construtores, que são chamados 
 * via 'super()' nas subclasses.
 * 
 * DESAFIO:
 * Crie a classe 'Geladeira' e 'Microondas' herdando de 'Eletrodomestico'.
 * Ambas devem implementar 'funcionar()'.
 */
public class Licao4_Eletrodomesticos {

    static abstract class Eletrodomestico {
        private String voltagem;

        public Eletrodomestico(String voltagem) {
            this.voltagem = voltagem;
        }

        abstract void funcionar();

        public String getVoltagem() { return voltagem; }
    }

    // TODO: Criar classe Geladeira (imprime: "Resfriando alimentos...")
    
    // TODO: Criar classe Microondas (imprime: "Aquecendo alimentos...")

    public static void main(String[] args) {
        Eletrodomestico g = null; // Instancie uma Geladeira
        Eletrodomestico m = null; // Instancie um Microondas
        
        if (g != null) g.funcionar();
        if (m != null) m.funcionar();
    }
}
