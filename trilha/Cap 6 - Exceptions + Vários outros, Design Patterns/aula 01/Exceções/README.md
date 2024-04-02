# Tratamento de exceções 

Durante a execução do programa é possível que algumas exceções ou erros aconteçam. Exceções e erros são problemas que podem ocorrer ao executar algum comando.

Alguns problemas comuns:

- **Falha na aquisição de algum recurso**: Exemplo: abrir um arquivo, conectar com o banco de dados ou acessar a web service
- **Tentativa de realizar algo impossível**: Exemplo: divisão de um número por zero, acessar uma posição de um array que não existe
- **Outras condições inválidas**: Exemplo: evocar um método de um objeto que não foi instanciado, realizar um cast inválido

Esses eventos interrompem o fluxo de execução do código. O tratamento de exceções permite verificar erros sem prejudicar o fluxo de programa.

O fluxo de tratamento de exceções no Java ocorre em 3 passos:

- **Uma exceção é lançada**: um comando do código dispara uma condição inesperada de erro
- **A exceção é capturada**: em algum ponto do código, podemos adicionar um comando para capturar a possível exceção
- **O tratamento de erro é realizado**: após a captura da exceção, o tratamento de erro adequado é executado