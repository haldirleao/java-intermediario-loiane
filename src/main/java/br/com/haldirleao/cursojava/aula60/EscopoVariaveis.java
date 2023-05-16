package br.com.haldirleao.cursojava.aula60;

public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaValor(int valor) {
        valor = valor + 10;
        return valor;
    }

    public int decrementa5() {
        int valor = 5;

        if (true) {
            valor--;
        }
        // this.valor = valor;
        return valor;
    }

    public void teste() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // i++; // erro: i somente existe dentro do for

        int j;
        for (j = 0; j < 10; j++) {
            System.out.println(j);
        }

        // OK, pois j pertence ao método, ou seja, foi declarado fora do loop for.
        System.out.println(j); // j aqui vale 10.

    }
}
