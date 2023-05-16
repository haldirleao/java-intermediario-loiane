package br.com.haldirleao.cursojava.aula60;

public class Main {

    public static void main(String[] args) {

        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor());
        System.out.println(escopo.calculaValor(20));
        System.out.println(escopo.getValor());
        System.out.println(escopo.decrementa5());
        System.out.println(escopo.getValor());
    }

}
