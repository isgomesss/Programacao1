package ListaDeExercicios5.Exercicio12;

import java.util.HashMap;

public class Main {
    public static void retirarDoEstoque(HashMap<String, Integer> estoque, String produto, int quantidade) {
        if (!estoque.containsKey(produto)) {
            throw new IllegalArgumentException("Produto não cadastrado");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero");
        }
        int disponivel = estoque.get(produto);
        if (quantidade > disponivel) {
            throw new IllegalStateException("Estoque insuficiente. Disponível: " + disponivel);
        }
        estoque.put(produto, disponivel - quantidade);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Caneta", 50);
        estoque.put("Caderno", 20);
        estoque.put("Lápis", 30);

        // retirada válida
        try {
            retirarDoEstoque(estoque, "Caneta", 10);
            System.out.println("Retirada realizada. Caneta agora: " + estoque.get("Caneta"));
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // produto que não existe
        try {
            retirarDoEstoque(estoque, "Borracha", 5);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // quantidade inválida
        try {
            retirarDoEstoque(estoque, "Caderno", 0);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // quantidade maior que a disponível
        try {
            retirarDoEstoque(estoque, "Lápis", 100);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Estoque final: " + estoque);
    }
}
