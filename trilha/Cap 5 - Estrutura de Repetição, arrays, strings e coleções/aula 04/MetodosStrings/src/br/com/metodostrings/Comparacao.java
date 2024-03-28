package br.com.metodostrings;

public class Comparacao {

    public static void main(String[] args) {
    
        String nome = new String("maça");
        String nome2 = new String("Maça");
        String nome3 = new String("maça");

        // tem 2 metodos para comparar string

        // com equals

        System.out.println(nome.equals(nome2)); // false = pois maça != Maça

        System.out.println(nome.equals(nome3)); // true

        // com equals ignore

        System.out.println(nome.equalsIgnoreCase(nome2)); // true


        
        // NÃO recomendável:

        // utilizar ==

        boolean teste = (nome == nome3);

        System.out.println(teste); // false

        String nome4 = "maça";
        String nome5 = "maça";

        teste = (nome4 == nome5);

        System.out.println(teste); // true pois nome4 e nome5 não foram instaciados

    }
}
