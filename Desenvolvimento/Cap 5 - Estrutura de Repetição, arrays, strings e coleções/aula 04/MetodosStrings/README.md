# Métodos de Strings

No java, as **strings** não tem um tipo de dado primitivo como ``int`` ou ``double`` para armazenar um string. Ao invés disso, devemos utilizar a biblioteca padrão do java que contém uma classe predefinida chamada **String**. 

Os objetos das strings são imutáveis, ou seja, seu contúdo de caracteres não pode ser alterado após a sua inicialização. Desta forma, é impossível alterar o valor da string. Porém, é possivel armazenar outra string no lugar da string original.


Uma String deve ser declarada, instaciada e inicializada.

    String nome = new String();

Podemos instaciá-la e depois atribuir um valor:

    String nome = new String();
    nome = "Lucas";

ou atribuir um valor no momento da instanciação:

    String nome = new String("Lucas");

ou também, é possivel atribuir um valor a uma string sem instanciá-la:

    String nome = "Lucas";

### Escape

| Sequência de escape | Descrição |
| ------------------- | --------- |
| \n | Nova linha |
| \t | Tabulação horizontal |
| \\\ | Barras invertidas | 
| \" | Aspas duplas |
| \' | Aspas simples |

### Método Equals

Compara o conteúdo de duas strings, diferenciando os caracteres maiúsculos e minúsculos. Dessa forma, a string "Lucas" fica diferente de "lucas":

Exemplo:

    String nome = "LUCAS";
    String nome2 = new String("LUCAS");
    if (nome.equals(nome2)){
        System.out.println("As Strings são iguais");
    }else{
        System.out.println("As Strings são diferentes");
    }

### Método equalsIgnoreCase

Compara o conteúdo de duas strings, mas não diferencia os caracteres maiúsculos e minúsculos. Assim sendo, a string "Lucas" é igual a "lucas":

    String nome = "lucas";
    String nome2 = new String("LUCAS");
    if (nome.equalsIgnoreCase(nome2)){
        System.out.println("As Strings são iguais");
    }else{
        System.out.println("As Strings são diferentes ");
    }

### Método startsWith

Podemos verificar se uma string começa com uma sequência de caracteres específica. O método **startsWith** recebe a palavra a ser procurada:

    String descricao = "Maça é uma fruta vermelha";
    if (descricao.startsWith("Maça")){
        System.out.println("A string começa com Maça");
    }else{
        System.out.println("A string não começa com Maça");
    }

### Método endsWith

Também podemos verificar se uma string termina com uma sequência de caracteres específica. O método **endsWith** também recebe a palavra a ser procurada:

    String descricao = "Maça é uma fruta vermelha";
    if (descricao.endsWith("lha")){
        System.out.println("A string começa com lha");
    }else{
        System.out.println("A string não começa com lha");
    }