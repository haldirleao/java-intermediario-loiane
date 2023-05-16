package br.com.haldirleao.cursojava.aula59;

// importaçao estática de métodos estáticos da classe Math
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//import static java.lang.Math.*; // importa todos os métodos estáticos de Math

public class StaticImport {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(c));

        // usando os métodos importados
        System.out.println(pow(a, b));
        System.out.println(sqrt(c));
    }
}
