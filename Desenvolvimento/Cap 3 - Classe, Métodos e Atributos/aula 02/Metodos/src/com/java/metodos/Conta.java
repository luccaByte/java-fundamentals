package com.java.metodos;

public class Conta {

    /*
        <modificador> <tipo de retorno> <nome do metodo> (<[lista de argumentos]>) {
            (instruções);
        }

        void depositar (int agencia, string numeroConta, double valor) {
        }
    */

    double saldo;

    public double recuperarSaldo () {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    // Assinatura de um método: podemos utilizar 2 classes diferentes com o mesmo nome. o que deve se diferenciar é a assinatura da classe, no caso, as instruções definirão a diferença entre elas

    public void retirar (double valor) {
        saldo = saldo - valor;
    }
    
    public void retirar (double valor, double taxa) {
        saldo = saldo - valor - taxa;
    }

    // this = sempre

    int agencia;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}

