package Desafio1.Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o preço do produto:");
        produto.preco = scanner.nextDouble();

        System.out.println("O preço final é: " + produto.precoFinal());







        /*crie uma classe chamada Produto que tenha como atributo o preço. A classe deve ter um método que calcule o preço final aplicando
       o seguinte desconto: se o preço for maior que R$50 → desconto de 15%. Caso contrário → sem desconto. No programa principal (main),
       leia o preço de um produto informado pelo usuário, crie um objeto da classe Produto e mostre o preço final do produto após aplicar o desconto!*/

    }
}
