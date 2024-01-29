package br.com.java.temperatura;

import java.util.Scanner;

public class CalculoTemperatura {

    /*
        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 

        F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67;
    */

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("===== CÁLCULO DE TEMPERATURA =====");
        System.out.println("Digite a temperatura atual (em Celsius): ");
        double celsius = sc.nextDouble();
        double fahrenheit, kelvin, reaumur, rankine;

        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        reaumur = celsius * 0.8;
        rankine = celsius * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " º F.");
        System.out.println("Temperatura em Kelvin: " + kelvin + " º K.");
        System.out.println("Temperatura em Réaumur: " + reaumur + " º Re.");
        System.out.println("Temperatura em Rankine: " + rankine + " º Ra.");
    }
}
