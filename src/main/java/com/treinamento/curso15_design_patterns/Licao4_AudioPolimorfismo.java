package com.treinamento.curso15_design_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 15: Aplicando Padrões de Projeto e POO
 * LIÇÃO 4: Sistema de reprodução de áudio (Polimorfismo e Injeção)
 * 
 * CONCEITO:
 * Polimorfismo permite que o 'Player' funcione com qualquer tipo de 'Audio' 
 * sem saber os detalhes de implementação de cada formato.
 * 
 * DESAFIO:
 * Implemente a classe 'Playlist' que armazena objetos do tipo 'Audio' 
 * e possui um método 'tocarTodas()'.
 */
public class Licao4_AudioPolimorfismo {

    static abstract class Audio {
        String titulo;
        Audio(String t) { this.titulo = t; }
        abstract void reproduzir();
    }

    static class Podcast extends Audio {
        Podcast(String t) { super(t); }
        @Override void reproduzir() { System.out.println("Ouvindo Podcast: " + titulo); }
    }

    static class Musica extends Audio {
        Musica(String t) { super(t); }
        @Override void reproduzir() { System.out.println("Ouvindo Música: " + titulo); }
    }

    static class Playlist {
        // TODO: Atributo Lista de Audio
        
        // TODO: Método adicionar
        
        public void tocarTodas() {
            // TODO: Percorrer a lista chamando reproduzir()
        }
    }

    public static void main(String[] args) {
        Playlist minhaLista = new Playlist();
        minhaLista.adicionar(new Musica("Beat It"));
        minhaLista.adicionar(new Podcast("Tech News"));
        
        minhaLista.tocarTodas();
    }
}
