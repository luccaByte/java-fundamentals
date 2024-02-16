package java.br.com.handson;

import java.br.com.sobrescritademetodos.Conta;
import java.br.com.sobrescritademetodos.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        
        /* 
            ContaCorrente cc = new ContaCorrente();

            cc.setAgencia(0001);
            cc.setNumero(0202);
            cc.setSaldo(49.76);
            cc.setTipo("PJ");
            cc.setChequeEspecial(1000);
        */

        Conta conta = new Conta();
        Conta cc = new ContaCorrente();

        ContaCorrente c1 = (ContaCorrente) cc;
        
        if (conta instanceof ContaCorrente) {
            ContaCorrente c2 = (ContaCorrente) conta;
            System.out.println(c2 + "É uma conta");
        } else {
            System.out.println("Não é uma conta");
        }

        

       
    }
}
