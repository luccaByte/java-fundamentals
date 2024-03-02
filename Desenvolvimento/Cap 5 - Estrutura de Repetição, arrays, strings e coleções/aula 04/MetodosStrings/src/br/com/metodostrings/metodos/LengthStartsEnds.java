package br.com.metodostrings.metodos;

public class LengthStartsEnds {


    public static void main(String[] args) {

        // como saber o tamanho da string
        
        String descricao = new String("Maça Gala, a maça mais doce do mercado");

        // com .length

        System.out.println(descricao.length());

        // para saber quando a string começa 

        System.out.println(descricao.startsWith("Maça"));

        // para saber quando a string finaliza

        System.out.println(descricao.endsWith("!"));
    }
}
