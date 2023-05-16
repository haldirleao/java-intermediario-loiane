- [Curso Java Intermediário](#curso-java-intermediário)
  - [Instrutora: Loiane Groner](#instrutora-loiane-groner)
  - [Anotações:](#anotações)
    - [Aula 53 (_Enums_: Introdução):](#aula-53-enums-introdução)
    - [Aula 54 (_Enums_: Enumeradores como classe):](#aula-54-enums-enumeradores-como-classe)
    - [Aula 55 (_Enums_: Métodos `value` \& `valueOf`):](#aula-55-enums-métodos-value--valueof)
    - [Aula 56 (_Enums_: Métodos abstratos)](#aula-56-enums-métodos-abstratos)
    - [Aula 56\_1 (_Enums_: Exercício: Calculadora)](#aula-56_1-enums-exercício-calculadora)
    - [Aula 57 (Classes Wrappers: Introdução)](#aula-57-classes-wrappers-introdução)
    - [Aula 58 (_Wrappers: Autoboxing \& Unboxing_)](#aula-58-wrappers-autoboxing--unboxing)
    - [Aula 59 (Importação Estática: _Static import_)](#aula-59-importação-estática-static-import)
    - [Aula 60 (Escopo de variáveis)](#aula-60-escopo-de-variáveis)
    - [Aula 61 (Passagem de parâmetros por valor e por referência)](#aula-61-passagem-de-parâmetros-por-valor-e-por-referência)
    - [Aula 62 (Varargs)](#aula-62-varargs)
    - [Aula 63 (`printf`)](#aula-63-printf)
    - [Aula 64 (Classes aninhadas: internas, locais e anônimas)](#aula-64-classes-aninhadas-internas-locais-e-anônimas)
    - [🚧EM CONSTRUÇÃO🚧](#em-construção)
  - [Materiais de apoio](#materiais-de-apoio)
    - [_Enums_](#enums)
    - [Classes _Wrappers_](#classes-wrappers)


# Curso Java Intermediário

Anotações, materiais de apoio e códigos-fonte enquanto estudava este curso. Iniciado em 11/maio/2023. Concluído em ~~dd/mmm/aaaa~~.

## Instrutora: Loiane Groner
- https://www.linkedin.com/in/loiane
- https://github.com/loiane
- Analista de negócios nos Estados Unidos.
- Autora dos livros: _Ext JS 4 First Look_, _Mastering Ext JS_ (primeira e segunda edição), _Sencha Architect App Development_ e _Learning JavaScript Data Structures and Algorithms_ (primeira, segunda e terceira edição), _JavaScript Regular Expressions_ - todos publicados pela editora Packt e lançados mundialmente em inglês (com tradução de alguns livros para chinês, coreano e português). Confira todos os livros [nesse link](https://www.packtpub.com/books/info/authors/loiane-groner).


## Anotações:
Github do curso https://github.com/loiane/curso-java-basico

### Aula 53 (_Enums_: Introdução):
- Porque usar **_Enums_** ao invés de atributos constantes em uma classe?
- Exemplos práticos

### Aula 54 (_Enums_: Enumeradores como classe):
- _Enums_ _extends_ a classe **java.lang.Enum**
- Podem ser comparados usando `==`
- Não podem ser instanciados com `new`
- Podem implementar interfaces
- Pode ser declarado separadamente ou dentro de classes
- Exemplos práticos

### Aula 55 (_Enums_: Métodos `value` & `valueOf`):

- Iteração com _Enums_ (`value`, `for i`, `for each`)
- `valueOf` https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html#valueOf-java.lang.Class-java.lang.String-
- Exemplos práticos

### Aula 56 (_Enums_: Métodos abstratos)

- Gerador aleatório de CPF e CNPJ válidos
- Criando e usando subclasses abstratas dentro de _Enums_
- Exemplos práticos

### Aula 56_1 (_Enums_: Exercício: Calculadora)
Exercício proposto:
- Escreva um _Enum_ que represente as quatro operações matemáticas: somar, subtrair, multiplicar, dividir;
- O _Enum_ deve ter um construtor que receba o símbolo da operação (+, -, *, /);
- Sobrescreva o método toString que retorne somente o símbolo da operação;
- Implemente um método abstrato com a seguinte assinatura **double executarOperacao(double x, double y)**. Cada opção do _Enum_ deve implementar esse método, realizando a operação de acordo com a sua descrição.
- Escreva um método main para teste que realize todas as operações do _Enum_. Dica: você pode usar o método `values` para iterar o _Enum_ e executar todas as operações.

Código-fonte na aula56_1 ~~(src\main\br\com\haldirleao\cursojava\aula56_1_lab)~~.

### Aula 57 (Classes Wrappers: Introdução)

São as classes que representam os Tipos Primitivos Java.

![Wrapper classes - fonte: Facing Issues On IT](https://facingissuesonitcom.files.wordpress.com/2019/06/java-wrapper-classes-for-primitive-type.png)


### Aula 58 (_Wrappers: Autoboxing & Unboxing_)
- _Autoboxing_: transformação de tipo primitivo em objeto.
- _Unboxing_: transformação de objeto em tipo primitivo. 
- Exemplos práticos

### Aula 59 (Importação Estática: _Static import_)

https://en.wikipedia.org/wiki/Static_import

- Exemplo: `import static java.lang.Math.pow`
- Exemplos práticos

### Aula 60 (Escopo de variáveis)

![Escopo de variáveis. Fonte: Loiane Groner, aula 60](https://drive.google.com/uc?id=132cLBMgSqOuz-kJl1t8WT9gpQ9Ic_ud1)

### Aula 61 (Passagem de parâmetros por valor e por referência)

Discussão sobre a existência, ou não, de passagem por referência na linguagem Java: https://forums.oracle.com/ords/apexds/post/pass-by-reference-or-pass-by-value-9836

![Passagem por valor e referência. Fonte: Loiane Groner, aula 61](https://drive.google.com/uc?id=1YPZMj5MFcZbFnssrna_LOJgM7PHGKfiy)

![Passagem por valor e referência. Fonte: Loiane Groner, aula 61](https://drive.google.com/uc?id=1xDaOVy4aQHMsy-ISdfNGYMgT29ZIu7VG)

![Passagem por valor e referência. Fonte: Loiane Groner, aula 61](https://drive.google.com/uc?id=1ev-nM5e4uVuDfrzLLZjNnZF59OFTWg1A)

![Passagem por valor e referência. Fonte: Loiane Groner, aula 61](https://drive.google.com/uc?id=1qNf-0pb2Xq8IE2OKtjp_BNZDgS9kc7Wt)

### Aula 62 (Varargs)

https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html

https://www.baeldung.com/java-varargs

Exemplo:
```java
// usando varargs
static int soma(Integer... numeros) {
  int total = 0;
    for (int num : numeros) {
      total += num;
    }
    return total;
}
```

### Aula 63 (`printf`)

`printf` in Java https://dev.to/ritvikdubey27/printf-in-java-4265

https://www.baeldung.com/java-printstream-printf


Sintax: 
```java
System.out.printf(format, arguments);
System.out.printf(locale, format, arguments);
```
Exemplo:
```java
System.out.printf("Hello %s!%n", "World");
```
Saída:
```java
Hello World!
```
### Aula 64 (Classes aninhadas: internas, locais e anônimas)
### 🚧EM CONSTRUÇÃO🚧

## Materiais de apoio
### _Enums_
- Java: _Enum_ Types https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
- java.lang.Enum https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html
- Controlando o acesso para os membros da classe (`public`, `protected`, _sem modificador_, `private`) https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
- Java: _Enums_ https://blogs.oracle.com/javamagazine/post/java-enums-final-abstract-protected-extends
- Java: _Enums_ https://www.w3schools.com/java/java_enums.asp
- Java _Enums_: sobrescrevendo `toString()`  https://www.baeldung.com/java-enums-tostring
### Classes _Wrappers_
- _The number Classes_ https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html
- Classes _Wrapper_ https://www.w3schools.com/java/java_wrapper_classes.asp
- Os construtores para classes _Wrapper_ estão depreciados desde a versão 9 do Java https://stackoverflow.com/questions/47095474/the-constructors-integerint-doubledouble-longlong-and-so-on-are-deprecat
- Classes _Wrapper_ https://facingissuesonit.com/2019/06/24/java-wrapper-classes/
- 

---
haldirleao

Iniciado em 11/mai/2023. Concluído em dd/mmm/2023.
