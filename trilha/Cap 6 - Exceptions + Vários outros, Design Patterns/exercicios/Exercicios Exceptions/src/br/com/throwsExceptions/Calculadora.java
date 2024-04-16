package br.com.throwsExceptions;

public class Calculadora {

    // public int dividir(int n1, int n2) {
    //     try {
    //       return n1 / n2;
    //     } catch (ArithmeticException e) {
    //       e.printStackTrace();
    //     }
    //     return 0;
    //   }

    public int dividir(int n1, int n2) throws Exception{
        return n1 / n2;
    }
}
