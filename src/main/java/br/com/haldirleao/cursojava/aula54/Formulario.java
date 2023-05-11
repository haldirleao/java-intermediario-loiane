package br.com.haldirleao.cursojava.aula54;

public class Formulario {

    enum Genero {

        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }
    }

    // atributos
    private String nome;
    private Genero genero;

    // construtor
    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // toString
    @Override
    public String toString() {

        return "Formulario [nome=" + nome + ", genero=" + genero + "]";
    }

}
