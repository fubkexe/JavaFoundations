package DesafioRoupa;

import java.util.Scanner;

public class Roupa {

    String marca, tipo, tamanho;
    int quantidade;
    double preco;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotal(){

        return this.preco * this.quantidade;

    }


    public void venda(int quantidade) {

        if (this.quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Venda realizada!");
        } else {
            System.out.println("Quantidade Invalida ou Estoque Insuficiente");
        }
    }


    public void abastecimento(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Estoque abastecido");
        } else {
            System.out.println("Valor de abastecimento inválido");
        }
    }




    @Override
    public String toString() {
        return "Estoque " +
                "Marca= " + marca +
                "\nTipo= " + tipo +
                "\nTamanho= " + tamanho +
                "\nQuantidade= " + quantidade +
                "\nPreco= " + preco +
                "\nValorTotal= " + valorTotal() +
                '}';
    }

    public static void main(String[] args) {



    }
}