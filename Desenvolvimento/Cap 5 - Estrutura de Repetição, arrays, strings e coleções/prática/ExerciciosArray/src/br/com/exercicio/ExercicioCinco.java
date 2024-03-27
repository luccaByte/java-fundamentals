package br.com.exercicio;

import java.util.Scanner;

public class ExercicioCinco {

    /*
        Escreva um programa Java que encontre a soma dos elementos em posições ímpares de um array de inteiros.
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SOMA DOS ELEMENTOS ÍMPARES =====");

        int[] array = new int[10];
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira o "+ (i + 1) + "º valor (inteiro):");
            array[i] = sc.nextInt();

            if (i % 2 != 0) {
                soma += array[i]; 
            }
        }

        System.out.println("\nProcessando. . .");
        System.out.println("\n================================");

        System.out.println("Os valores digitados foram:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nOs valores ímpares:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n================================");
        System.out.println("\nSoma das índices ímpares: " + soma);

        sc.close();
    }

}
