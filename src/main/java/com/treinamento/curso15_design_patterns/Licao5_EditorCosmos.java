package com.treinamento.curso15_design_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 15: Aplicando Padrões de Projeto e POO
 * LIÇÃO 5: Editor inspirado no Cosmos (Desafio Integrador)
 * 
 * CONCEITO:
 * Integração total de Abstração, Composição e Polimorfismo. 
 * Um 'Layout' pode conter múltiplos 'Componentes'. 
 * Cada componente sabe como se renderizar.
 * 
 * DESAFIO:
 * 1. Interface 'Componente' com método 'renderizar()'.
 * 2. Componentes: 'Botao', 'Imagem', 'Texto'.
 * 3. 'Janela' que possui um título e uma lista de Componentes.
 * 4. Ao chamar 'janela.abrir()', ela imprime o título e renderiza todos os componentes.
 */
public class Licao5_EditorCosmos {

    interface Componente {
        String renderizar();
    }

    // TODO: Criar classe Botao (retorna "[ BOTAO ]")
    
    // TODO: Criar classe Texto (recebe string no construtor, retorna o texto)

    static class Janela {
        private String titulo;
        private List<Componente> componentes = new ArrayList<>();

        public Janela(String titulo) { this.titulo = titulo; }

        public void adicionar(Componente c) { componentes.add(c); }

        public void abrir() {
            System.out.println("=== JANELA: " + titulo + " ===");
            // TODO: Renderizar todos os componentes da lista
        }
    }

    public static void main(String[] args) {
        Janela login = new Janela("Área de Acesso");
        // login.adicionar(new Texto("Digite sua senha:"));
        // login.adicionar(new Botao());
        
        login.abrir();
    }
}
