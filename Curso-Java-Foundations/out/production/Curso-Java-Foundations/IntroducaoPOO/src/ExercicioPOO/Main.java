package ExercicioPOO;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jonathan";
        aluno1.CPF = "123.456.789-01";
        aluno1.nota1 = 10;
        aluno1.nota2 = 8;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.CPF = "123.456.789-02";
        aluno2.nota1 = 9;
        aluno2.nota2 = 7;

        IO.println("Selecione um aluno(1 ou 2)");

        int selecao;
        do {
            selecao = Integer.parseInt(IO.readln());

            if (selecao == 1) {
                IO.println("Nome: " + aluno1.nome);
                IO.println("CPF: " + aluno1.CPF);
                IO.println("Nota 1: " + aluno1.nota1);
                IO.println("Nota 2: " + aluno1.nota2);

                IO.println("Media: " +aluno1.calcularMedia());
            } else if (selecao == 2) {
                IO.println("Nome: " + aluno2.nome);
                IO.println("CPF: " + aluno2.CPF);
                IO.println("Nota 1: " + aluno2.nota1);
                IO.println("Nota 2: " + aluno2.nota2);

                IO.println("Media: " +aluno2.calcularMedia());

            } else {
                IO.println("Selecione apenas 1 ou 2");

            }
        }while(selecao != 1 ||  selecao != 2);


    }


}
