package br.com.exercicio;

public class ExercicioDois {
 
    /*
        Escreva um programa Java que encontre o maior elemento em um array de inteiros. O array deve ser preenchido com números aleatórios. Exiba o array e o maior elemento encontrado.
    */

    public static void main(String[] args) {
        
        int array[] = {10, 4, 56, 100, 24, 56, 76, 432, 465, 23, 514, 34213, 5};
        int x = 0;

        for (int i : array) {
            System.out.println("[ " + i + " ]");
        }

        for (int i = 1; i < array.length; i++) {
            
            if (array[i] > x) {
                x = array[i];
            }
        }
        System.out.println("O maior elemento é: " + x);
    }
}
