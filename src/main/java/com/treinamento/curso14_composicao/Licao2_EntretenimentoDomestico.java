package com.treinamento.curso14_composicao;

/**
 * CURSO 14: Composição em Java
 * LIÇÃO 2: Sistema de entretenimento doméstico
 * 
 * CONCEITO:
 * A composição permite delegar tarefas para objetos especializados.
 * 
 * DESAFIO:
 * Crie uma classe 'HomeTheater' composta por 'TV', 'Som' e 'Player'.
 * Implemente o método 'assistirFilme()' que liga todos os componentes.
 */
public class Licao2_EntretenimentoDomestico {

    static class TV { void ligar() { System.out.println("TV Ligada"); } }
    static class Som { void definirVolume(int v) { System.out.println("Volume em " + v); } }
    static class Player { void reproduzir() { System.out.println("Filme iniciando..."); } }

    static class HomeTheater {
        // TODO: Atributos privados (TV, Som, Player)
        
        // TODO: Construtor que inicializa os componentes
        
        public void assistirFilme() {
            // TODO: Ligar TV, definir volume Som para 10, e Player reproduzir
        }
    }

    public static void main(String[] args) {
        // HomeTheater sala = new HomeTheater();
        // sala.assistirFilme();
    }
}
