package br.com.strings;

public class ExemploString2 {
    
    public static void main(String[] args) {
        
        
        String nome = new String("Maçã");
        String descricao = new String();
        descricao = "Tipo gala, a maça mais doce do mercado";

        String propaganda = nome + " " + descricao;
        System.out.println(propaganda);

        propaganda = nome.concat(" ").concat(descricao);
        System.out.println(propaganda);

        propaganda += "!";
        System.out.println(propaganda);
    }
}
