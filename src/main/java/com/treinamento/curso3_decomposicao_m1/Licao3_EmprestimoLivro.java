package com.treinamento.curso3_decomposicao_m1;

import java.util.*;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 1: Processamento de Dados e Timestamps
 * LIÇÃO 3: Duração mais longa do empréstimo de um livro
 * 
 * CONCEITO:
 * Problemas de "estado" (criado/deletado, retirado/devolvido) exigem o uso 
 * de dois mapas: um para rastrear o estado ATIVO e outro para acumular o TOTAL.
 * 
 * DESAFIO:
 * Logs: "LIVRO_ID ACAO HORA" (Ex: "101 pegou 10:00").
 * Calcule qual livro ficou mais tempo emprestado no total. 
 * Retorne o ID e a duração formatada em "HH:MM".
 */
public class Licao3_EmprestimoLivro {

    public static void main(String[] args) {
        String logs = "101 pegou 08:00, 202 pegou 09:00, 101 devolveu 12:00, 202 devolveu 10:30";
        System.out.println("Resultado: " + livroMaisEmprestado(logs));
        // Livro 101: 4 horas (08 as 12)
        // Livro 202: 1.5 horas (09 as 10:30)
        // Esperado: "101 04:00"
    }

    public static String livroMaisEmprestado(String logs) {
        Map<Integer, Integer> retirados = new HashMap<>(); // ID -> Minuto de retirada
        Map<Integer, Integer> historicoTotal = new HashMap<>(); // ID -> Minutos totais

        String[] entradas = logs.split(", ");
        for (String entrada : entradas) {
            // TODO: Decompor ID, Ação e Hora
            // TODO: Converter Hora para minutos totais
            // TODO: Se 'pegou', salvar em 'retirados'
            // TODO: Se 'devolveu', calcular duração (atual - retirados.get(id)) 
            // e somar no 'historicoTotal'. Remover de 'retirados'.
        }

        // TODO: Encontrar a entrada com maior valor no 'historicoTotal'
        // TODO: Formatar o resultado final
        return "";
    }
}
