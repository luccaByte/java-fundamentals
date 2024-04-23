# Modificadores

## Modificador Final

O modificador final trabalha de forma contrária em relação ao modificador abstract. Uma classe Java marcada como final não pode ser estendida.

## Modificador Static

O modificador "static" pode ser aplicado aos membros de uma classe:

- métodos
- atributos

Um atributo ou método **estático** são compartilhados por todas as **instâncias** de uma determinada **classe**.

```text
Quando um atributo é declarado como estático, ele passa a se referir a Classe e não à instância da Classe, ou seja, o atributo será igual para todos os objetos, independentemente dos respectivos números de instâncias
```

## Constantes

É  comum  utilizar  os  modificadores ``public``,  ``static`` e ``final`` ao  declarar  uma constante  no  Java.  As  constantes  podem  ser  **públicas**,  ou  seja,  todos  podem  ter acesso.  **Estático**,  pois  não  existe  a  necessidade  de  cada  objeto  ter  a  sua  própria constante e **final**, para que o valor da constante nunca se altere.

Por convenção, o nome de uma constante é sempre escrito em **maiúsculo** com as palavras separadas por **underline**:

```java
public class Constantes {
  
  public static final String JANEIRO = "Janeiro";
  public static final double TAXA_RETIRADA = 10;
  public static final int NUMERO_DIAS_SEMANA = 7;
  public static final Estado SAO_PAULO = new Estado("São Paulo","SP");
  
}
```

Para acessar as constantes, basta utilizar o nome da classe:

```java
public static void main(String[] args) {

  System.out.println(Constantes.JANEIRO);
  System.out.println(Constantes.TAXA_RETIRADA);
  
}
```

