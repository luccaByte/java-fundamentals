## Estrutura de Repetição

Estruturas de repetição ou loops permitem que um bloco de código seja executado repetidamente, enquanto uma condição permanecer verdadeira.

No java existem 3 estruturas de repetição, sendo eles o `while`, `do while` e `for`.

### While

O loop executa um bloco de código enquanto a condição estiver verdadeira.

Sintaxe:

    while ( <condição> ) {
        <Instruções>
    }

*o loop ``while`` nunca será executado se a condição for falsa desde o início.*

Exemplo:

    int numero = 0;

    while ( numero < 10 ) {
        numero = numero + 1 ;
        System.out.println(numero);
    }

### Do while

Este loop primeiramente irá executar todo o bloco de código para depois testar a condição, e assim verificar se repete novamente o bloco de código.

Sintaxe:

    do {
        <Instruções>  
    } while ( <condição> );

Exemplo:

    int numero = 0;

    do {
        numero = numero + 1 ;
        System.out.println(numero);  
    } while ( numero < 10 );

*Única diferença entre os loops while e do while é a posição do teste para a repetição*

Outro exemplo:

    Scanner sc = new Scanner(System.in);
    String opcao;

    do {
        System.out.println("Digite um número:");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número:");
        int n2 = sc.nextInt();
        
        int soma = n1 + n2;

        System.out.println("A soma é: " + soma);
        System.out.println("Deseja somar outro número? (sim / não)");

        opcao = sc.next();
    } while (opcao.equals("sim"));

    sc.close();

### For

O loop ``for`` é uma estrutura de repetição controlada por uma variável de contador (geralmente o ``i``) que será atualizada depois de cada interação.

Sintaxe:

    for (<inicialização>; <condição lógica>; <incremento ou decremento>) {
        <Instruções>
    }

O primeiro valor (inicialização) da estrutura ``for`` normalmente é utilizado para inicializar a variável de **contador**. A condição lógica verifica se o loop deve repetir ou não, e o incremento (ou decremento) é a atualização da variável de controle, a cada interação.

Por exemplo:

    for (int i=0; i <=10; i++){
        System.out.println(i);
    }