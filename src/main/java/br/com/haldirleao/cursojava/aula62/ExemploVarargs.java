package br.com.haldirleao.cursojava.aula62;

public class ExemploVarargs {
    public static void main(String[] args) {

        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));

        // soma usando vetor. Soma n elementos do vetor.
        int[] valores = { 1, 2, 3, 4, 5 };
        System.out.println(soma(valores));

        // usando soma com varargs. soma de n valores.
        System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }

    static int soma(int[] vetor) {
        int total = 0;

        for (int num : vetor) {
            total += num;
        }
        return total;
    }

    // usando varargs
    static int soma(Integer... numeros) {
        int total = 0;
        for (int num : numeros) {
            total += num;
        }
        return total;
    }

}
