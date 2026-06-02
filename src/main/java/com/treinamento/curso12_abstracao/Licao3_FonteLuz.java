package com.treinamento.curso12_abstracao;

/**
 * CURSO 12: Abstração em Java
 * LIÇÃO 3: Criando uma fonte de luz abstrata
 * 
 * CONCEITO:
 * Métodos abstratos podem ser usados dentro de métodos concretos da classe pai. 
 * Isso é conhecido como "Template Method Pattern" simplificado.
 * 
 * DESAFIO:
 * 1. Classe abstrata 'FonteLuz' com método abstrato 'iluminar()'.
 * 2. Método concreto 'ligar()' que chama 'iluminar()'.
 * 3. Subclasse 'Lampada' que implementa o método.
 */
public class Licao3_FonteLuz {

    static abstract class FonteLuz {
        private boolean ligado = false;

        abstract void iluminar();

        public void acionarSwitch() {
            ligado = !ligado;
            if (ligado) iluminar();
            else System.out.println("Luz apagada.");
        }
    }

    static class Lampada extends FonteLuz {
        @Override
        void iluminar() {
            // TODO: Imprimir "Lâmpada brilhando com luz branca."
        }
    }

    public static void main(String[] args) {
        FonteLuz sala = new Lampada();
        sala.acionarSwitch(); // Deve chamar o iluminar()
    }
}
