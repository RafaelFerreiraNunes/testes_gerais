package com.treinamento.curso16_sistemas_complexos;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 16: Mastering Complex System Design with OOP
 * LIÇÃO 2: Reprodutor de música (Encapsulamento e Polimorfismo)
 * 
 * CONCEITO:
 * Encapsular a lógica de estado (reproduzindo, pausado) e usar polimorfismo 
 * para diferentes tipos de mídia (Streaming vs Arquivo Local).
 * 
 * DESAFIO:
 * 1. Implemente 'Midia' (abstrata).
 * 2. Crie 'MusicaLocal' e 'StreamingMusica'.
 * 3. O 'Player' deve ter um método 'tocarProxima()' que funciona independente do tipo de mídia.
 */
public class Licao2_ReprodutorMusicaPolimorfico {

    static abstract class Midia {
        private String nome;
        public Midia(String nome) { this.nome = nome; }
        public String getNome() { return nome; }
        abstract void carregar();
    }

    // TODO: Criar MusicaLocal (carregar imprime: "Lendo bytes do disco...")
    
    // TODO: Criar StreamingMusica (carregar imprime: "Conectando ao servidor...")

    static class Player {
        private List<Midia> fila = new ArrayList<>();

        public void adicionarAFila(Midia m) { fila.add(m); }

        public void reproduzirTudo() {
            for (Midia m : fila) {
                System.out.println("Iniciando: " + m.getNome());
                // TODO: Chamar carregar() de cada mídia
            }
        }
    }

    public static void main(String[] args) {
        Player p = new Player();
        // p.adicionarAFila(new MusicaLocal("Song.mp3"));
        // p.adicionarAFila(new StreamingMusica("Spotify Hit"));
        p.reproduzirTudo();
    }
}
