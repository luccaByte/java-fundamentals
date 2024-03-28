package br.com.java.banco;

public class Conta {

    int numero;
    double saldo; 
    
    Cliente cliente = new Cliente();

    public Conta () {

    }

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
