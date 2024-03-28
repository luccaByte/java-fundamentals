package br.com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        // Interface List e uso de generics
        //Generics não permite tipos primitivos
        List<String> carrinho = new ArrayList<String>(); // somente permitido uma lista do tipo string

        // add adiciona um elemnto no array list
        carrinho.add("Maça");
        carrinho.add("Morango");
        carrinho.add("Maça");
        // carrinho.set(1, "Pera");  set altera o elemento do array

        System.out.println(carrinho);
        System.out.println(carrinho.isEmpty());
        System.out.println(carrinho.size());

        System.out.println(carrinho.contains("Maça"));
        System.out.println(carrinho.indexOf("Maça"));
        System.out.println(carrinho.get(carrinho.indexOf("Maça")));
        System.out.println(carrinho.lastIndexOf("Maça"));

        carrinho.remove(carrinho.indexOf("Maça"));
        System.out.println(carrinho.get(0));

        carrinho.clear();
        System.out.println(carrinho.isEmpty());
    }
}
