package br.com.exercicio;

import java.util.Scanner;

public class ExercicioTres {
    
    /*
    Desenvolva um programa Java que calcule a média dos elementos em um array de ponto flutuante. O array também deve ser preenchido com valores de sua escolha. 
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Média dos números flutuantes (Array) ===");

        double array[] = new double[5];
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número flutuante: ");
            array[i] = sc.nextDouble();

            total += array[i];
        }
        
        
        double media = total / array.length;

        System.out.println("Processando. . .");

        System.out.println("O resultado da média é: " + media);

        sc.close();
    }
}
