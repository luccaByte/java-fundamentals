package br.com.metodostrings.metodos;

public class ReplaceSplit {

    public static void main(String[] args) {
        
        // Como substituir um caractere de uma string

        String descricao = new String("Maça Gala, a maça mais doce do mercado");

        // com replace substituimos o caractere ou palavra inicializando com o target (a palavra que quer substituir) e depois digitando a subtituição

        System.out.println(descricao.replace("G", "g"));
        System.out.println(descricao.replace("Gala", "Fuji"));

        // subtituindo todos os A existente da string
        System.out.println(descricao.replace("a", "A"));

        // com split().length é possivel contar quantos espaços tem na string
        System.out.println(descricao.split(" ").length);

        // System.out.println(Arrays.toString(descricao.split(" ").length));
    }
}
