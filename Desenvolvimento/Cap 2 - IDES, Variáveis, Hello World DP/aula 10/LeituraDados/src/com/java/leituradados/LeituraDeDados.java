package com.java.leituradados;

import java.util.Scanner;

public class LeituraDeDados {

    public static void main(String[] args) {
        
        int idade = 0;

        /*
            A classe Scanner está dentro do pacote java.util
            
            Scanner sc = new Scanner(System.in);

            Um Scanner permite a leitura de dados que podem ser provenientes de vários origens, como um arquivo do disco ou informações digitadas pelo usuário.
        */

        Scanner sc = new Scanner(System.in);    // obter os dados do usuário
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();    // O next() solicita somente 1 palavra, nextLine() armazena um texto maior
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();    // solicita ao usuario uma variavel do tipo INT

        System.out.println("Olá " + nome + ", sua idade é: " + idade + ".");
        System.out.println("Processando. . .");

        if (idade >= 18 && idade < 70) {
            System.out.println("Maior de idade!");
        } else if (idade >= 70) {
            if (idade >= 100 && idade < 120) {
                System.out.println("Centenária! (meudeus um elfo)");
            } else if (idade >= 120) {
                System.out.println("impossível :o");
            } else {
                System.out.println("Tá véio já");
            }
        } else {
            System.out.println("Menor de Idade!");
        }
    }
}
