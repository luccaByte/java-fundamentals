package br.com;

import br.com.exception.DivisaoPorZeroException;

public class TestException {

    public static void main(String[] args) throws DivisaoPorZeroException { // add throws na assinatura do método para Exception (checked)
        try {
            int val = 10 / 0;

            System.out.println(val);
        } catch (Exception e) {
           
            throw new DivisaoPorZeroException();
        }
    }
}
