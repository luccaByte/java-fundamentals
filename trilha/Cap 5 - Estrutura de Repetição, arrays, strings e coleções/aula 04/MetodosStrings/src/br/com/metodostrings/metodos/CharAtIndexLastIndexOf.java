package br.com.metodostrings.metodos;

public class CharAtIndexLastIndexOf {

    public static void main(String[] args) {
        
        // Como localizar um caractere em uma string

        String descricao = new String("Maça Gala, a maça mais doce do mercado");

        // para saber a posição do caractere obs: sempre começando em 0

        System.out.println(descricao.charAt(1)); // 0: M - 1: a


        // para saber o índice da posição do caractere

        System.out.println(descricao.indexOf("G"));
        System.out.println(descricao.indexOf("Gala"));
        System.out.println(descricao.indexOf("a"));


        // para saber a ultima posição da índice do caractere
        
        System.out.println(descricao.lastIndexOf("a"));
        

    }
}
