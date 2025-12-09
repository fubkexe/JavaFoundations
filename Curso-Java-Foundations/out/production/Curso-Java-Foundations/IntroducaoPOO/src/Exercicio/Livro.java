package Exercicio;

public class Livro {
    String nome;
    String autor;
    String editora;
    Double preco;
    int quantidade;

    public Livro(String nome, String autor, String editora, Double preco, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void alugaLivro(int quantidade){
        if (quantidade < 0 || quantidade > this.quantidade){
            System.out.println("valor invalido");
        }else {
            this.quantidade -= quantidade;
            System.out.println(this.quantidade);
        }
    }

        public void devolverLivro(int quantidade){
            if (quantidade > 0){
                this.quantidade += quantidade;
            }else{
                IO.println("invalido");
            }

        }
        public Double valorTotal(){
            return this.preco + this.quantidade;
        }

    public String toString(){
        return "Livro: " +this.nome + "\nAutor: "+this.autor + "\nEditora: "+this.editora+"\nPreco: "+this.preco+"\nQuantidade: "+this.quantidade + "\nValor total: "+ this.valorTotal();
    }
}