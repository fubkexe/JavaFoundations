package entidades;
import java.util.ArrayList;
public class GerenciarAlunos {
    private ArrayList<Alunos> alunos = new ArrayList<>();

    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
    }


}

public void listarAlunos() {
    if (alunos.isEmpty()) {
        System.out.println("Nenhum aluno cadastrado.");
    } else {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + ". " + alunos.get(i));

        }
    }
}
