package br.com;

import br.com.exception.SaldoInsuficienteException;
import br.com.exception.ValorInvalidoException;

public class Conta {

    private double saldo;

    public void depositar(double valor){
        if (valor < 0) {
            throw new ValorInvalidoException();
        }

        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
          throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }

    public static void main(String[] args) {
  
        // Cria uma nova instância de Conta
        Conta c = new Conta();
        try {
          // Saca
          c.sacar(100);
        } catch (Exception e) {
          e.printStackTrace();
        }
        // Deposita
        c.depositar(200);
      
    }
}
