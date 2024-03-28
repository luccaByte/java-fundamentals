package com.java.operadores;

public class OperadorIncrementoDecremento {

    public static void main(String[] args) {
        
        int x = 10;
        x = x + 1;
        x++;    // forma mais simples de fazer a mesma coisa

        System.out.println("x = " + x);

        x--;    // x = x - 1;
        System.out.println("x = " + x);

        int y = 10;

        ++y;
        System.out.println("y = " + y);

        --y;
        System.out.println("y = " + y);


        int z = 10, w = 5, n = 5;

        z = w++;
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        // z = --a;
        // System.out.println("z = " + z);
        // System.out.println("a = " + a);
    }
}
