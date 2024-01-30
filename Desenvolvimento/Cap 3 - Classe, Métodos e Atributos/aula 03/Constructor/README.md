## Contrutores

Construtor são métodos especiais, que são executados automaticamente quando os objetos dessa classe são criados.

Um método construtor é chamado quando o objeto é construído, ou seja, é invocado quando utilizamos a instrução ``new`` para criar uma instância da classe.

No momento em que criamos uma instância da classe, 3 passos são executados pelo java:

- Alocar memória para o objeto
- Inicializar os atributos com os valores iniciais ou padrões
- Chamar o método Construtor da classe

Os construtores se parecem muito com métodos comuns, mas têm três diferenças básicas:

- Têm o mesmo nome da classe
- Não têm tipo de retorno (nem mesmo void)
- Não podem retornar valor no método usando a instrução return

public class Conta {                        <- Classe

    double saldo;                           <- Atributos

    public double recuperarSaldo () {       <- Métodos
        return saldo;
    }

    public void depositar (double valor) {  <- Métodos
        saldo = saldo + valor;
    }
}