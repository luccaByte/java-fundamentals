package br.com;

import br.com.entity.Conta;
import br.com.entity.ContaCorrente;
import br.com.exception.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) {
        
        Conta conta = new ContaCorrente();

        // a exceção é lançada pois não há saldo 
        try {
            conta.sacar(20);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        } 
    }
}
