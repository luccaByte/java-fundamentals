package com.java.construtores;

public class Conta {
    private int numero;
    private double saldo;

    // Construtor padrão (construtor xuxu, sem gosto sem nada kk)
    public Conta () {

    }

    // podemos criar outro construtor com apenas um parametro
    public Conta (int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    // outro exemplo de construtor com 1 parametro
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    // Construtor de classe
    public Conta (int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    } 

    public double recuperarSaldo () {
        return saldo;
    }

    public void depositar (double valor) {
        saldo = saldo + valor;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public int getNumero () {
        return numero;
    }
}
