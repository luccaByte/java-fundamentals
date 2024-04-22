package br.com.entity;

import br.com.exception.SaldoInsuficienteException;

public class ContaCorrente {

    protected double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException {
        
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }

        saldo -= valor;
    }
}
