package entidades;

public class Pedido {
    private String nomeLanche;
    private double precoLanche;
    private int quantidade;
    //inicializar o pedido com os valores  do lanche, preco e quantidade
    public Pedido(String nomeLanche, double precoLanche, int quantidade) {
        this.nomeLanche = nomeLanche;
        this.precoLanche = precoLanche;
        this.quantidade = quantidade;
    }

    //getters - consultra atributos privados

    public String getNomeLanche() {
        return nomeLanche;

    }
    public double getPrecoLanche() {
        return precoLanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //settesr - alterar atrinutos privados - atualizar

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoLanche(double precoLanche) {
        this.precoLanche = precoLanche;
    }
    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    //calcular o valor total do pedido

    public double calcularTotal() {
        return precoLanche * quantidade;
    }

    @Override
public String toString() {
    return "Pedido{" +
            " nomeLanche='" + nomeLanche + '\'' +
            ", precoLanche=" + precoLanche +
            ", quantidade=" + quantidade +
            '}';
}
}
