package br.com.java.banco;

public class Conta {

    /*
        <modificador> <tipo de retorno> <nome do metodo> (<[lista de argumentos]>) {
            (instruções);
        }

        void depositar (int agencia, string numeroConta, double valor) {

        }

        public class Conta {

            double saldo;

            public double recuperarSaldo () {
                return saldo;
            }

            public void depositar(double valor) {
                saldo = saldo + valor;
            }
        }
    */

    int numero;
    double saldo; // double tem uma capacidade maior que o tipo float

    Cliente cliente = new Cliente();
}
