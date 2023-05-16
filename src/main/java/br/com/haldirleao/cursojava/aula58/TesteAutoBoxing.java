package br.com.haldirleao.cursojava.aula58;

public class TesteAutoBoxing {
    public static void main(String[] args) {

        // Autoboxing: transformação de tipo primitivo em objeto.
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100L;
        Float num11 = 3.5F;
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character b = 'b';

        // Unboxing: transformação de objeto em tipo primitivo.
        int num13 = num9; // o mesmo que num9.intValue();

        // autoboxing em expressões
        num9++;
        System.out.println(num9);

        // unboxing num9 >> autoboxing num13/num9 >> num14
        Integer num14 = num13 / num9;

        // mau uso
        // nestes casos prefira trabalhar com tipos primitivos
        Double c, d, e;
        c = 10.0;
        d = 12.2;
        e = 4.7;

        Double media = (c + d + e) / 3;
        System.out.println(media);

        // Somente para imprimir e não lançar alarme no VS Code, aba "Problems"
        System.out.print(num7 + " " + num8 + " " + num10 + " " + num11
                + " " + num12 + " " + flag2 + " " + b + " " + num14);
    }
}
