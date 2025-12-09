package DesafioFilme;

public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme("Inception", "Sci-Fi", 148);
         System.out.println("Título: " + filme.getTitulo());
         System.out.println("Gênero: " + filme.getGenero());
         System.out.println("Duração: " + filme.getDuracao() + " minutos");

        }
}
