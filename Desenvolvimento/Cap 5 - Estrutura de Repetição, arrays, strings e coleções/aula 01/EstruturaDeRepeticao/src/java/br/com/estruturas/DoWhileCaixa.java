package java.br.com.estruturas;

public class DoWhileCaixa {

    public static void main(String[] args) {
        
        int produtos = 5;
        int registro = 0;

        do {
            registro++;
            System.out.println("O caixa registrou o produto " + registro);
        } while (registro < produtos);
    }
}
