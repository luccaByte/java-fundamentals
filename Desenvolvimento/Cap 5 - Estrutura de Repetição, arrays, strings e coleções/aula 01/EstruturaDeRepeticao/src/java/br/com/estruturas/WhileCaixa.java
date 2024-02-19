package java.br.com.estruturas;

public class WhileCaixa {
    public static void main(String[] args) {
        
        int produtos = 5;
        int registro = 0;

        while (registro < produtos) {
            registro++;
            System.out.println("O produto número " + registro + " foi registrado");
        }
    }
}
