package br.com.haldirleao.cursojava.aula55;

import br.com.haldirleao.cursojava.aula54.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        
        DiaSemana[] dias = DiaSemana.values();
        
        System.out.println("-- Imprime os dias usando 'for i' --");
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        
        System.out.println("-- Imprime os dias usando 'foreach' --");
        for (DiaSemana dia : dias) {
            System.out.println(dia);
        }

    }
}
