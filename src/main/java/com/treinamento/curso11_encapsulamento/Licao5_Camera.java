package com.treinamento.curso11_encapsulamento;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 11: Encapsulamento em Java
 * LIÇÃO 5: Encapsulamento com classe de câmera (Desafio Final)
 * 
 * CONCEITO:
 * Encapsulamento em objetos complexos. Uma câmera possui um álbum de fotos. 
 * Não devemos permitir que o álbum seja modificado externamente (read-only access).
 * 
 * DESAFIO:
 * 1. Atributos: modelo, memoriaDisponivel (em MB), fotos (List<String>).
 * 2. tirarFoto(String nome, int tamanho):
 *    - Se houver memória, adiciona no álbum e subtrai da memória.
 * 3. getFotos(): Deve retornar uma CÓPIA da lista (ou uma lista não modificável) 
 *    para que ninguém consiga limpar o álbum de fora usando getFotos().clear().
 */
public class Licao5_Camera {

    static class Camera {
        private String modelo;
        private int memoria;
        private List<String> album = new ArrayList<>();

        public Camera(String modelo, int memoria) {
            this.modelo = modelo;
            this.memoria = memoria;
        }

        public void tirarFoto(String nome, int tamanho) {
            // TODO: Validar memória e adicionar ao album
        }

        public List<String> getFotos() {
            // TODO: Retornar uma nova lista contendo os elementos (List.copyOf ou new ArrayList)
            return null;
        }
        
        public int getMemoriaRestante() {
            return memoria;
        }
    }

    public static void main(String[] args) {
        Camera c = new Camera("Nikon", 500);
        c.tirarFoto("Por do Sol", 50);
        c.tirarFoto("Selfie", 20);
        
        List<String> fotos = c.getFotos();
        // Se o encapsulamento estiver correto, a linha abaixo não deve afetar a câmera:
        if (fotos != null) fotos.clear(); 
        
        System.out.println("Fotos na câmera (deve ter 2): " + c.getFotos().size());
    }
}
