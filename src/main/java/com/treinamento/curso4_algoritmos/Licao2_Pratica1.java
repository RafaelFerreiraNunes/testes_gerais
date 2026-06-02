package com.treinamento.curso4_algoritmos;

/**
 * CURSO 4: Mastering Algorithms: HashMaps, Two Pointers, and Beyond in Java
 * LIÇÃO 2: A Técnica de Dois Ponteiros (Two Pointers)
 * 
 * CONCEITO:
 * A técnica de dois ponteiros utiliza dois índices que percorrem a estrutura de dados 
 * (geralmente um array ordenado) em direções opostas ou em velocidades diferentes.
 * Isso reduz a complexidade de O(n^2) para O(n).
 * 
 * DESAFIO:
 * Dado um array de inteiros ORDENADO, encontre se existe um par cuja soma seja igual ao alvo.
 * Nota: Como o array está ordenado, não precisamos de HashSet, podemos usar ponteiros nas extremidades.
 * 
 * Exemplo:
 * Array: [1, 2, 4, 7, 11, 15], Alvo: 9
 * Saída: true (2 + 7)
 */
public class Licao2_Pratica1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 11, 15};
        int alvo = 9;
        System.out.println("Par encontrado? " + existePar(nums, alvo)); // Esperado: true
    }

    public static boolean existePar(int[] nums, int alvo) {
        int esquerda = 0;
        int direita = nums.length - 1;

        while (esquerda < direita) {
            int somaAtual = nums[esquerda] + nums[direita];
            
            // TODO: 
            // 1. Se somaAtual == alvo, retorne true.
            // 2. Se somaAtual < alvo, incremente 'esquerda' (precisamos de um número maior).
            // 3. Se somaAtual > alvo, decremente 'direita' (precisamos de um número menor).
            
            // Placeholder para não entrar em loop infinito no teste
            esquerda++; 
        }
        
        return false;
    }
}
