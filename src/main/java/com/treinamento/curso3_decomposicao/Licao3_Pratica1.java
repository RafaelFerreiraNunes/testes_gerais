package com.treinamento.curso3_decomposicao;

import java.util.HashMap;
import java.util.Map;

/**
 * CURSO 3: Mastering Task Decomposition in Java
 * LIÇÃO 3: Decomposição de Lógica de Negócio Complexa
 * 
 * CONCEITO:
 * Quando lidamos com múltiplas regras de negócio, a decomposição evita métodos "monstruosos".
 * Cada método deve ter uma única responsabilidade (Single Responsibility Principle).
 * 
 * DESAFIO:
 * Implementar um validador de senhas complexo. Uma senha é válida se:
 * 1. Tem pelo menos 8 caracteres.
 * 2. Contém pelo menos uma letra maiúscula.
 * 3. Contém pelo menos um número.
 * 4. Contém pelo menos um caractere especial (!@#$%).
 * 
 * CÓDIGO PARCIAL:
 * A estrutura principal está pronta, mas os validadores específicos precisam ser implementados.
 */
public class Licao3_Pratica1 {

    public static void main(String[] args) {
        String[] senhas = {"Senha123!", "12345", "SENHASEMNUMERO!", "senha123", "Ab1!"};
        
        for (String s : senhas) {
            System.out.println("Senha: " + s + " é válida? " + isSenhaValida(s));
        }
    }

    public static boolean isSenhaValida(String senha) {
        if (senha == null || senha.length() < 8) return false;
        
        // Decomposição em verificações booleanas
        return temMaiuscula(senha) && temNumero(senha) && temEspecial(senha);
    }

    private static boolean temMaiuscula(String s) {
        // TODO: Implementar (Dica: usar Character.isUpperCase)
        return false;
    }

    private static boolean temNumero(String s) {
        // TODO: Implementar (Dica: usar Character.isDigit)
        return false;
    }

    private static boolean temEspecial(String s) {
        // TODO: Implementar (Verificar se contém algum de !@#$%)
        return false;
    }
}
