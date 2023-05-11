package br.com.haldirleao.cursojava.aula54;

public enum DiaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4),
    SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    // construtor
    DiaSemana(int valor) {
        this.valor = valor;
    }

    // getter
    public int getValor() {
        return valor;
    }

}
