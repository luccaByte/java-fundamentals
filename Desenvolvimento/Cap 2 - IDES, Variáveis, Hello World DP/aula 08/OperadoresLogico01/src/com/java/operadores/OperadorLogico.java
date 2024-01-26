package com.java.operadores;

public class OperadorLogico {

    /*              TABELA VERDADE

        ==================================================

        VALOR 1     |   VALOR 2     |   Operação AND (&&)

        True        |   True        |   True
        True        |   False       |   False
        False       |   True        |   False
        False       |   False       |   False

        ==================================================

        VALOR 1     |   VALOR 2     |   Operação OR (||)

        True        |   True        |   True
        True        |   False       |   True
        False       |   True        |   True
        False       |   False       |   False

        ==================================================

        VALOR 1     |   VALOR 2     |   Operação XOR (^)

        True        |   True        |   False
        True        |   False       |   True
        False       |   True        |   True
        False       |   False       |   False

        ==================================================

        VALOR 1     |   Operação NOT (!)

        True        |   False
        False       |   True
    */

    public static void main(String[] args) {
        
        // exemplo 1
        
        int idade = 20;

        boolean precisaVotar = idade >= 18 && idade < 70;

        System.out.println("==== Exemplo 01 (AND) ====");
        System.out.println("voce precisa votar? " + precisaVotar);

        // exemplo 2

        int nrAmarelo = 2, nrVermelho = 1;

        boolean suspenso = nrAmarelo == 0 || nrVermelho == 0;

        System.out.println("==== Exemplo 02 (OR) ====");
        System.out.println("Cartão amarelo: " + nrAmarelo);
        System.out.println("Cartão vermelho: " + nrVermelho);
        System.out.println("Portanto, vc será suspenso? " + suspenso);

        // exemplo 3

        int x = 11, y = 11;

        boolean teste = x > 10 ^ y > 10;

        System.out.println("==== Exemplo 03 (XOR) ====");
        System.out.println("Número 1: " + x);
        System.out.println("Número 2: " + y);
        System.out.println("Portante é: " + teste);

        // exemplo 4

        int idadeVersaoDois = 20;

        boolean maiorIdade = ! (idadeVersaoDois >= 18);

        System.out.println("==== Exemplo 04 (!) ====");
        System.out.println("Sua idade: " + idadeVersaoDois);
        System.out.println("É de maior? " + maiorIdade);
    }
}
