package br.com.strings;

public class ExemploEscape {
    
    public static void main(String[] args) {

        // \n == cria uma quebra de linha:
        String descricao = "Tipo Gala: \nA maçã mais doce do mercado.";
        System.out.println(descricao);

        // \t == cria um espaçamento utilizando TAB
        descricao = "Tipo Gala: \tA maçã mais doce do mercado.";
        System.out.println(descricao);

        // \"\" == cria aspas duplas sem atrapalhar a atribuição que estamos fazendo à string descricao
        descricao = "Tipo Gala: \"A maçã mais doce do mercado.\"";
        System.out.println(descricao);

    }
}
