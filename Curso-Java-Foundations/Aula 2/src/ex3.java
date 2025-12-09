import java.io.IO;

public class ex3 {
    public static void main(String[] args) {

        IO.println("Calculadora de media");
        IO.println("Digite a primeira nota");

        double n1 = Double.parseDouble(IO.readln());

        IO.println("Digite a segunda nota");
        double n2 = Double.parseDouble(IO.readln());

        IO.println("Digite a terceira nota");
        int n3 = Integer.parseInt(IO.readln());

        double media = (n1+n2+n3)/3;
        String m = String.format("%.2f", media);

        IO.println("A media final foi de " + m);
    }
}
