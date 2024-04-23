package br.com.exercices.staticExercice;

public class AcessoCatraca {
  
    private static int totalAcesso;

    private String nome;

    public void entrar(String nome){
    this.nome = nome;
    totalAcesso = totalAcesso + 1;
    }

    public static int recuperarTotal(){
    return totalAcesso;
    }

    public static void main(String[] args) {
  
        AcessoCatraca a1 = new AcessoCatraca();
        a1.entrar("Lucas");

        AcessoCatraca a2 = new AcessoCatraca();
        a2.entrar("Frieren");

        AcessoCatraca a3 = new AcessoCatraca();
        a3.entrar("Fern");
    
        int total = AcessoCatraca.recuperarTotal();
        System.out.println("Total " + total);
        
        long numero = Math.round(2.9);
        System.out.println("Número arredondado: " + numero);
    }
}
