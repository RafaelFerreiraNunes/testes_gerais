package com.treinamento.curso3_decomposicao.m4;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 4: Tarefas Complexas e Estruturas Aninhadas
 * LIÇÃO 1: Analisando e atualizando JSON aninhado simplificado
 * 
 * CONCEITO:
 * Decompor a análise de formatos complexos (como JSON) exige identificar 
 * delimitadores de hierarquia ({, }, :, ,). 
 * A técnica consiste em ler a string e decidir o destino do dado baseado no contexto.
 * 
 * DESAFIO:
 * Dada uma string que simula um JSON simples: "{"nome":"Rafael","id":123}"
 * 1. Extraia as chaves e valores para um HashMap<String, String>.
 * 2. Atualize o valor de uma chave específica se ela existir.
 */
public class Licao1_JsonAninhado {

    public static void main(String[] args) {
        String json = "{\"nome\":\"Rafael\",\"status\":\"Ativo\"}";
        Map<String, String> dados = parseSimples(json);
        System.out.println("Antes: " + dados);

        atualizar(dados, "status", "Inativo");
        System.out.println("Depois: " + dados);
    }

    public static Map<String, String> parseSimples(String json) {
        Map<String, String> mapa = new HashMap<>();
        // Remove as chaves externas e aspas
        String limpa = json.replace("{", "").replace("}", "").replace("\"", "");
        String[] pares = limpa.split(",");

        for (String par : pares) {
            // TODO: Decompor o par em chave e valor usando o divisor ":"
            // TODO: Colocar no mapa
        }
        return mapa;
    }

    public static void atualizar(Map<String, String> mapa, String chave, String novoValor) {
        // TODO: Se o mapa contiver a chave, atualize seu valor
    }
}
