package ExercicioPOO;

public class Aluno {

    String nome;
    String CPF;
    double nota1;
    double nota2;


    public double calcularMedia() {
        double media = (this.nota1 + this.nota2) / 2;
        return media;

    }
}

