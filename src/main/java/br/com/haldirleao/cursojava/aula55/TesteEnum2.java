package br.com.haldirleao.cursojava.aula55;

import br.com.haldirleao.cursojava.aula53.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {
        
        System.out.println("-- Usando Enum.valueOf --");
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
    }
}
