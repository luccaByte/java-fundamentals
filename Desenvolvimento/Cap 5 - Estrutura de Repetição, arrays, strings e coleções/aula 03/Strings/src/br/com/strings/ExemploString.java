package br.com.strings;

public class ExemploString {
    
    public static void main(String[] args) {
        
        // exemplo 1
        String nome;
        nome = new String();
        nome = "Maçã";
        System.out.println(nome);

        // exemplo 2
        String nome2 = new String("Maçã");
        System.out.println(nome2);

        // exemplo 3
        String nome3 = "Maçã";
        System.out.println(nome3);

        String nome4 = null;
        System.out.println(nome4.length());
    }
}
