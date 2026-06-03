package com.treinamento.curso3_decomposicao.m1;

import java.util.*;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 1: Processamento de Dados e Timestamps
 * LIÇÃO 1: Organizar e-mails da caixa de entrada
 * 
 * CONCEITO:
 * O primeiro passo na análise de dados brutos é a separação e categorização. 
 * Usamos String.split() e estruturas de mapeamento para agrupar informações.
 * 
 * DESAFIO:
 * Você receberá uma string de e-mails no formato "remetente:assunto, remetente:assunto".
 * Agrupe os assuntos por remetente em um Map<String, List<String>>.
 */
public class Licao1_OrganizarEmails {

    public static void main(String[] args) {
        String dados = "joao:reuniao, maria:projeto, joao:almoco";
        Map<String, List<String>> organizados = organizar(dados);
        System.out.println(organizados);
        // Esperado: {joao=[reuniao, almoco], maria=[projeto]}
    }

    public static Map<String, List<String>> organizar(String entrada) {
        Map<String, List<String>> mapa = new HashMap<>();
        String[] partes = entrada.split(", ");

        for (String item : partes) {
            // TODO: Decompor o item em remetente e assunto usando split(":")
            // TODO: Adicionar o assunto na lista correspondente ao remetente no mapa
        }

        return mapa;
    }
}
