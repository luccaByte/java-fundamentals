package com.java.animals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        try {
            
            System.out.println("====== CRIAÇÃO DO ANIMAL ======");
            System.out.println("Qual nome do seu animal?");
            String nome = sc.nextLine();
            System.out.println("Insira a classe do seu animal: ");
            String classe = sc.nextLine();
            System.out.println("Digite aqui a família no qual seu animal pertence:");
            String familia = sc.nextLine();

            Animais firstAnimal = new Animais(nome, classe, familia);
            System.out.println("Seu animal chamado " + nome + " nasceu!");
            System.out.println("====== DADOS DO ANIMAL ======");
            System.out.println(firstAnimal.nascer());

            for (; op != 4;) {
                System.out.println("O que o " + firstAnimal.getNome() + " vai fazer agora?" + "\n1 - Comer \n2 - Correr \n3 - Dormir \n4 - Morrer");
                op = sc.nextInt();
            
                if (op > 0 || op < 5) {
                    switch (op) {
                        case 1:
                            System.out.println(firstAnimal.comer());
                            break;
                        case 2:
                            System.out.println(firstAnimal.correr());
                            break;
                        case 3:
                            System.out.println(firstAnimal.dormir());
                            break;
                        case 4:
                            System.out.println(firstAnimal.morrer());
                            break;
                    }
                } else {
                    System.out.println("Opção inválida, tente novamente");
                }
            }
            

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }   finally {
            sc.close();
        }
    }
}
