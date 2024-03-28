package br.com.java.banco;

public class TesteConta {

    public static void main(String[] args) {
        
        //  TESTE DE CRIAÇÃO DE CONTAS
        
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente.nome = "Lucas";
        contaCorrente.cliente.idade = 23;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "Carol";
        contaPoupanca.cliente.idade = 19;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "João";
        contaInvestimento.cliente.idade = 26;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);

        System.out.println(contaPoupanca.numero);
        System.out.println(contaPoupanca.saldo);
        System.out.println(contaPoupanca.cliente.nome);
        System.out.println(contaPoupanca.cliente.idade);

        System.out.println(contaInvestimento.numero);
        System.out.println(contaInvestimento.saldo);
        System.out.println(contaInvestimento.cliente.nome);
        System.out.println(contaInvestimento.cliente.idade);
    }
}
