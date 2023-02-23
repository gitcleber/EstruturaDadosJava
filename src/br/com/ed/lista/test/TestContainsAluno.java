package br.com.ed.lista.test;

import br.com.ed.Aluno;
import br.com.ed.lista.Vetor;

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

        System.out.println(lista.contains(aluno));
    }
}
