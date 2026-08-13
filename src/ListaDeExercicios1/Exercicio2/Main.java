package ListaDeExercicios1.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Faça um programa que leia três números inteiros informados pelo usuário e calcule a soma
total. Mostre o resultado na tela.;*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primero numero inteiro");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero inteiro");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("A soma dos numeros é: " + soma);
    }
}
