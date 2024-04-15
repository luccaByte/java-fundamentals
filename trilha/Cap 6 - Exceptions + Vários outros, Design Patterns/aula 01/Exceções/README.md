### Tratamento de exceções 

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

---

### Classificação

Dentro da plataforma Java, podemos classificar as exceções em:

- **Checked**: exceção que deve ser tratada ou relançada pelo desenvolvedor.
- **Unchecked**: exceção que pode ser tratada ou relançada pelo programador. Se a exceção não for tratada, ela será automaticamente relançada.
- **Error**: erro crítico, utilizado pela JVM para iniciar que existe um problema que não permite a execução do programa continuar

| Classe | Objeto | Exemplo |
| ------ | ------ | ------- |
| Error | Erro que não pode ser tratado no aplicativo. Lançado pelo JVM indicando que o programa não pode continuar a execução | **OutOfMemoryError**: indica que não há memória suficiente na máquina para continuar a execução do programa |
| Exception | Exceção que deve ser tratada pelo desenvolvedor. | **ArithmeticException**: indica que houve alguma operação aritmética inválida, por ex: divisão por zero. |
| RuntimeException | Exceção que pode ser tratada pelo desenvolvedor. | **NullPointerException**: indica que há alguma indicativa de acessar algum atributo de uma classe que não foi instanciada |
