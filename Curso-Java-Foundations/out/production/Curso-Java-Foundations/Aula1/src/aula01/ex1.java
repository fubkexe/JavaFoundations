package aula01;

public class ex1 {
    public static void main(String[] args) {

        IO.println("Digite seu nome e seu estado");

        String Nome = IO.readln();
        String Cidade = IO.readln();

        IO.println("Voce se chama " + Nome + "e mora em " + Cidade);
    }
}
