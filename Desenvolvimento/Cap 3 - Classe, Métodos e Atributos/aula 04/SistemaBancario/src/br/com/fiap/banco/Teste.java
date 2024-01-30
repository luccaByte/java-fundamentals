package br.com.fiap.banco;

public class Teste {

    public static void main(String[] args) {
        /*
            gera o objeto "Conta" em memoria
            logo depois, gera uma variável "cc" q é como se fosse um controle remoto de um televisor, no caso, o objeto Conta
        */
        
        String nome;

        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 0001;
        cc.numero = 123456;

        cc.depositar(1000);

        System.out.println("Seu saldo atual é: " + cc.verificarSaldo());

        Conta poupanca = new Conta(0002, 1234567, 1000);
        poupanca.retirar(50.60);
        

        System.out.println("Retirar saldo: " + poupanca.verificarSaldo());

        Conta cc2 = null;

        if (cc2 != null) {
            cc2.depositar(1000);
        }
    }
}
