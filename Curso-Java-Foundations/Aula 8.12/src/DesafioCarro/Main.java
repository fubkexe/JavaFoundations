package DesafioCarro;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota Corolla", 2020, 180.0);
         System.out.println("Modelo: " + carro.getModelo());
         System.out.println("Ano: " + carro.getAno());
         System.out.println("Velocidade Máxima: " + carro.getVelocidadeMaxima() + " km/h");

        }
}
