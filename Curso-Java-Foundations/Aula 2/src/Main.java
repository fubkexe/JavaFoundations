import java.io.IO;

public class Main {
    public static void main(String[] args) {

        IO.println("Digite uma temperatura em graus Celsius para converte-la para fahreinheit e kelvin");

        double temp;
        temp = Double.parseDouble(IO.readln());

        double fahreinheit =  ((temp * 1.8) + 32);
        double kelvin = temp + 273.15;

        IO.println(temp + " em Fahreinheit eh "+ fahreinheit + "e em Kelvin eh " + kelvin);

    }
}