package entidades;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Alunos aluno = new Alunos("João", 7.5, 8.0);
      IO.println(aluno.toString());
        ArrayList<Alunos> alunos = new ArrayList<>();

      alunos.add(aluno);
      alunos.add(aluno);
        for (Alunos value : alunos) {
            System.out.println(value);
        }

    var verAluno = alunos.get(1);
      
      verAluno.setN1(8);
        verAluno.setN2(9);
        verAluno.setNome("Maria");
        System.out.println(verAluno);
    }
}