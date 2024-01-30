package com.java.construtores;

public class TesteConta {

    public static void main(String[] args) {
        
        Conta cc = new Conta(1000, 50.0);

        System.out.println(cc.recuperarSaldo());
    }
}