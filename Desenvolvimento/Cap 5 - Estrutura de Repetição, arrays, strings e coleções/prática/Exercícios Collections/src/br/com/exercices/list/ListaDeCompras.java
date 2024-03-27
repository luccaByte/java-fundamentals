package br.com.exercices.list;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    /* 
        Crie uma classe Java chamada ListaDeCompras que utilize um ArrayList para armazenar itens de compra. Implemente os seguintes métodos:

        adicionar itens à lista de compras.
        remover o item da lista de compras.
        exibir todos os itens atualmente na lista de compras.
    */

    public static void main(String[] args) {
        List<String> carrinho = new ArrayList<String>();

        // add itens da lista
        carrinho.add("Bis 500g");
        carrinho.add("Coca-Cola 2L");
        carrinho.add("Ruffles 250g");
        carrinho.add("Doritos 500g");
        carrinho.add("Leite 1L");

        // exibir itens da lista
        System.out.println("Seu carrinho de compras:");
        for (String i : carrinho) {
            System.out.println(" - | " + i + " |");
        }

        // remover item da lista
        carrinho.remove(4);

        System.out.println("\nSeu carrinho de compras (com o item removido):");
        for (String i : carrinho) {
            System.out.println(" - | " + i + " |");
        }
    }
}
