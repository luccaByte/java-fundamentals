package br.com.exercices.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VerificacaoNumeros {

    /*
        Escreva um programa simples que adicione cinco números fornecidos pelo usuário a um HashSet. Depois, imprima todos os números para verificar se há duplicatas.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> numero = new HashSet<>();

        while (numero.size() < 5) {
            System.out.println("Insira um número: ");
            int i = sc.nextInt();
            numero.add(i);
        }

        System.out.println("\nNúmeros digitados:");
        for ( int i : numero) {
            System.out.println(i);
        }

        sc.close();
    }
}
