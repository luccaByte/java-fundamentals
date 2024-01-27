package com.java.fluxo;

public class FluxoControle {
    
    public static void main(String[] args) {

        int idade = 120;

        /*if (condição) {

        }*/
        
        System.out.println("Sua idade é: " + idade);

        if (idade >= 18 && idade < 70) {
            System.out.println("Maior de idade!");
        } else if (idade >= 70) {
            if (idade >= 100 && idade < 120) {
                System.out.println("meudeus um elfo");
            } else if (idade >= 120) {
                System.out.println("impossivel");
            } else {
                System.out.println("Tá véio já");
            }
        } else {
            System.out.println("Menor de Idade!");
        }
    }
}
