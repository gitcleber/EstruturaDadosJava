package br.com.ed.lista.test;

import br.com.ed.Aluno;
import br.com.ed.lista.Vetor;

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
