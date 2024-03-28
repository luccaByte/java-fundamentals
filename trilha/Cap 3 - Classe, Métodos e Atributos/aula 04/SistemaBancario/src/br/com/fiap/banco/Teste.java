package br.com.fiap.banco;

public class Teste {

    public static void main(String[] args) {
        /*
            gera o objeto "Conta" em memoria
            logo depois, gera uma variável "cc" q é como se fosse um controle remoto de um televisor, no caso, o objeto Conta
        */

        Conta cc = new Conta();
        cc.depositar(50.0);
        cc.setAgencia(0001);
        cc.setNumero(123456);

        cc.depositar(1000);

        System.out.println("Seu saldo atual é: " + cc.getSaldo());

        Conta poupanca = new Conta(0002, 1234567, 1000);
        poupanca.retirar(50.60);
        

        System.out.println("Retirar saldo: " + poupanca.getSaldo());
    }
}
