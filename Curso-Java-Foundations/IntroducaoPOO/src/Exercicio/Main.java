package Exercicio;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Diario de um banana","Jeff Kinney", "VR editoria",50.0, 10);
        System.out.println(livro1.toString());
        livro1.alugaLivro(9);
        livro1.devolverLivro(1);

    }
}
