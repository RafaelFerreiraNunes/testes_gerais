package com.treinamento.curso4_algoritmos_m5;

import java.util.Arrays;

/**
 * CURSO 4: Mastering Algorithms
 * MÓDULO 5: Técnicas Avançadas de Ordenação e Busca
 * LIÇÃO 1: Números com metades mais próximas
 * 
 * CONCEITO:
 * Assim como no exemplo 'findAndReplace', podemos usar a ordenação para otimizar 
 * a busca por valores "mais próximos". Em um array ordenado, se o valor exato 
 * não existe, o valor mais próximo estará adjacente ao ponto de inserção.
 * 
 * DESAFIO:
 * Dado um array A, para cada elemento x em A, encontre em um array B o valor 
 * que seja o mais próximo possível de (x / 2).
 */
public class Licao1_MetadesProximas {

    public static void main(String[] args) {
        int[] A = {10, 30, 50};
        int[] B = {4, 12, 22, 35};
        
        int[] resultado = encontrarMetadesProximas(A, B);
        System.out.println(Arrays.toString(resultado)); 
        // 10/2=5 -> Mais próximo em B é 4
        // 30/2=15 -> Mais próximo em B é 12
        // 50/2=25 -> Mais próximo em B é 22
        // Esperado: [4, 12, 22]
    }

    public static int[] encontrarMetadesProximas(int[] A, int[] B) {
        int[] res = new int[A.length];
        Arrays.sort(B); // O(M log M)

        for (int i = 0; i < A.length; i++) {
            int alvo = A[i] / 2;
            
            // TODO: Use Arrays.binarySearch(B, alvo) para encontrar o índice.
            // Se o índice for negativo, transforme-o no ponto de inserção: -(pos + 1).
            // Compare o valor no ponto de inserção e no ponto anterior para ver qual é o mais próximo de 'alvo'.
        }
        
        return res;
    }
}
