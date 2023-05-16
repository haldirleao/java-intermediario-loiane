package br.com.haldirleao.cursojava.aula63;

public class ExemploPrintf {
    public static void main(String[] args) {

        // %s: String | %n: New line
        System.out.printf("Hello %s!%n", "World");
        // %S: String tudo em caiuxa alta
        System.out.printf("%S%n", "Hello World!");

        System.out.printf("%c%n", 'c');
        System.out.printf("%C%n", 'c');

        int valor = +123456789;
        System.out.printf("%d%n", valor);

        double pontoFlutuante = 3.1416;
        System.out.printf("%f%n", pontoFlutuante);

        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s.%n", olaMundo);

        System.out.printf("%-20s.%n", olaMundo);

        System.out.printf("%+d%n", valor);

        System.out.printf("%015d%n", valor);

        System.out.printf("%,d%n", valor);

        int valor2 = -123456789;

        System.out.printf("%+d%n", valor2);
        System.out.printf("% d%n", valor2);

        System.out.printf("%.3f%n", pontoFlutuante);
        System.out.printf("%.1f%n", pontoFlutuante);

        System.out.printf("R$%10.2f%n", pontoFlutuante);

        testeMaisCompleto();

    }

    private static void testeMaisCompleto() {

        double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: preço R$%,10.2f%n", "Item", i + 1, precos[i]);
        }
    }
}
