package br.com.throwsExceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class TestException {

    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("nota.txt");

        PrintWriter print = new PrintWriter(fw);
        print.println("Maça = R$ 4,00");
        print.println("Morango = R$ 6,50");
        print.println("Total = R$ 10,50");

        print.close();
        fw.close();
    }
}
