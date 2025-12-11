package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList <Lanches> cardapio = new ArrayList<>();
    //inicializa a lista com os objetos lanches
    public MenuLanches() {
        cardapio.add(new Lanches("X-Burguer", 12.00));
        cardapio.add(new Lanches("X-Salada", 14.00));
        cardapio.add(new Lanches("X-Bacon", 16.00));
        cardapio.add(new Lanches("X-Tudo", 18.00));
        cardapio.add(new Lanches("Cachorro Quente", 10.00));
    }
    //exibir as informações dos lanches do cardapio -percorrer a lista
    public void exibirCardapio() {
        System.out.println("\n----- Cardápio de Lanches -----");
        System.out.println("| ID |        Lanche        | Preço Unitário |");
        for (int i = 0; i < cardapio.size(); i++) {
            Lanches lanche = cardapio.get(i);
            // Formatação melhorada para visualização
            System.out.printf("| %-2d | %-20s | R$ %-11.2f |\n", (i + 1), lanche.getNome(), lanche.getPreco());
        }
        System.out.println("-------------------------------");
    }
    //retornando pro usuario o lanche escolhido
    public Lanches getCardapio (int i) {
        // Validação simples para evitar IndexOutOfBoundsException
        if (i >= 0 && i < cardapio.size()) {
            return cardapio.get(i);
        }
        return null; // Retorna nulo se o índice for inválido
    }

    // Método auxiliar para o Main
    public int getCardapioSize() {
        return cardapio.size();
    }
}