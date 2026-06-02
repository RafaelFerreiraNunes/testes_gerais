package com.treinamento.curso16_sistemas_complexos;

/**
 * CURSO 16: Mastering Complex System Design with OOP
 * LIÇÃO 5: Mini Reprodutor (Abstração e Composição - Desafio Final)
 * 
 * CONCEITO:
 * Um 'Dispositivo' tem um 'Hardware' (Auto-falante) e um 'Software' (AppMusica). 
 * O AppMusica usa Mídias. Integração completa de Abstração, Composição e Polimorfismo.
 * 
 * DESAFIO:
 * 1. O 'Hardware' (AutoFalante) tem um método 'emitirSom(String dados)'.
 * 2. O 'AppMusica' contém uma lista de 'Midia' (da lição 2).
 * 3. Implemente o método 'play(int index)' no AppMusica que:
 *    - Obtém a mídia.
 *    - Carrega os dados.
 *    - Envia para o Hardware emitir o som.
 */
public class Licao5_MiniPlayerMusica {

    static class AutoFalante {
        void emitirSom(String dados) {
            System.out.println("[SAÍDA DE ÁUDIO]: " + dados);
        }
    }

    static class AppMusica {
        private AutoFalante hardware;
        // private List<Midia> biblioteca = new ArrayList<>();

        public AppMusica(AutoFalante hw) {
            this.hardware = hw;
        }

        // TODO: Adicionar métodos para gerenciar biblioteca e dar play
    }

    public static void main(String[] args) {
        AutoFalante jbl = new AutoFalante();
        AppMusica player = new AppMusica(jbl);
        
        // player.adicionar(new MusicaLocal("Rock.mp3"));
        // player.play(0);
    }
}
