package br.com.entity;

import br.com.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

    private double limite;

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }

    @Override
    public double verificarSaldo() {
        return saldo + limite;
    }

    // gets and sets
}
