import java.io.IO;

public class ex5 {public static void main(String[] args) {

    IO.println("Calculadora de area e perimetro de circulos");
    IO.println("Digite o raio");

    double raio = Double.parseDouble(IO.readln());


    double area = Math.PI *Math.pow(raio,2);
    double perimetro = 2*Math.PI*raio;

    String p = String.format("%.2f", perimetro);
    String a = String.format("%.2f", area);

    IO.println("O perimetro de " + raio + " eh "+ p + " e sua area eh " + a);

}
}
