package br.com.exercicio;

import java.util.Scanner;

public class ExercicioQuatro {

    /*
     Crie um programa Java que inverta a ordem dos elementos em um array de strings. Exiba o array original e o array invertido.
    */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("==== EXIBINDO UM ARRAY ORIGINAL / INVERTIDO ====");

        String array[] = new String[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");
            array[i] = sc.nextLine();

        }
        
        System.out.println("\nProcessando. . .\n");
        System.out.print("Array original:\n");
        for (String i : array) {
            System.out.println(i + " ");
        }

        // invertendo
        System.out.print("\nArray invertido:\n");
        for (int x = array.length - 1; x >= 0; x-- ) {
            System.out.println(array[x]);
        }
        sc.close();
    }
}
