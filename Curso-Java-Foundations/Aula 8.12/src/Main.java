import Entidades.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João Silva", "123.456.789-00", 1000.0);
         System.out.println("Nome: " + conta.getNome());
         System.out.println("CPF: " + conta.getCpf());
         System.out.println("Saldo: " + conta.getSaldo());

        }

    }

