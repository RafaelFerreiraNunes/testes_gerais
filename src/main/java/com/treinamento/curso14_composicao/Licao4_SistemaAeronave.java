package com.treinamento.curso14_composicao;

/**
 * CURSO 14: Composição em Java
 * LIÇÃO 4: Montagem de um sistema de aeronave
 * 
 * CONCEITO:
 * Composição em cascata. Um objeto pode ser composto por objetos que, 
 * por sua vez, também são compostos por outros.
 * 
 * DESAFIO:
 * Monte um 'Aviao'.
 * - O 'Aviao' tem uma 'Asa'.
 * - A 'Asa' tem uma 'Turbina'.
 * - Implemente o método 'decolar()' no Aviao que chama 'acionar()' na Asa, 
 *   que por sua vez chama 'ignicao()' na Turbina.
 */
public class Licao4_SistemaAeronave {

    static class Turbina {
        void ignicao() { System.out.println("Turbina rugindo!"); }
    }

    static class Asa {
        private Turbina turbina = new Turbina();
        void acionar() { 
            System.out.println("Asa ajustando flaps...");
            turbina.ignicao();
        }
    }

    static class Aviao {
        // TODO: Compor com Asa
        
        public void decolar() {
            System.out.println("Iniciando procedimentos de decolagem...");
            // TODO: Chamar acionar() da Asa
        }
    }

    public static void main(String[] args) {
        Aviao jato = new Aviao();
        jato.decolar();
    }
}
