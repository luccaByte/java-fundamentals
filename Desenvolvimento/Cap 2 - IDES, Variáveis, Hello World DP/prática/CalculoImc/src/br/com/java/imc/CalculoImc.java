package br.com.java.imc;

import java.util.Scanner;

public class CalculoImc {

    /*
        Crie um programa Java que calcule o IMC e exiba se ele está no peso ideal ou não.

        O programa deve receber dois valores: altura e peso. O resultado do IMC é calculado através da expressão: **peso / (altura * altura);**

        Caso o imc esteja entre **18.5 e 25**, informe que o peso é ideal, caso contrário, informe que está fora do peso normal.
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("======== CÁLCULO IMC ========");
        System.out.println("Digite a sua altura (use vírgula para separar as decimais): ");
        double altura = sc.nextDouble();

        System.out.println("Agora, digite o seu peso (use vírgula para separar as decimais): ");
        double peso = sc.nextDouble();

        double calculo = peso / (altura * altura);

        if (altura > 0 && peso > 0) {
            
            System.out.println("Calculando. . .");
            if (calculo >= 18.5 && calculo <= 25) {
                System.out.println("O seu IMC é: " + calculo + ". O seu peso está ideal. Parabéns");
            } else {
                System.out.println("O seu IMC é: " + calculo + ". Peso fora do normal, sinto muito :c");
            }
        } else {
            System.out.println("Valores inválidos. Digite novamente");
        }
    }
}
