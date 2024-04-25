package br.com.banco.entity;

import br.com.banco.exception.SaldoException;

public class ContaCorrente extends Conta implements Transferivel {

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

    @Override
    public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarDoc'");
    }

    @Override
    public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarTed'");
    }

    // gets and sets
}