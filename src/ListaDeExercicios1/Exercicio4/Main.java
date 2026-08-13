package ListaDeExercicios1.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que peça ao usuário os valores da base e altura de um retângulo e calcule
a área e o perímetro do retângulo.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retangulo: ");
        float base = scanner.nextFloat();

        System.out.println("Digite o valor da altura do retangulo: ");
        float altura = scanner.nextFloat();

        float retangulo = (base * altura)/2;

        System.out.println("A area do retangulo é de: " + retangulo);
    }
}
