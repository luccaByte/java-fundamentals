package br.com.entity;

import br.com.exception.SaldoInsuficienteException;

public abstract class Conta {

    protected double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException {
        
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }

        saldo -= valor;
    }
    
    public abstract double verificarSaldo();
}
