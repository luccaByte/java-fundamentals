package com.java.operadores;

public class OperadorAtribuicao {
    
    public static void main(String[] args) {
        
        int x = 10;
        x = x + 15;

        System.out.println(x);

        int y = 10;

        y += 15;    // é a mesma coisa que y = y + 15; é mais prático kk
        y -= 15;
        y *= 15;    // funciona para todos os operadores
        y /= 15;
        
        System.out.println(y);
    }
}
