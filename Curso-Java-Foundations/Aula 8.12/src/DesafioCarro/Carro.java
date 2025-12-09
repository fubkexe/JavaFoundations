package DesafioCarro;

public class Carro {

    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public Carro(String modelo, int ano, double velocidadeMaxima) {

        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public  void setModelo(String modelo) {
        if(modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Informe um modelo válido.");
        }else {
            this.modelo = modelo;
        }
    }
    public void setAno(int ano) {
        if(ano > 1885) {
            this.ano = ano;
        }else {
            System.out.println("Informe um ano válido.");
        }
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Informe uma velocidade válida.");
        }
    }
}
