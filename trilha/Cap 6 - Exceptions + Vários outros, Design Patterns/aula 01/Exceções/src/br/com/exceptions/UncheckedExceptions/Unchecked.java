package br.com.exceptions.UncheckedExceptions;

public class Unchecked {
    
    public static void main(String[] args) {
        
        // Exceções unchecked

        try {
            int val = 10 / 0;

            int[] valores = new int[3];
            
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");
        } catch (ArithmeticException e) {

            System.out.println("Não é possivel realizar uma divisao por zero!");

            // mensagem com a lista de erros
            System.out.println(e.getMessage());

            // imprime a pilha de erro da exceção
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Não é possivel acessar a posiçao 4 do array!");

        } catch (NullPointerException e) {

            System.out.println("Não foi possivel retornar o length, variavel nome nao instanciada");

        } catch (NumberFormatException e) {

            System.out.println("Não foi possivel realizar a conversão");

        } catch (Exception e) {

            System.out.println("Erro na execução do programa!");

        } finally {
            System.out.println("Sempre passará por aqui");
        }
    }
}
