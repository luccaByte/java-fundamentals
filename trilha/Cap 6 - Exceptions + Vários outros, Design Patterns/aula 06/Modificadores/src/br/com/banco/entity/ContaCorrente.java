package br.com.banco.entity;

import br.com.banco.exception.SaldoException;

public class ContaCorrente extends Conta {

    private double limite;

    @Override
    public void sacar(double valor) throws SaldoException {

        if (valor > saldo + limite) {
            throw new SaldoException();
        }
        saldo -= valor;
    }

    @Override
    public double verificarSaldo() {
        return saldo + limite;
    }

    // gets and sets
}