package br.com.exercices.finalExercice;

public class Circulo {

    // por convençao os atributos constantes devem ser criados em letras maiúsculas e separados por underline 
    private final double NUMERO_PI = 3.1416;

    private double raio;

    public final double calcularArea() {
        // raio = 10; // OK
        // NUMERO_PI = 10; // nao compila
        return NUMERO_PI * raio * raio;
    }

    // get and set

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
}
