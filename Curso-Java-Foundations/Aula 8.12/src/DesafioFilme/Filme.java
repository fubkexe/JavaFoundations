package DesafioFilme;

public class Filme {

    private String titulo;
    private String genero;
    private int duracao; // duração em minutos

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Informe um título válido.");
        } else {
            this.titulo = titulo;
        }
    }
    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            System.out.println("Informe um gênero válido.");
        } else {
            this.genero = genero;
        }
    }
    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Informe uma duração válida.");
        }
    }
}
