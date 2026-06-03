package com.treinamento.curso5_eficiencia.m5;

import java.util.TreeSet;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 5: Estruturas Ordenadas e Consultas Eficientes
 * LIÇÃO 1: Menor distância absoluta em uma lista dinâmica
 * 
 * CONCEITO:
 * O TreeSet mantém os elementos ordenados, permitindo encontrar o sucessor 
 * (ceiling) e o antecessor (floor) de um número em O(log N). Isso é ideal 
 * para encontrar a menor distância entre um novo número e os já existentes.
 * 
 * DESAFIO:
 * À medida que números são inseridos, retorne a menor diferença absoluta 
 * entre o novo número e qualquer número já presente no conjunto.
 */
public class Licao1_MenorDistancia {

    public static void main(String[] args) {
        int[] nums = {10, 20, 12, 5};
        // 10 -> primeiro: -1 (ou infinito)
        // 20 -> dist(10,20) = 10
        // 12 -> dist(10,12)=2, dist(20,12)=8 -> menor=2
        // 5  -> dist(10,5)=5, dist(12,5)=7... -> menor=5
        
        processarDistancias(nums);
    }

    public static void processarDistancias(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int n : nums) {
            if (set.isEmpty()) {
                System.out.println("Inserido " + n + ": Primeira inserção");
            } else {
                Integer abaixo = set.floor(n);
                Integer acima = set.ceiling(n);
                
                int menorDist = Integer.MAX_VALUE;
                // TODO: Calcular a distância para 'abaixo' e 'acima' (se não forem nulos)
                // e imprimir a menor delas.
                System.out.println("Inserido " + n + ": Menor distância = " + menorDist);
            }
            set.add(n);
        }
    }
}
