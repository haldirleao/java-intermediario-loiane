package br.com.haldirleao.cursojava.aula57;

public class TesteWrapper {

    public static void main(String[] args) {

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.55555;
        boolean flag = true;
        char a = 'a';

        // The constructors for Wrapper classes have been deprecated since 
        // Java version 9
        /*
         * Short num7 = new Short((short) 1);
         * Byte num8 = new Byte((byte)10);
         * Integer num9 = new Integer(100);
         * Long num10 = new Long(10000l);
         * Float num11 = new Float(3.5f);
         * Double num12 = new Double(3.5555);
         * Boolean flag2 = new Boolean(true);
         * Character b = new Character('b');
         * Integer num13 = new Integer("100"); //NumberFormatException
         * Double num14 = new Double("3.5"); //3,5 para quem usar PC Português Brasil
         */

        // Use esta sintaxe a partir do Java 9:
        Short num7 = Short.valueOf(num1);
        Byte num8 = Byte.valueOf(num2);
        Integer num9 = Integer.valueOf(num3);
        Long num10 = Long.valueOf(num4);
        Float num11 = Float.valueOf(num5);
        Double num12 = Double.valueOf(num6);
        Boolean flag2 = Boolean.valueOf(flag);
        Character b = Character.valueOf(a);
        Integer num13 = Integer.valueOf("100"); // NumberFormatException se não for número
        Double num14 = Double.valueOf("3.5"); // 3.5 para quem usar PC English

        System.out.println(num13.intValue());
        System.out.println(num13.longValue());

        Long num15 = num13.longValue();

        int num16 = Integer.parseInt("100000"); // NumberFormatException

        double num17 = Double.parseDouble("3.555"); // NumberFormatException
        System.out.println(num17);

        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);

        System.out.println(num9 == num13); // !!! == não funciona com wrappers - false
        System.err.println(num9.equals(num13)); // !!! use sempre equals()

        // Somente para imprimir e não lançar alarme no VS Code, aba "Problems"
        System.out.print(num7 + " " + num8 + " " + num10 + " " + num11
                + " " + num12 + " " + flag2 + " " + b + " " + num14 + " "
                + num15 + " " + num16);

    }

}
