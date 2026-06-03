package com.treinamento.curso3_decomposicao.m2;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * MÓDULO 2: Percurso em Matrizes e Decomposição
 * LIÇÃO 2: Detecção de vogais em grade espiral
 * 
 * CONCEITO:
 * Percursos complexos (como espiral) são decompostos em 4 sub-tarefas:
 * 1. Direita, 2. Baixo, 3. Esquerda, 4. Cima.
 * 
 * DESAFIO:
 * Dada uma grade de caracteres, percorra a primeira "camada" externa em espiral 
 * (sentido horário) e retorne os índices dos caracteres que são VOGAIS.
 */
public class Licao2_VogaisEspiral {

    public static void main(String[] args) {
        char[][] grade = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'}
        };
        System.out.println("Índices de vogais na espiral: " + detectarVogais(grade));
        // Percurso: A(0), B(1), C(2), F(3), I(4), H(5), G(6), D(7)
        // Vogais: A(0), I(4)
    }

    public static List<Integer> detectarVogais(char[][] grade) {
        List<Character> percurso = new ArrayList<>();
        // TODO: Implementar percurso da borda externa:
        // Linha 0 (toda), Coluna final (menos o 1º), Linha final (menos o 1º, inversa), Coluna 0 (restante)
        
        List<Integer> indicesVogais = new ArrayList<>();
        // TODO: Percorrer 'percurso' e se for vogal (A,E,I,O,U), adicionar o índice à lista 'indicesVogais'
        
        return indicesVogais;
    }
}
