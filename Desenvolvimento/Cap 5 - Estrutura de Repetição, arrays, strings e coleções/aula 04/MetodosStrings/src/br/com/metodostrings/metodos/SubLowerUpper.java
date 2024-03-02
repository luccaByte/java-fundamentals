package br.com.metodostrings.metodos;

public class SubLowerUpper {

    public static void main(String[] args) {
        
        String descricao = new String("Maça Gala, a maça mais doce do mercado");

        // transformando todas as caracteres em MINÚSCULO
        System.out.println(descricao.toLowerCase());
        // transformando todas as caracteres em MAIÚSCULO
        System.out.println(descricao.toUpperCase());

        // para fazer busca

        // do indice 0 até o 4
        System.out.println(descricao.substring(0, 4));
        //do indice 4 em diante
        System.out.println(descricao.substring(4));

        System.out.println(descricao.substring(
            descricao.indexOf("Maça"), 
            descricao.indexOf(" ")
        ));

        System.out.println(descricao);
    }
}
