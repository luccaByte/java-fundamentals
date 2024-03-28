## Arrays

Um ``array`` é uma estrutura de dados que armazena uma coleção de itens do mesmo tipo, que pode ser um tipo primitivo ou objeto. Cada item no **vetor** possui o seu próprio local numerado, chamado **índice**. O **índice** é utilizado para acessar um elemento do **vetor**, e assim, recuperar ou atribuir uma informação naquele item.

### Índice

Em um array o **índice** se inicia a partir do 0, ou seja, para acessar o elemento que está na segunda posição do array, utilizaremos o **índice** 1 e assim sucessivamente.

### Length

Existe a possibilidade de recuperar o tamanho do array por meio do atributo **length**:

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |

- cada número indica uma índice
- o 0 é a primeira índice da matriz
- o comprimento da matriz é 10

### Criando um array

Podemos utilizar o operador ``new`` para criar uma nova instância de um array.

Para declarar uma variável para armazenar um array , primeiro precisamos especificar o tipo do array, acrescentar colchetes (``[]``), e definir o nome da variável.

Exemplos:

    int[] notas;

ou:

    int notas[];

as duas formas estão corretas. Agora, para utilizar o array, usamos o operador ``new``:

    int[] notas = new int[40];

para atribuir um item em uma posição do array, utilizamos o índice dentro do colchetes. Exemplo:

    notas[0] = 10;

*No exemplo, armazemamos o valor 10 na primeira índice do array, o 0*

E para recuperar o valor, basta dizer o índice do vetor:

    System.out.println(notas[0]);