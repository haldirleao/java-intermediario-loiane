package br.com.haldirleao.cursojava.aula56;

public class TesteValidacao {
    public static void main(String[] args) {
        
        System.out.println("\n-- É CPF? --");
        GeraCpfCnpj validadorCPF = new GeraCpfCnpj();

        System.out.println(validadorCPF.isCPF("975.263.040-53"));

        System.out.println("\n-- É CNPJ? --");
        GeraCpfCnpj validadorCNPJ = new GeraCpfCnpj();

        System.out.println(validadorCNPJ.isCNPJ("00.776.574/0001-56"));
    }
}
