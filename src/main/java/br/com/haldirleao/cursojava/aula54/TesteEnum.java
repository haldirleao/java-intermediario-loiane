package br.com.haldirleao.cursojava.aula54;

import br.com.haldirleao.cursojava.aula54.Formulario.Genero;

public class TesteEnum {
    public static void main(String[] args) {
        
        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " - " + dia.getValor());
        System.out.println("método Enum.ordinal(): " + dia.ordinal());
        System.out.println("método Enum.name(): " + dia.name());

        System.out.println("--------------------");

        Data data = new Data(11, 5, 2023, DiaSemana.QUINTA);
        System.out.println(data.toString());
        
        System.out.println("--------------------");
        
        Formulario meuFormulario = new Formulario("Haldir Leão", Genero.MASCULINO);
        System.out.println(meuFormulario.toString());

    }
}
