void main() {
    int continuar;
    do {


        IO.println("CALCULADORA");
        IO.println("DIGITE QUAL OPERACAO VOCE QUER FAZER");

        String operacao = IO.readln();

        switch (operacao) {
            case "Soma" -> {

                IO.println("Digite o primeiro valor: ");
                int i = Integer.parseInt(IO.readln());
                IO.println("Digite o segundo valor: ");
                int j = Integer.parseInt(IO.readln());

                IO.println("O resultado da soma eh " + (i + j));

            }
            case "Multiplicacao" -> {

                IO.println("Digite o primeiro valor: ");
                int i = Integer.parseInt(IO.readln());
                IO.println("Digite o segundo valor: ");
                int j = Integer.parseInt(IO.readln());

                IO.println("O resultado da multiplicação eh " + (i * j));

            }
            case "Divisao" -> {

                IO.println("Digite o primeiro valor: ");
                int i = Integer.parseInt(IO.readln());
                IO.println("Digite o segundo valor: ");
                int j = Integer.parseInt(IO.readln());

                IO.println("O resultado da divisao eh " + (i / j));
            }
            case "Subtracao" -> {

                IO.println("Digite o primeiro valor: ");
                int i = Integer.parseInt(IO.readln());
                IO.println("Digite o segundo valor: ");
                int j = Integer.parseInt(IO.readln());

                IO.println("O resultado da subtracao eh " + (i - j));
            }
            case null, default -> IO.println("operacao invalida");
        }

        IO.println("Deseja realizar outra operacao?");
        IO.println("Digite 1 para continuar");

        continuar = Integer.parseInt(IO.readln());

        if(continuar != 1){
            IO.println("Programa encerrado");

        }

    }while(continuar == 1);
}
