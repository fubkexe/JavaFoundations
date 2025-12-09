import java.io.IO;

public class ex2 {
    public static void main(String[] args) {

        IO.println("Calculadora de juros compostos");
        IO.println("Digite o capital inicial");

        double cap = Double.parseDouble(IO.readln());

        IO.println("Digite a taxa de juros por mes");
        double taxa = Double.parseDouble(IO.readln());
        taxa = taxa/100;

        IO.println("Digite o numero de meses");
        int meses = Integer.parseInt(IO.readln());

        double montante = cap* Math.pow(1+taxa,meses);
        String mont = String.format("%.2f", montante);

        IO.println("O montante final foi de " + mont);
    }
}
