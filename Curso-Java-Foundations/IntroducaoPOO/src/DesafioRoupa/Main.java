package DesafioRoupa;

public class Main {

    public static void main(String[] args) {

        Roupa roupa = new Roupa("Nike", "Camiseta", "M", 50, 100.00);

        roupa.abastecimento(20);
        roupa.venda(10);
        System.out.println(roupa.toString());
    }
}