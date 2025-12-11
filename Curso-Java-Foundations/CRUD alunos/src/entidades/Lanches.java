package entidades;

public class Lanches {
    //atributos DO LANCHE
    private String nome;
   private  double precoUnitario;


    //construtor
    public Lanches(String nome, double preco) {
          this.nome = nome;
          this.precoUnitario = preco;
     }


    //getters - capturar as informações dos atributos privados
    public String getNome() {
          return nome;
     }

     public double getPreco() {
          return precoUnitario;
     }
    //setters - Atuakizare as informações dos atributos privados
     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setPreco(double preco) {
          this.precoUnitario = preco;
     }
     //exibir as informações dos atributos

    @Override
    public String toString() {
            return "Lanche: " + nome + ", Preço Unitário: R$ " + String.format("%.2f", precoUnitario);
    }
}
