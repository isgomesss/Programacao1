package ListaDeExercicios1.Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Crie um algoritmo que leia o preço de um produto. Se o valor for maior que R$50, aplique um
desconto de 15%; caso contrário, não aplique desconto. Exiba o valor final do produto
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        if (preco > 50) {
            double precoFinal = preco * 0.85;
            System.out.println("Valor final do produto: " + precoFinal);
        }

        else {
            System.out.println("Valor final do produto: " + preco);
        }

    }
}
