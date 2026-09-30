package ListaDeExercicios3.Exercicio2;

import java.util.Scanner;

/*Escreva um algoritmo que leia um número inteiro positivo N e exiba os N primeiros
termos da sequência de Fibonacci.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero positivo: ");
        int num = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;
        int soma = 0;

        for (int i = 1; i < num; i++) {
            System.out.println(n1);
            soma = n1 + n2;
            n2 = n1;
            n1 = soma;






        }


    }
}
