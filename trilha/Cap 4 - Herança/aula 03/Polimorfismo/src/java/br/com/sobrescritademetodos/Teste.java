package java.br.com.sobrescritademetodos;

public class Teste {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(50.50);

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);

        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(90.91);

        System.out.println("Conta 01:" + conta1.getSaldo());
        System.out.println("Conta 02: " + conta2.getSaldo());
        System.out.println("Conta 03: " + conta3.getSaldo());
    }
}
