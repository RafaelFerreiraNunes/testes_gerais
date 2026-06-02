package com.treinamento.curso3_decomposicao;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * LIÇÃO 1: Fundamentos da Decomposição de Tarefas
 * 
 * CONCEITO:
 * A decomposição de tarefas é a habilidade de transformar um problema complexo em 
 * subproblemas menores, mais simples e gerenciáveis. Em Java, isso geralmente 
 * significa identificar funcionalidades isoladas que podem ser transformadas em 
 * métodos privados ou classes auxiliares.
 * 
 * DESAFIO:
 * Você receberá uma string contendo nomes de produtos e seus preços no formato:
 * "Produto1:10.50;Produto2:20.00;Produto3:5.50"
 * Sua tarefa é:
 * 1. Separar os itens.
 * 2. Extrair o nome e o preço de cada um.
 * 3. Retornar o nome do produto mais caro.
 * 
 * Exemplo:
 * Entrada: "Caneta:1.50;Caderno:15.00;Borracha:0.75"
 * Saída: "Caderno"
 * 
 * CÓDIGO PARCIAL:
 * Implemente as partes marcadas com TODO.
 */
public class Licao1_Pratica1 {

    public static void main(String[] args) {
        String dados = "Caneta:1.50;Caderno:15.00;Borracha:0.75";
        String resultado = encontrarProdutoMaisCaro(dados);
        System.out.println("Produto mais caro: " + resultado); // Esperado: Caderno
    }

    public static String encontrarProdutoMaisCaro(String dados) {
        // Passo 1: Decompor a string em itens individuais
        String[] itens = dados.split(";");
        
        String produtoMaisCaro = "";
        double maiorPreco = -1;

        for (String item : itens) {
            // Passo 2: Extrair nome e preço (Decomposição em sub-tarefa)
            String nome = extrairNome(item);
            double preco = extrairPreco(item);

            // Passo 3: Lógica de comparação
            if (preco > maiorPreco) {
                maiorPreco = preco;
                produtoMaisCaro = nome;
            }
        }

        return produtoMaisCaro;
    }

    private static String extrairNome(String item) {
        // TODO: Implementar a extração do nome (antes do ':')
        return ""; 
    }

    private static double extrairPreco(String item) {
        // TODO: Implementar a extração do preço (depois do ':') e converter para double
        return 0.0;
    }
}
