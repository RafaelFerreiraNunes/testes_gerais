package com.treinamento.curso4_algoritmos;

import java.util.HashSet;
import java.util.Set;

/**
 * CURSO 4: Mastering Algorithms: HashMaps, Two Pointers, and Beyond in Java
 * LIÇÃO 1: Utilizando HashSets para Unicidade e Busca Rápida
 * 
 * CONCEITO:
 * O HashSet permite verificar a existência de um elemento em tempo constante O(1).
 * É ideal para problemas de "duplicatas" ou "complementos".
 * 
 * DESAFIO:
 * "Soma de Dois" (Two Sum - Versão Set): 
 * Dado um array de inteiros e um valor 'alvo', verifique se existem dois números 
 * no array cuja soma seja igual ao alvo.
 * 
 * Exemplo:
 * Array: [1, 5, 8, 10], Alvo: 13
 * Saída: true (5 + 8 = 13)
 */
public class Licao1_Pratica1 {

    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 10};
        int alvo = 13;
        System.out.println("Existe soma? " + temSoma(nums, alvo)); // Esperado: true
    }

    public static boolean temSoma(int[] nums, int alvo) {
        Set<Integer> visitados = new HashSet<>();
        
        for (int num : nums) {
            int complemento = alvo - num;
            
            // TODO: Se o complemento já estiver no Set, encontramos o par!
            // Caso contrário, adicione o número atual ao Set.
        }
        
        return false;
    }
}
