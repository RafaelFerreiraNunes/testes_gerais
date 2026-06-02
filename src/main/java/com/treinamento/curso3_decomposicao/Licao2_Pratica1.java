package com.treinamento.curso3_decomposicao;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * LIÇÃO 2: Decomposição com Processamento de Coleções
 * 
 * CONCEITO:
 * À medida que os problemas crescem, a decomposição ajuda a manter o código limpo (Clean Code).
 * Dividir o processamento de listas em etapas de filtragem, transformação e agregação é fundamental.
 * 
 * DESAFIO:
 * Você tem uma lista de strings representando logs de transações: "ID_USUARIO,VALOR,STATUS".
 * Status possíveis: "COMPLETO", "PENDENTE", "CANCELADO".
 * 
 * Sua tarefa é calcular o total gasto apenas por usuários com IDs pares, 
 * considerando apenas transações "COMPLETO".
 * 
 * Exemplo:
 * Entrada: ["1,100,COMPLETO", "2,200,COMPLETO", "4,50,COMPLETO", "2,30,CANCELADO"]
 * Saída: 250.0 (Usuário 2 gastou 200 e Usuário 4 gastou 50)
 */
public class Licao2_Pratica1 {

    public static void main(String[] args) {
        List<String> logs = List.of(
            "1,100,COMPLETO",
            "2,200,COMPLETO",
            "4,50,COMPLETO",
            "2,30,CANCELADO",
            "6,10,COMPLETO"
        );
        
        double total = processarTransacoes(logs);
        System.out.println("Total processado: " + total); // Esperado: 260.0
    }

    public static double processarTransacoes(List<String> logs) {
        double total = 0;
        for (String log : logs) {
            String[] partes = log.split(",");
            
            // Decomposição: delegue as verificações para métodos específicos
            if (isTransacaoValida(partes) && isUsuarioAlvo(partes[0])) {
                total += Double.parseDouble(partes[1]);
            }
        }
        return total;
    }

    private static boolean isTransacaoValida(String[] partes) {
        // TODO: Retornar true se o status (partes[2]) for "COMPLETO"
        return false;
    }

    private static boolean isUsuarioAlvo(String idUsuario) {
        // TODO: Converter idUsuario para int e retornar true se for par
        return false;
    }
}
