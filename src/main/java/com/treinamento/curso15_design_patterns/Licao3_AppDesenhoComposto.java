package com.treinamento.curso15_design_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 15: Aplicando Padrões de Projeto e POO
 * LIÇÃO 3: Aplicativo de desenho composto (Padrão Composite)
 * 
 * CONCEITO:
 * O padrão Composite permite tratar objetos individuais e composições de objetos 
 * de maneira uniforme através de uma interface comum.
 * 
 * DESAFIO:
 * 1. Interface 'Grafico' com método 'desenhar()'.
 * 2. Classes simples: 'Circulo', 'Retangulo'.
 * 3. Classe composta: 'GrupoGrafico' que contém uma lista de Graficos e, 
 *    ao ser desenhada, desenha todos os seus membros.
 */
public class Licao3_AppDesenhoComposto {

    interface Grafico {
        void desenhar();
    }

    static class Circulo implements Grafico {
        @Override
        public void desenhar() { System.out.println("Círculo desenhado."); }
    }

    // TODO: Criar Retangulo

    static class GrupoGrafico implements Grafico {
        private List<Grafico> membros = new ArrayList<>();

        public void adicionar(Grafico g) { membros.add(g); }

        @Override
        public void desenhar() {
            System.out.println("--- Iniciando Grupo ---");
            // TODO: Chamar desenhar() para cada membro
            System.out.println("--- Fim do Grupo ---");
        }
    }

    public static void main(String[] args) {
        GrupoGrafico cena = new GrupoGrafico();
        cena.adicionar(new Circulo());
        // cena.adicionar(new Retangulo());
        
        GrupoGrafico subGrupo = new GrupoGrafico();
        subGrupo.adicionar(new Circulo());
        
        cena.adicionar(subGrupo); // Adicionando um grupo dentro de outro!
        cena.desenhar();
    }
}
