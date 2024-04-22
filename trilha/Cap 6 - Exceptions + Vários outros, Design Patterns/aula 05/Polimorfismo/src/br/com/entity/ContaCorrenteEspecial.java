package br.com.entity;

import br.com.exception.SaldoInsuficienteException;

public class ContaCorrenteEspecial extends ContaCorrente {

    private double limite;

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }
}
