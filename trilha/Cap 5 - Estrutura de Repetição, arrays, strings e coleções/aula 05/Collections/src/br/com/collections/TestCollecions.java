package br.com.collections;

import java.util.ArrayList;

public class TestCollecions {

    public static void main(String[] args) {
        
        ArrayList carrinho = new ArrayList();
        Double valor = 100.55;
        int valor2 = 1;
        int valor3;

        carrinho.add(valor);
        carrinho.add("uva");
        carrinho.add(valor2);

        System.out.println(carrinho.get(1));

        valor3 = (int) carrinho.get(2);

        System.out.println(valor3);
        
    }
}
