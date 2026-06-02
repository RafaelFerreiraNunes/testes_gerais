package com.treinamento.curso3_decomposicao;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * LIÇÃO 4: Integração Final (Solução Completa)
 * 
 * DESAFIO FINAL:
 * Implementar um sistema simplificado de compressão de texto (Run-Length Encoding).
 * Regras:
 * 1. "AAAABBBCCDAA" -> "4A3B2C1D2A"
 * 2. Se a contagem for 1, ainda assim deve aparecer o número (ex: 1D).
 * 
 * Requisito: Decompor em:
 * - Iteração sobre a string.
 * - Contagem de caracteres repetidos consecutivos.
 * - Construção da string final.
 * 
 * Nesta lição, você deve escrever quase toda a lógica.
 */
public class Licao4_Pratica1 {

    public static void main(String[] args) {
        String entrada = "AAAABBBCCDAA";
        String saida = comprimirTexto(entrada);
        System.out.println("Original: " + entrada);
        System.out.println("Comprimido: " + saida); // Esperado: 4A3B2C1D2A
    }

    public static String comprimirTexto(String texto) {
        if (texto == null || texto.isEmpty()) return "";
        
        StringBuilder resultado = new StringBuilder();
        
        // TODO: Implementar lógica de compressão
        // Dica: use um loop para percorrer e outro (ou variáveis de controle) 
        // para contar repetições do caractere atual.
        
        return resultado.toString();
    }
}
