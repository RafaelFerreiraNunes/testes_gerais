package com.treinamento.curso15_design_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 15: Aplicando Padrões de Projeto e POO
 * LIÇÃO 1: Simulação de um editor de documentos (Encapsulamento)
 * 
 * CONCEITO:
 * O encapsulamento não serve apenas para esconder dados, mas para garantir 
 * que a manipulação desses dados siga regras de negócio (ex: não permitir 
 * adicionar texto nulo ou vazio).
 * 
 * DESAFIO:
 * Implemente a classe 'Documento' que mantém uma lista de linhas. 
 * Garanta que o acesso à lista seja restrito e que as modificações 
 * passem pelos métodos de validação.
 */
public class Licao1_EditorDocumento {

    static class Documento {
        // TODO: Tornar privado
        List<String> linhas = new ArrayList<>();

        public void adicionarLinha(String texto) {
            // TODO: Adicionar apenas se texto não for nulo ou vazio
        }

        public void desfazerUltima() {
            // TODO: Remover a última linha se a lista não estiver vazia
        }

        public String getConteudo() {
            // TODO: Retornar todo o conteúdo unido por quebras de linha "\n"
            return "";
        }
    }

    public static void main(String[] args) {
        Documento doc = new Documento();
        doc.adicionarLinha("Olá Mundo!");
        doc.adicionarLinha("Aprendendo POO.");
        
        System.out.println("Conteúdo:\n" + doc.getConteudo());
        
        doc.desfazerUltima();
        System.out.println("Após desfazer:\n" + doc.getConteudo());
    }
}
