package br.com.java.alturasexo;

import java.util.Scanner;

public class AlturaSexo {

    /*
        Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:

        a. a maior e a menor altura do grupo;
        b. média de altura dos homens;
        c. o número de mulheres.
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float[] alturas = new float[10];
        int[] sexos = new int[10];
        int totalHomens = 0, totalMulheres = 0;
        float media = 0, maiorAltura = 0, menorAltura = 0, somaHomens = 0;
        
        System.out.println("===== CÁLCULO DE ALTURA E SEXO DO GRUPO =====");

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite a altura da pessoa nº " + (i + 1) + ":");
            alturas[i] = sc.nextFloat();

            sc.nextLine();

            System.out.println("Digite o sexo da pessoa nº " + (i + 1) + ": (1- Masculino / 2- Feminino)");
            sexos[i] = sc.nextInt(); 

            System.out.println("====== Dados da pessoa " + (i + 1) + " ======");
            System.out.println("Altura: " + alturas[i]);

            if (sexos[i] == 1) {
                System.out.println("Sexo: Masculino");
            } else {
                System.out.println("Sexo: Feminino");
            }
            System.out.println("================================");

            //  a. a maior e a menor altura do grupo;

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            } else if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            //  b. média de altura dos homens;

            if (sexos[i] == 1) {
                totalHomens++;
                somaHomens = somaHomens + alturas[i];
                media = somaHomens / totalHomens;
                
            } else if (sexos[i] == 2) {
                totalMulheres++;
            } else {
                System.out.println("Erro");
            }

            
        };

        //  a. a maior e a menor altura do grupo;
        System.out.println("a. A maior e a menor altura do grupo");
        System.out.println("A maior altura do grupo é: " + maiorAltura);
        System.out.println("A menor altura do grupo é: " + menorAltura);

        //  b. média de altura dos homens;
        System.out.println("================================");
        System.out.println("b. média de altura dos homens");
        System.out.println("A média da altura dos homens é: " + media);
        
        //  c. o número de mulheres.
        System.out.println("================================");
        System.out.println("c. o número de mulheres");
        System.out.println("O total de homens são: " + totalHomens);
        System.out.println("O total de mulheres são: " + totalMulheres);


        sc.close();
    }
}
