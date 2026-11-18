package ListaDeExercicios5.Exercicio7;

import java.util.Scanner;

/* Faça uma função recursiva que receba um número inteiro N e retorne a soma de todos os
números de 1 até N.*/
public class Main {
    public static int soma(int inteiro) {
        if (inteiro <= 1) {
            return inteiro;
        }
        return inteiro + soma(inteiro - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        int resultado = soma(valor);
        System.out.println("A soma de todos os numeros é: " + resultado);

    }
}
