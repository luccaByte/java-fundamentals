package br.com.media;

import java.util.Scanner;

public class MediaAlunos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CÁLCULO PARA A MÉDIA DE 10 ALUNOS =====");

        float notas[] = new float[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno nº " + i + ":");
            notas[i] = sc.nextFloat();
        }

        System.out.println("Processando. . .");

        // calculando a média dos alunos

        float totalNotas = 0;

        for (int i = 0; i < notas.length; i++){
            totalNotas = totalNotas + notas[i];
        }

        float mediaNotas = totalNotas / notas.length;

        System.out.println("A média dos alunos é: " + mediaNotas);


        sc.close();
    }
}
