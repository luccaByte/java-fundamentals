package br.com;

import br.com.entity.ContaCorrente;
import br.com.entity.ContaCorrenteEspecial;
import br.com.exception.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrenteEspecial();

        // a exceção é lançada pois não há saldo 
        try {
            conta.sacar(20);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        } 
    }
}
