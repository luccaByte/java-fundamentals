## JavaBeans e Encapsulamento

A especificação **JavaBeans** define diretrizes que ditam os nomes de suas variáveis, os nomes e tipos de retorno de seus métodos e alguns outros aspectos para que o objeto, chamado **beans**, seja reutilizável.

As regras para que uma classe seja um **JavaBean** são:

- Ter um construtor padrão, sem argumentos
- Encapsular os seus atributos, provendo métodos para o acesso a eles em outras classes
- É uma boa prática implementar a interface **java.io.Serializable**

Exemplo:

```
    import java.io.Serializable;

    public class Conta implements Serializable {

    }
```

O **encapsulamento** é aplicado a métodos e atributos de uma classe e consiste em proteger os dados ou até mesmo escondê-los.

O uso de métodos de leitura **(get)** e escrita **(set)** visam **desacoplar os atributos** de uma classe dos clientes que a utilizam.