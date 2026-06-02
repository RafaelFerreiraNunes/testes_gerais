package com.treinamento.curso14_composicao;

/**
 * CURSO 14: Composição em Java
 * LIÇÃO 3: Criando um sistema de computador
 * 
 * CONCEITO:
 * Composição forte vs fraca. Na composição forte (ou Composição propriamente dita), 
 * o objeto pai é responsável pelo ciclo de vida dos filhos.
 * 
 * DESAFIO:
 * 1. Classes: Processador, Memoria, DiscoRigido.
 * 2. Classe Computador composta por esses 3.
 * 3. Método 'status()' que imprime as especificações de cada peça.
 */
public class Licao3_SistemaComputador {

    static class Processador {
        String modelo;
        Processador(String m) { this.modelo = m; }
    }

    static class Memoria {
        int gb;
        Memoria(int g) { this.gb = g; }
    }

    static class DiscoRigido {
        int tb;
        DiscoRigido(int t) { this.tb = t; }
    }

    static class Computador {
        // TODO: Atributos privados
        
        // TODO: Construtor que recebe as especificações e cria os objetos
        
        public void exibirConfiguracao() {
            // TODO: Imprimir as specs
        }
    }

    public static void main(String[] args) {
        // Computador pc = new Computador("i7", 16, 1);
        // pc.exibirConfiguracao();
    }
}
