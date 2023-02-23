package br.com.ed.lista.test;

import br.com.ed.Aluno;
import br.com.ed.lista.Vetor;

public class TestAddByIDx {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");
        a3.setNome("Ana");

        Vetor lista = new Vetor();

        lista.add(a1);
        lista.add(0, a2);
        lista.add(1, a3);

        System.out.println(lista);
    }
}
