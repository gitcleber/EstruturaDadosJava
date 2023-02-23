package br.com.ed.lista.test;

import br.com.ed.Aluno;
import br.com.ed.lista.Vetor;

public class TestGetByIDx {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rafael");
        Aluno a2 = new Aluno("Paulo");

        Vetor lista = new Vetor();

        lista.add(a1);
        lista.add(a2);

        Aluno aluno1 = lista.getByIDx(0);
        Aluno aluno2 = lista.getByIDx(1);

        System.out.println(aluno1);
        System.out.println(aluno2);

    }
}
