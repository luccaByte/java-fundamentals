package br.com.arrays;

public class Caixa {

    public static void main(String[] args) {
        
        Produto[] produtos = new Produto[2];

        // Produto 1
        Produto produto1 = new Produto();
        produto1.setNome("Limão");
        produto1.setDescricao("Galego");
        produto1.setValor(4);

        // Produto 2
        Produto produto2 = new Produto();
        produto2.setNome("Maçã");
        produto2.setDescricao("Gala");
        produto2.setValor(6);

        produtos[0] = produto1;
        produtos[1] = produto2;

        System.out.println("===== FOR ======");
        for(int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i].toString());
        }

        // com for each

        System.out.println("===== FOR EACH ======");
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}
