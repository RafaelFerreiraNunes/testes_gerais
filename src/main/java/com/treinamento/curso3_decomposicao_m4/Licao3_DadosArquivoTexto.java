package com.treinamento.curso3_decomposicao_m4;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 4: Tarefas Complexas e Estruturas Aninhadas
 * LIÇÃO 3: Análise e atualização de dados aninhados (Desafio Final)
 * 
 * CONCEITO:
 * Este é o desafio que simula a classe 'Solution' teórica. 
 * Exige lidar com strings brutas, delimitadores variados e busca profunda em mapas.
 * 
 * DESAFIO:
 * Implemente o sistema completo:
 * 1. parseString(input): Transforma "A={B=C},D=E" em Map<String, Map<String, String>>.
 * 2. updateValue(map, key, newValue): Procura a chave em qualquer nível e atualiza.
 * 
 * Exemplo: "User1={status=active,level=5},User2={status=inactive}"
 * Update "status" para "verified" -> Atualiza ambos os status.
 */
public class Licao3_DadosArquivoTexto {

    public static void main(String[] args) {
        String dados = "Set1={id=10,val=A},Set2={id=20,val=B},Global=X";
        Map<String, Map<String, String>> estrutura = parseDeep(dados);
        
        System.out.println("Estrutura: " + estrutura);
        updateAll(estrutura, "val", "UPDATED");
        System.out.println("Após Update: " + estrutura);
    }

    public static Map<String, Map<String, String>> parseDeep(String input) {
        // TODO: Implementar a lógica de análise de strings com aninhamento {}
        // Dica: Use a lógica de flags (inInnerMap) ou recursão simples.
        return new HashMap<>();
    }

    public static void updateAll(Map<String, Map<String, String>> map, String key, String newValue) {
        // TODO: Atualizar TODAS as ocorrências da chave nos mapas internos.
    }
}
