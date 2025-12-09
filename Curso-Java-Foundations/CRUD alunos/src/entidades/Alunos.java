package entidades;

public class Alunos {

    private String nome;
    private double n1, n2;

    public Alunos(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }
    public String getNome() {
        return nome;
    }
    public String setNome(String nome) {
        return this.nome = nome;
    }
    public double getN1() {
        return n1;
    }
    public double setN1(double n1) {
        return this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public double setN2(double n2) {
        return this.n2 = n2;
    }
    public double calcularMedia() {
        return (n1 + n2) / 2;
    }

    @Override
    public String toString(){
        return "Aluno: " + nome + ", Nota 1: " + n1 + ", Nota 2: " + n2 + ", Média: " + String.format("%.2f", calcularMedia());
    }
}
