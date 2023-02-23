## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Estrutura de Dados com Java

## 3.3 - Listas
### O problema da listagem de alunos:


#### vamos definir uma estrutura de dados para resolver o problema da listagem de alunos. Chamaremos esta estrutura de Lista.

### Interface da Lista:
1) Adiciona um dado elemento no fim da Lista.
2) Adiciona um dado elemento em um dada posição.
3) Pega o elemento de uma dada posição.
4) Remove o elemento de uma dada posição.
5) Verifica se um dado elemento está contido na Lista.
6) Informa a quantidade de elementos da Lista.

### Objeto Aluno:
```
public class Aluno {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }

    public boolean equals(Object o) {
        Aluno outro = (Aluno)o;
        return this.nome.equals(outro.nome);
    }
}

```
# Vetores
#### Vamos implementar uma Lista para resolver o problema da listagem de alunos

###  Lembrando que a interface da Lista já foi definida acima

#### Vamos Criar um Array de 100 posições para armazenar um objeto Aluno em cada posição do Array

#### Array muitas vezes é denomidada Vetor.
Então criaremos uma classe
chamada Vetor que armazena os alunos em array e tem todas as operações de uma Lista, encapsulando o
acesso a esta Array

```
public class Vetor {
    // Declarando e Inicializando um array de Aluno com capacidade 100.
    private Aluno[] alunos = new Aluno[100];

    public void adiciona(Aluno aluno) {
        // implementação
    }

    public void adiciona(int posicao, Aluno aluno) {
        // implementação
    }

    public Aluno pega(int posicao) {
        // implementação
    }

    public void remove(int posicao) {
        // implementação
    }

    public boolean contem(Aluno aluno) {
        // implementação
    }

    public int tamanho() {
        // implementação
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}

```

### Como temos a interface do Vetor construída já podemos criar alguns testes para cada uma das operações.

## Adiciona no fim da lista
```
public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
    }

    Saída:
            [Rafael, Paulo]
}
```
## Adiciona em uma dada posição
```

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        a1.setNome("Rafael");
        a2.setNome("Paulo");
        a3.setNome("Ana");
        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(0, a2);
        lista.adiciona(1, a3);
        System.out.println(lista);
    }
}
```
Saída:
    [Paulo, Ana, Rafael]

## Remover um aluno por posição

```
public class TestRemoveByIDx {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        a1.setNome("Rafael");
        a2.setNome("Paulo");
        Vetor lista = new Vetor();
        lista.add(a1);
        lista.add(a2);

        lista.remove(0);
        System.out.println(lista);
    }
}
```
Saída:
    [Paulo]


## Verificar se a lista contem um dado aluno
```
public class TestContainsAluno {
    public static void main(String[] args) {
        var a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.add(a1);
        lista.add(a2);

        System.out.println(lista.contains(a1));
        System.out.println(lista.contains(a2));

        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
    }
}
```
Saída:
    true
    true
    false

## Informar o tamanho da lista
```
public class TestSizeOfLista {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.add(a1);
        lista.add(a2);

        System.out.println(lista.sizeOf());

        lista.add(a3);

        System.out.println(lista.sizeOf());
    }
}

```
Saída:
    2
    3

### Estes testes podem ser rodados a medida que preenchemos nosso Vetor com sua respectiva implementação. Em uma aplicação profissional Java, criaríamos testes unitários, utilizando bibliotecas auxiliares, como JUnit ou TestNG, para faciliar a escrita destes mesmos testes.
