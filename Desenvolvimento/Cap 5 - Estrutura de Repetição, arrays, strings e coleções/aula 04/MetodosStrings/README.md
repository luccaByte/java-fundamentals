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

### Método length

Podemos recuperar a quantidade de caracteres com o método **length**. Porém, na String, ``length`` é um método, então deve terminar com abre e fecha parênteses.

    String descricao = "Maça é uma fruta vermelha";
    int caracteres = descricao.length();
    System.out.println("A string possui " + caracteres + " caracteres");

### Método charAt

Podemos também recuperar um caractere específico de uma string dada a sua posição. O método para obter um caractere de uma string é o ``charAt``.

    String descricao = "Maça é uma fruta vermelha";
    char caracter = descricao.charAt(1);
    System.out.println("O segundo caractere da string é " + caracter);

Retornando: ``O segundo caractere da string é a``

### Método indexOf

Esse método permite localizar a primeira ocorrência de um caractere ou palavra em uma string. Quando for localizado o caractere ou palavra, o método retorna o **índice** da ocorrência. 

    String descricao = "Maça é uma fruta vermelha"; 
    int posicao = descricao.indexOf('a');
    System.out.println("O índice do caracter 'a' na string é " + posicao);

retornando: ``O índice do caracter 'a' na string é 1``

*Lembrando que espaços em branco também são considerados.*

### Método lastIndexOf

Esse método retorna o índice da ultima ocorrência de um caractere ou palavra em uma string.

    String descricao = "Maça é uma fruta vermelha"; 
    int posicao = descricao.lastIndexOf('a');
    System.out.println("O índice do último caracter 'a' na string é " + posicao);

retornando: ``O índice do último caracter 'a' na string é 24``

### Método subString

Este método recebe como parâmetro a posição inicial (``inclusive``) e a posição final(``exclusive``) do conjunto de caracteres a serem copiados da string original.

    String descricao = "Maça é uma fruta vermelha";
    String nova = descricao.substring(11, 15);
    System.out.println("A nova string é: " + nova);

retornando: ``A nova string é: fruta``

### Método toUpperCase e toLowerCase

Podemos converter os caracteres de uma string para maiúsculo ou minúsculo, para isso a classe possui os métodos ``toUpperCase`` e ``toLowerCase``, sendo o ``toUppercase`` para maiúsculo e ``toLowerCase`` para minúsculo.

    String descricao = "Maça é uma fruta vermelha";
    String nova = descricao.toUpperCase();
    System.out.println("A nova string é: " + nova);

retornando: ``A nova string é: MAÇA É UMA FRUTA VERMELHA``

    String descricao = "Maça é uma fruta vermelha";
    String nova = descricao.toLowerCase();
    System.out.println("A nova string é: " + nova);

retornando: ``A nova string é: maça é uma fruta vermelha``

### Método replace

Com o método replace, podemos substituir caracteres ou palavras de uma string original. Exemplo:

    String descricao = "Maça é uma fruta vermelha";
    String nova = descricao.replace('a', 'x');
    System.out.println("A nova string é: " + nova);

retornando: ``A nova string é: Mxçx é umx frutx vermelhx``

*É possível substituir uma palavra com este método também.*

### Método split

Este método separa o valor da string em várias strings separadas por um delimitador. Exemplo:

    String descricao = "Maça é uma fruta vermelha";
    String[] palavras = descricao.split(" ");
    for (String p : palavras) {
        System.out.println(p);
    }

| retornando: |
| ----------- | 
| Maça |
| é |
| uma |
| fruta |
| vermelha |
