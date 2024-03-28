package com.java.operadores;

public class Operadores {
    /*
                            OPERADORES ARITMÉTICOS

        Operação Java | Operador | Expressão algébrica | Expressão Java 
        Adição        | +        |  f + 7              |    f + 7
        Subtração     | -        |  p - c              |    p - c
        Multiplicação | *        |  Bm                 |    B + m
        Divisão       | /        |  x/y ou x-y         |    x / y
        Resto         | %        |  r mod s            |    r % s
    */

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        
        int result = x + y;
        System.out.println(result);

        result = x - y;
        System.out.println(result);

        result = x * y;
        System.out.println(result);

        result = x / y;
        System.out.println(result);

        result = x % y;
        System.out.println(result);

        result = z - x + y * (x / y);
        System.out.println(result);
    }
}
