package br.com.haldirleao.cursojava.aula56_1_lab;

// haldirleao, 11/maio/2023
/*
 Exercício proposto:
- Escreva um Enum que represente as quatro operações matemáticas: 
somar, subtrair, multiplicar, dividir;
- O Enum deve ter um construtor que receba o símbolo da operação 
(+, -, *, /);
- Sobrescreva o método toString que retorne somente o símbolo da
 operação;
 - Implemente um método abstrato com a seguinte assinatura double
  executarOperacao(double x, double y). Cada opção do Enum deve
   implementar esse método, realizando a operação de acordo com a 
   sua descrição.
- Escreva um método main para teste que realize todas as operações 
do Enum. Dica: você pode usa ro método values para iterar o Enum 
e executar todas as operações.
 */

public enum OperacoesAritmeticasHaldir {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    // atributo
    private String simboloOperacao;

    // construtor
    OperacoesAritmeticasHaldir(String simboloOperacao) {
        this.simboloOperacao = simboloOperacao;
    }

    // método abstrato (deve ser implementada nas instânciaS (VALORES) do Enum)
    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return this.simboloOperacao;
    }
    
}
