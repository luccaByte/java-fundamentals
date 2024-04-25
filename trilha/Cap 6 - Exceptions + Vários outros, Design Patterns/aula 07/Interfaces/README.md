# Interfaces

**Interface** define um conjunto de requisitos para as classes implementá-las. Uma **interface** não é uma classe.

Quando uma classe implementa uma **interface**, ela está comprometida a fornecer todos os comportamentos definidos na **interface**.

Assim como as classes, uma interfae pode ser composta por atributos e métodos. Porém, como ela não é instanciada, **não apresenta construtores**.

```text
Uma classe abstrata não é obrigada a implementar todos os métodos definidos na interface. Porém, em uma classe concreta é obrigatório.
```

Exemplo de uma interface:

```java
// a palavra-chave utilizada é interface e não class
public interface Autenticavel {
  
  String MSG_LOGOUT = "Saindo";

  boolean login(String usuario, String senha);

  void logou();
}
```

## Como implementar

Para uma classe implementar uma interface, devemos utilizar a palavra-chave **implements**. Exemplo:

```java
public class Usuario implements Autenticavel{
  
  @Override
  public boolean login(String usuario, String senha) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void logou() {
    // TODO Auto-generated method stub
    
  }
}
```