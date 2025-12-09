package Desafio;

public class Produto {

    String nome;
    double preco;
    int quantidade;
    double valorEstoque;

    public double calcularTotal(){


        valorEstoque = preco * quantidade;

        return valorEstoque;
    }
}
