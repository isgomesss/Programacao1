package Desafio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Double> listaProduto = new HashMap<>();

        String produto;
        Double preco;

        boolean sair = false;
        while(sair == false){

            System.out.println("=======MENU=======");
            System.out.println("1 - cadastrar produto");
            System.out.println("2 - consultar produto");
            System.out.println("3 - atualizar produto");
            System.out.println("4 - remover produto");
            System.out.println("5 - listar produtos");
            System.out.println("6 - carrinho ");
            System.out.println("7 - sair ");
            System.out.println("==================");

            int opcao = scanner.nextInt();
            switch (opcao){

                case 1:
                    System.out.println("Digite o nome do produto para cadastro");
                    String nomeNovoProduto = scanner.next();

                    System.out.println("Digite o preco do novo produto");
                    preco = scanner.nextDouble();

                    listaProduto.put(nomeNovoProduto, preco);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:

                    System.out.println("Digite o nome do produto que vc deseja consultar");
                    String nomeProdutoConsulta = scanner.next();

                    if (listaProduto.containsKey(nomeProdutoConsulta)){
                        System.out.println(listaProduto.get(nomeProdutoConsulta));
                    }else {
                        System.out.println("Produto nao encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Digite o produto que vc quer atualizar o preco");
                    produto = scanner.next();

                    System.out.println("Digite o novo valor do produto");
                    preco = scanner.nextDouble();

                    for (Map.Entry<String, Double> item : listaProduto.entrySet()){
                        String nomeProduto = item.getKey();
                        if(nomeProduto.equals(produto)) {
                            item.setValue(preco);
                        }else {
                            System.out.println("Produto nao encontrado");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite o produto que vc quer remover o preco");
                    produto = scanner.next();

                    listaProduto.remove(produto);
                    System.out.println("Produto removido com sucesso!");
                    break;

                case 5:
                    for (Map.Entry<String, Double> item : listaProduto.entrySet()){
                        System.out.println(item.getKey() + " : " + item.getValue());
                    }
                    break;

                case 6:
                    int continuar = 1;
                    Double valor = 0.0;

                    while (continuar != 0) {

                        System.out.println("Digite o produto que vc quer colocar no carrinho");
                        produto = scanner.next();

                        if (listaProduto.containsKey(produto)) {

                            System.out.println("Digite a quantidade");
                            int quantidade = scanner.nextInt();

                            valor += listaProduto.get(produto) * quantidade;
                            System.out.println("total a pagar: " + valor);

                        } else {
                            System.out.println("Produto nao encontrado");
                        }

                        System.out.println("quer adicionar mais itens? [1] pra sim [0] pra nao");
                        continuar = scanner.nextInt();
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    sair = true;
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente!");

            }

        }
    }
}