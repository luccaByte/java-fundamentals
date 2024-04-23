# Polimorfismo

**Polimorfismo** significa "qualidade ou estado de ser capaz de assumir diferentes formas". Na programação orientada a objetos, **polimorfismo** significa ter **múltiplos comportamentos**.

Um **método polimórfico** resulta em diferentes ações dependendo do objeto que está sendo referenciado. A capacidade polimórfica decorre diretamente da **herança** pois permite que uma **variável de referência** e o **objeto** sejam diferentes.

Com o **polimorfismo**, é possivel escrever um código que **não tenha que ser alterado** quando **novos** tipos de **subclasse** forem **introduzidos no sistema**. Porém, a utilização mais importante do polimorfismo se dá quando dois objetos, sendo um da **superclasse** e o outro da **subclasse**, executam **ações diferentes** quando o mesmo método é invocado.

---

### Classe abstrata

Uma classe abstrata possui algumas características como:

- Não pode ser instanciada
- **Pode** possuir métodos abstratos

```
    A primeira característica é que uma classe abstrata não pode ser instanciada, ou seja, não podemos utilizar o operador **new**. Dessa forma, nunca vamos ter uma instancia de uma classe abstrata dentro da nossa aplicação.
```

O  propósito  de  uma  classe  abstrata  é  atuar  como  uma  **superclasse**.  É  uma classe  que  existe  para  ser  herdada.  Dessa forma,  ela  será  a  base  para  as  outras classes que serão desenvolvidas.

