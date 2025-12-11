package entidades;

import java.util.Scanner;

public class Main {
    // CORREÇÃO 1: Assinatura correta do método main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedido listaPedido = new ListaPedido();

        int opcao;
        while (true) {
            System.out.println("\n---- MENU DE OPÇÕES ----");
            System.out.println("ADICIONAR LANCHE AO PEDIDO - 1");
            System.out.println("LISTAR PEDIDO - 2");
            System.out.println("ALTERAR PEDIDO - 3");
            System.out.println("EXCLUIR PEDIDO - 4");
            System.out.println("CALCULAR TOTAL DO PEDIDO - 5");
            System.out.println("SAIR - 6");
            System.out.print("Escolha uma opção: ");

            // Tratamento de erro básico
            if (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número.");
                sc.nextLine(); // Consome a entrada inválida
                continue;
            }

            opcao = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1 -> {
                    menu.exibirCardapio();
                    System.out.print("ESCOLHA O ID DO LANCHE: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    // CORREÇÃO 2: Ajuste do índice: ID (1, 2, 3...) para índice da lista (0, 1, 2...)
                    if (opcaoLanche < 1 || opcaoLanche > menu.getCardapioSize()) {
                        System.out.println("ID de lanche inválido.");
                        break;
                    }
                    var lancheEscolhido = menu.getCardapio(opcaoLanche - 1);

                    System.out.println("Você escolheu: " + lancheEscolhido.getNome() + " (R$ " + lancheEscolhido.getPreco() + ")");
                    System.out.print("Digite a quantidade desejada: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(lancheEscolhido.getNome(), lancheEscolhido.getPreco(), quantidade);
                    listaPedido.adicionarPedido(pedido);
                }

                case 2 -> {
                    listaPedido.ListarPedidos();
                }

                // CORREÇÃO 3: Lógica e variáveis de alteração
                case 3 -> {
                    listaPedido.ListarPedidos();
                    if (listaPedido.isEmpty()) {
                        System.out.println("Não há pedidos para alterar.");
                        break;
                    }

                    System.out.print("Digite o número (ID) do pedido que deseja alterar: ");
                    int indicePedido = sc.nextInt();
                    sc.nextLine();

                    menu.exibirCardapio();
                    System.out.print("Digite o ID do NOVO lanche escolhido: ");
                    int idNovoLanche = sc.nextInt();
                    sc.nextLine();

                    if (idNovoLanche < 1 || idNovoLanche > menu.getCardapioSize()) {
                        System.out.println("ID de novo lanche inválido.");
                        break;
                    }

                    System.out.print("Digite a nova quantidade desejada: ");
                    int novaQuantidade = sc.nextInt();
                    sc.nextLine();

                    // Ajuste do índice e obtenção do novo lanche
                    var novoLanche = menu.getCardapio(idNovoLanche - 1);

                    // Chamada correta: passa o índice do pedido, o nome, preço e quantidade
                    listaPedido.alterarPedido(indicePedido - 1, novoLanche.getNome(), novoLanche.getPreco(), novaQuantidade);
                }

                case 4 -> {
                    listaPedido.ListarPedidos();
                    if (listaPedido.isEmpty()) {
                        System.out.println("Não há pedidos para excluir.");
                        break;
                    }
                    System.out.print("Digite o número (ID) do pedido que deseja excluir: ");
                    int numeroPedido = sc.nextInt();
                    sc.nextLine();

                    // CORREÇÃO 4: Ajuste do índice: ID (1, 2, 3...) para índice da lista (0, 1, 2...)
                    listaPedido.excluirPedido(numeroPedido - 1);
                }

                case 5 -> {
                    double total = listaPedido.calcularTotal();
                    System.out.printf("O valor total do pedido é: R$ %.2f\n", total);
                }

                case 6 -> {
                    System.out.println("Encerrando o sistema de pedidos. Até mais!");
                    sc.close();
                    return;
                }
                default -> {
                    System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 6.");
                }
            }
        }
    }
}