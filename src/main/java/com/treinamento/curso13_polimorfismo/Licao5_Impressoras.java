package com.treinamento.curso13_polimorfismo;

/**
 * CURSO 13: Polimorfismo em Java
 * LIÇÃO 5: Criando impressoras (Desafio Final)
 * 
 * CONCEITO:
 * Polimorfismo aplicado a interfaces e hierarquias complexas. 
 * O sistema deve aceitar qualquer 'Impressora' e imprimir um 'Documento'.
 * 
 * DESAFIO:
 * 1. Classe abstrata 'Impressora' com método 'imprimir(String doc)'.
 * 2. 'ImpressoraLaser' e 'ImpressoraJatoTinta' que implementam o método.
 * 3. Uma classe 'Escritorio' com um método 'fazerRelatorio(Impressora imp)' 
 *    que usa a impressora passada para imprimir "Relatório Anual".
 */
public class Licao5_Impressoras {

    static abstract class Impressora {
        abstract void imprimir(String conteudo);
    }

    // TODO: Criar ImpressoraLaser (imprime: "[LASER]: " + conteudo)
    
    // TODO: Criar ImpressoraJatoTinta (imprime: "[JATO]: " + conteudo)

    static class Escritorio {
        // TODO: Implementar fazerRelatorio(Impressora i)
    }

    public static void main(String[] args) {
        Escritorio meuEscritorio = new Escritorio();
        
        // meuEscritorio.fazerRelatorio(new ImpressoraLaser());
        // meuEscritorio.fazerRelatorio(new ImpressoraJatoTinta());
    }
}
