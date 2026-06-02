package com.treinamento.curso15_design_patterns;

/**
 * CURSO 15: Aplicando Padrões de Projeto e POO
 * LIÇÃO 2: Sistema de reprodução de áudio (POO Básico)
 * 
 * CONCEITO:
 * Uso de classes abstratas para definir o comportamento comum de diferentes 
 * formatos de arquivo de áudio.
 * 
 * DESAFIO:
 * 1. Classe abstrata 'Audio' com campos (titulo, duracao) e método abstrato 'reproduzir()'.
 * 2. Classes 'MP3' e 'WAV' que implementam o método.
 */
public class Licao2_SistemaAudio {

    static abstract class Audio {
        protected String titulo;
        protected int duracao;

        public Audio(String titulo, int duracao) {
            this.titulo = titulo;
            this.duracao = duracao;
        }

        abstract void reproduzir();
    }

    // TODO: Criar classe MP3 (Imprime: "Reproduzindo MP3: [Titulo] em alta compressão")

    // TODO: Criar classe WAV (Imprime: "Reproduzindo WAV: [Titulo] sem perdas")

    public static void main(String[] args) {
        // Audio musica = new MP3("Bohemian Rhapsody", 354);
        // musica.reproduzir();
    }
}
