package br.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

    public static void main(String[] args) {
        
        String nomeArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomeArquivo;

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de medida; Valor da unidade;");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Morango; 400; cx; R$ 6,50;");
        conteudo.add("Abacaxi; 280; un; R$ 5,00;");

        gravarEstoque(nomeArquivo, caminho, conteudo);

        lerEstoque(caminho);

        File arquivo = new File(caminho);

        if (arquivo.exists()) {
            System.out.println(
                "O arquivo existe!" +
                "\nPode ser lido: " + arquivo.canRead() +
                "\nPode ser gravado: " + arquivo.canWrite() +
                "\nTamanho: " + arquivo.length() +
                "\nCaminho: " + arquivo.getPath()
            );

        } else {
            // Cria o arquivo
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado!");
                } else {
                    System.out.println("Arquivo não criado!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File fDiretorio = new File(diretorio);

        if (fDiretorio.exists()) {
            System.out.println("O diretório existe!");

        } else {
            if (fDiretorio.mkdir()) {
                System.out.println("Diretório criado!");
            } else {
                System.out.println("Diretório não criado!");
            }
        }
    }

    private static void gravarEstoque(String nomeArquivo, String caminho, List<String> conteudo){

        FileWriter stream;
        PrintWriter print;

        try {
            // stream é uma conexão da escrita para o arquivo
            stream = new FileWriter(caminho);
            // a classe PrintWriter escreverá no arquivo
            print = new PrintWriter(stream);

            for(String linha: conteudo){
                // o metodo println escreve uma linha no arquivo
                print.println(linha);
            }

            // close fecha o arquivo
            print.close();
            stream.close();

            System.out.println("O arquivo " + nomeArquivo + "foi salvo em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerEstoque(String caminho){
        try {
            // Abre o arquivo
            FileReader stream = new FileReader(caminho);

            // BufferedReader possui o metodo readLine()
            // le uma linha do arquivo e retorna uma String com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            // le uma linha no arquivo
            String linha = reader.readLine();

            // enquanto a linha for diferente de null
            while (linha != null) {
                System.out.println(linha);

                // le a proxima linha do arquivo
                linha = reader.readLine();
            }

            reader.close();
            // fecha o arquivo
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
