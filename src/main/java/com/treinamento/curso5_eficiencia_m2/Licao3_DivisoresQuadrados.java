package com.treinamento.curso5_eficiencia_m2;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 5: Maximizing Efficiency
 * MÓDULO 2: Otimização por Pré-cálculo e Redundância
 * LIÇÃO 3: Divisores quadrados perfeitos mais próximos
 * 
 * CONCEITO:
 * Problemas que envolvem propriedades matemáticas (como quadrados perfeitos) 
 * podem ser otimizados pré-calculando todos os valores relevantes até um 
 * certo limite, evitando cálculos repetitivos de raiz quadrada.
 * 
 * DESAFIO:
 * Dado um número N, encontre o maior divisor de N que também seja um 
 * quadrado perfeito. Use um pré-cálculo de quadrados até 10.000.
 */
public class Licao3_DivisoresQuadrados {

    private static List<Integer> quadrados = new ArrayList<>();

    // Pré-cálculo estático
    static {
        for (int i = 1; i <= 100; i++) {
            quadrados.add(i * i);
        }
    }

    public static void main(String[] args) {
        int n = 48;
        // Divisores de 48: 1, 2, 3, 4, 6, 8, 12, 16, 24, 48
        // Quadrados perfeitos divisores: 1, 4, 16
        System.out.println("Maior divisor quadrado: " + maiorDivisorQuadrado(n)); // 16
    }

    public static int maiorDivisorQuadrado(int n) {
        int maior = 1;
        
        // TODO: Em vez de testar todos os números, percorra apenas a lista 'quadrados' 
        // de trás para frente (dos maiores para os menores). 
        // O primeiro que dividir N é o seu resultado.
        
        return maior;
    }
}
