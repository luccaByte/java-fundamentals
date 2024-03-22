package br.com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        
        Set<String> cesta = new HashSet<String>(); // hashset nao permite elementos duplicados

        System.out.println(cesta.isEmpty());
        cesta.add("Maça");
        cesta.add("Maça");
        cesta.add("maça");
        System.out.println(cesta.isEmpty());

        System.out.println(cesta.size());
        System.out.println(cesta);
    }
}
