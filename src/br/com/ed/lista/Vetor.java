package br.com.ed.lista;

import java.util.Arrays;

import br.com.ed.Aluno;

public class Vetor {

    // Declarando e Inicializando um array de Aluno com capacidade 100.
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void add(Aluno aluno) {
        // for (int i = 0; i < this.alunos.length; i++) {
        // if (this.alunos[i] == null) {
        // this.alunos[i] = aluno;
        // break;
        // }
        // }
        // refactoring: add field totalDeAlunos for save the last idx free in alunos
        // array
        alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;

    }

    public void add(int posicao, Aluno aluno) {

    }

    public Aluno getByIDx(int posicao) {

        return null;
    }

    public void removeByIDx(int posicao) {

    }

    public boolean contains(Aluno aluno) {
        return false;
    }

    public int sizeOf() {
        return 0;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }

}
