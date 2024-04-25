package br.com.banco.entity;

// conta poupança n irá possuir nenhuma subclasse
public final class ContaPoupanca extends Conta {

    @Override
    public double verificarSaldo() {
        return saldo;
    }
}
