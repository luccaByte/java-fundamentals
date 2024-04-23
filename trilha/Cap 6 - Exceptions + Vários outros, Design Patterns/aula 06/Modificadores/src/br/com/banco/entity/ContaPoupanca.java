package br.com.banco.entity;

public class ContaPoupanca extends Conta {

    @Override
    public double verificarSaldo() {
        return saldo;
    }
}
