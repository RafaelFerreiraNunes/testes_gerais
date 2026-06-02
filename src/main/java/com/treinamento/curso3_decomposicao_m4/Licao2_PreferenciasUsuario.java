package com.treinamento.curso3_decomposicao_m4;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 4: Tarefas Complexas e Estruturas Aninhadas
 * LIÇÃO 2: Atualizando as preferências do usuário
 * 
 * CONCEITO:
 * Estruturas aninhadas (Mapa de Mapas) são úteis para agrupar preferências por categoria.
 * Ex: {"notificacoes" -> {"email" -> "on", "push" -> "off"}}
 * 
 * DESAFIO:
 * Receba uma string no formato "CATEGORIA{CHAVE=VALOR,CHAVE=VALOR}".
 * 1. Parseie para um Map<String, Map<String, String>>.
 * 2. Crie um método para atualizar uma CHAVE independente da CATEGORIA.
 */
public class Licao2_PreferenciasUsuario {

    public static void main(String[] args) {
        String dados = "SISTEMA{tema=escuro,idioma=pt},APPS{twitter=off}";
        Map<String, Map<String, String>> prefs = parseComplexo(dados);
        
        System.out.println("Antes: " + prefs);
        atualizarGlobal(prefs, "tema", "claro");
        System.out.println("Depois: " + prefs);
    }

    public static Map<String, Map<String, String>> parseComplexo(String entrada) {
        Map<String, Map<String, String>> resultado = new HashMap<>();
        // TODO: Implementar lógica de decomposição:
        // 1. Separar por categoria (antes do '{')
        // 2. Extrair o conteúdo entre '{' e '}'
        // 3. Separar chaves e valores internos por '=' e ','
        return resultado;
    }

    public static void atualizarGlobal(Map<String, Map<String, String>> mapa, String chave, String valor) {
        // TODO: Percorrer todos os mapas internos. 
        // Se algum contiver a 'chave', atualize o 'valor' e pare.
    }
}
