# Acesso aos arquivos

O armazenamento de dados em **variáveis**, **arrays**, **coleções**, ou qualquer outra estrutura de dados em memória, é temporário

Os arquivis são muito úteis para armazenar as configurações do programa, ao invés de colocar as configurações diretamente no código fonte. A grande vantagem disso é a possibilidade de alterar o arquivo de configurações sem a necessidade de recompilar e empacotar todo o programa novamente.

Todas as entradas e saídas em Java são definidas em termos de **fluxos**, ou **streams**. **Stream** é uma conexão para uma fonte de dados ou para um destino de dados.

As classes para manipular os arquivos ficam dentro do pacote **java.io**. Duas classes que podemos utilizar para a escrita de arquivo são:

- **java.io.FileWriter**
- **java.io.PrintWriter**