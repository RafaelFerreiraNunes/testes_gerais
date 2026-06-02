package com.treinamento.curso12_abstracao;

import java.util.ArrayList;
import java.util.List;

/**
 * CURSO 12: Abstração em Java
 * LIÇÃO 5: Rede de dispositivos inteligentes (Desafio Final)
 * 
 * CONCEITO:
 * Polimorfismo com Abstração. Podemos tratar diferentes tipos de sensores 
 * como o tipo abstrato 'Sensor', facilitando o gerenciamento de coleções.
 * 
 * DESAFIO:
 * 1. Classe abstrata 'Sensor' com método 'lerValor()'.
 * 2. 'SensorTemperatura' (retorna "25°C") e 'SensorMovimento' (retorna "Detectado").
 * 3. Uma classe 'CentralHub' que possui uma lista de Sensores e um método 
 *    'exibirLeituras()' que percorre a lista chamando lerValor().
 */
public class Licao5_DispositivosInteligentes {

    static abstract class Sensor {
        private String id;
        public Sensor(String id) { this.id = id; }
        public String getId() { return id; }
        
        abstract String lerValor();
    }

    // TODO: Criar SensorTemperatura
    
    // TODO: Criar SensorMovimento

    static class CentralHub {
        private List<Sensor> sensores = new ArrayList<>();

        public void adicionarSensor(Sensor s) {
            sensores.add(s);
        }

        public void exibirLeituras() {
            // TODO: Percorrer a lista e imprimir "[ID]: [VALOR]"
        }
    }

    public static void main(String[] args) {
        CentralHub casa = new CentralHub();
        // casa.adicionarSensor(new SensorTemperatura("S1"));
        // casa.adicionarSensor(new SensorMovimento("M1"));
        
        casa.exibirLeituras();
    }
}
