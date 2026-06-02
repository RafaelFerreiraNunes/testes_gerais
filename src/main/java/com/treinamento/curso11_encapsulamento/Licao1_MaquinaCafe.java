package com.treinamento.curso11_encapsulamento;

/**
 * CURSO 11: Encapsulamento em Java
 * LIÇÃO 1: Encapsulando a máquina de café
 * 
 * CONCEITO:
 * O encapsulamento protege os dados de uma classe, escondendo seus estados internos 
 * e permitindo o acesso apenas através de métodos públicos. 
 * Isso evita que o estado do objeto seja corrompido.
 * 
 * DESAFIO:
 * Implemente os métodos para adicionar água e fazer café. 
 * O nível de água não pode ser acessado diretamente de fora.
 */
public class Licao1_MaquinaCafe {

    static class MaquinaCafe {
        // Atributo privado para proteger o estado interno
        private int nivelAgua; // em ml

        public MaquinaCafe(int nivelInicial) {
            this.nivelAgua = nivelInicial;
        }

        public void adicionarAgua(int quantidade) {
            // TODO: Apenas adicione se a quantidade for positiva
        }

        public boolean fazerCafe() {
            // TODO: Se houver pelo menos 100ml, subtraia 100 e retorne true.
            // Caso contrário, imprima "Sem água" e retorne false.
            return false;
        }

        public int getNivelAgua() {
            return nivelAgua;
        }
    }

    public static void main(String[] args) {
        MaquinaCafe minhaMaquina = new MaquinaCafe(150);
        minhaMaquina.fazerCafe();
        System.out.println("Nível restante: " + minhaMaquina.getNivelAgua()); // 50
        minhaMaquina.adicionarAgua(200);
        System.out.println("Nível após recarga: " + minhaMaquina.getNivelAgua()); // 250
    }
}
