package java.br.com.heranca;

public class Teste {
    
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAlimenta("Todo animal se alimenta");
        animal.setLocomove("Todo animal se locomove");

        Cachorro cachorro = new Cachorro();

        cachorro.setAlimenta("O cachorro come ração de cachorro");
        cachorro.setLocomove("O cachorro usa 4 patas");
        cachorro.setLatido("O cachorro late");

        Animal poodle = new Cachorro();
        poodle.setAlimenta("Poodle come ração de cachorro");
        poodle.setLocomove("Poodle usa 4 patas");
    }
}
