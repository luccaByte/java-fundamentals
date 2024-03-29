package br.com.exercices.map;

import java.util.HashMap;
import java.util.Scanner;

public class Mapeamento {

    /*
        Crie um programa que use um HashMap para mapear nomes de alunos a suas respectivas idades (use dados de exemplo). Em seguida, imprima todos os pares chave-valor.
    */

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);

        while (map.size() < 2) {
            System.out.println("Informe o nome do aluno:");
            String nome = sc.nextLine();
            
            System.out.println("Informe a idade do aluno:");
            int idade = sc.nextInt();

            sc.nextLine();

            map.put(nome, idade);
        }

        System.out.println(map);

        sc.close();
    }
}
