package Desafio;

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        IO.println("Digite o nome do produto: ");
        produto1.nome = IO.readln();
        IO.println("Digite o preco do produto: ");
        produto1.preco = Double.parseDouble(IO.readln());
        IO.println("Digite a quantidade do produto: ");
        produto1.quantidade = Integer.parseInt(IO.readln());


        IO.println("Nome do produto: "+produto1.nome);
        IO.println("Preco do produto: "+produto1.preco);
        IO.println("Quantidade do produto: "+produto1.quantidade);
        IO.println("Valor de Estoque: "+ produto1.calcularTotal());


    }


}
