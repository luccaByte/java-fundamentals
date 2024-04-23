package br.com.banco.entity;

import br.com.banco.exception.SaldoException;

public abstract class Conta {

    protected double saldo;
    public static final int BANCO = 33; // o banco sempre será 33

    public void sacar(double valor) throws SaldoException {
        
        if (valor > saldo) {
            throw new SaldoException();
        }

        saldo -= valor;
    }
    
    public abstract double verificarSaldo();
}

