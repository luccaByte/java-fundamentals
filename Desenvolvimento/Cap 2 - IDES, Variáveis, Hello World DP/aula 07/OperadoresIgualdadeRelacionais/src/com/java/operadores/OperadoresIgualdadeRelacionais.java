package com.java.operadores;

public class OperadoresIgualdadeRelacionais {
    /*
                         ==== Operadores de igualdade e relacionais ====
                         
        Operador de igualdade   |   Operador de         |   Exemplo de  |   Significado
        ou relacional algébrico |   igualdade           |   condição    |   da condição
        padrão                  |   ou relacional Java  |   em Java     |   em Java

                                ===== Operadores de igualdade =====
        =                       |           ==          |   x == y      |   x é igual a y
        ?                       |           !=          |   x! = y      |   x é diferente de y

                                ===== Operadores relacionais =====
        >                       |           >           |   x > y       |   x é maior que y
        <                       |           <           |   x < y       |   x é menor que y
        >_                      |           >=          |   x >= y      |   x é maior ou igual a y
        <_                      |           <=          |   x <= y      |   x é menor ou igual a y
    */

    public static void main(String[] args) {
        
        int idade = 18;
        boolean maioridade = idade >= 18;

        System.out.println(maioridade);
    }
}
