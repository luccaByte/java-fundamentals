package br.com.exercicio;

public class ExercicioUm {

    /* 
     Crie um programa Java que declare um array de inteiros com 5 elementos e preencha-o com valores de sua escolha. Em seguida, exiba esses valores na tela.
    */

    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 40, 50};

        for (int i : array) {
            System.out.println(i);
        }
    }

}
