package entidades;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    // adicionar pedido na lista
    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() <= 0) { // CORREÇÃO 1: Lógica invertida
            System.out.println("ERRO: Digite uma quantidade válida maior que zero para adicionar ao pedido.");
        } else {
            pedidos.add(pedido);
            System.out.println("Pedido realizado com sucesso!");
        }
    }

    public void ListarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("A lista de pedidos está vazia.");
            return;
        }
        System.out.println("\n----- Lista de Pedidos -----");
        for (int i = 0; i < pedidos.size(); i++) {
            // CORREÇÃO 2: Chama o toString() do objeto Pedido, não da lista inteira
            System.out.println("Pedido " + (i + 1) + ": " + pedidos.get(i).toString());
        }
        System.out.println("----------------------------");
    }

    // CORREÇÃO 3: Implementação correta do método alterarPedido com parâmetros
    public void alterarPedido(int indice, String novoNome, double novoPreco, int novaQuantidade) {
        if (indice < 0 || indice >= pedidos.size()) {
            System.out.println("ERRO: Número de pedido inválido.");
            return;
        }

        if (novaQuantidade <= 0) {
            System.out.println("ERRO: A quantidade deve ser maior que zero.");
            return;
        }

        Pedido pedidoAlterado = pedidos.get(indice);
        pedidoAlterado.setNomeLanche(novoNome);
        pedidoAlterado.setPrecoLanche(novoPreco);
        pedidoAlterado.setQuantidade(novaQuantidade); // Atualiza a quantidade do pedido existente

        System.out.println("Pedido " + (indice + 1) + " alterado com sucesso!");
    }

    public void excluirPedido(int indice) {
        if (indice < 0 || indice >= pedidos.size()) {
            System.out.println("ERRO: Número de pedido inválido para exclusão.");
            return;
        }

        // CORREÇÃO 4: Chama remove() na lista de pedidos
        pedidos.remove(indice);
        System.out.println("Pedido excluído com sucesso!");
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }

    public boolean isEmpty() {
        return pedidos.isEmpty();
    }
}