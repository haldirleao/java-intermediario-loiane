package br.com.haldirleao.cursojava.aula56_1_lab;

import java.util.Scanner;

// haldirleao, 11/maio/2023
// Exercício proposto. 
// Ler os detalhes no enum OperacoesAritmeticas

public class MainHaldir {
    public static void main(String[] args) {
    
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o valor double de x: ");
            double x = scan.nextDouble();
            System.out.println("Digite o valor double de y: ");
            double y = scan.nextDouble();

            System.out.println("Operações dado: x = " + x + " | y = " + y);
            for (OperacoesAritmeticasHaldir oper : OperacoesAritmeticasHaldir.values()) {

                System.out.println(oper + " : " + oper.executarOperacao(x, y));
            }
        }

    }
}
