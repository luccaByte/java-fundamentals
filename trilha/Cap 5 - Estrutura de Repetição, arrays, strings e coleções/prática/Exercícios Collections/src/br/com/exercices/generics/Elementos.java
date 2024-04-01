package br.com.exercices.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Elementos {

    /*
        Faça um programa que utilize um ArrayList com Generics para armazenar elementos de tipos diferentes (por exemplo, String, Integer, e Double), adicionando três elementos (um de cada tipo mencionado) e depois imprimindo-os.
    */

    public static void main(String[] args) {
        
        ArrayList<Object> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adicione um elemento do tipo string:");
        String elementoString = sc.nextLine();
        lista.add(elementoString);

        System.out.println("Agora, adicione um elemento do tipo inteiro:");
        int elementoInt = sc.nextInt();
        lista.add(elementoInt);

        System.out.println("Por ultimo, adicione um elemento do tipo  double:");
        double elementoDouble = sc.nextDouble();
        lista.add(elementoDouble);

        sc.nextLine();

        System.out.println("\nSeus itens:");
        System.out.println(lista);
        
        sc.close();
    }
}
