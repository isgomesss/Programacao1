package ListaDeExercicios1.Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que receba três números A, B e C do usuário e aplique os números na
seguinte fórmula: X= 4A + 5B – 3C + AB + AC – BC/2*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int A = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int B = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int C = scanner.nextInt();

        int soma = ((4*A) + (5 * B) - (3 * C) + (A * B) + (A * C) - (B * C)) / 2;

        System.out.println("O resultado da expressão é: " + soma);
    }
}
