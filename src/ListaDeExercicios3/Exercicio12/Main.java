package ListaDeExercicios3.Exercicio12;

import java.util.Scanner;

/* Faça um programa Java que simule um jogo de adivinhação. Defina no código uma constante
inteira contendo um número secreto. O usuário deverá tentar descobrir o número secreto. O
programa deverá permanecer em um laço de repetição enquanto o usuário não acertar.
A cada tentativa:
• Se o número informado for menor que o número secreto, mostre "O número secreto é
maior.";
• Se o número informado for maior que o número secreto, mostre "O número secreto é
menor.";
• Se o usuário acertar, mostre "Parabéns! Você acertou!".
Ao final, informe a quantidade de tentativas realizadas.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativa = 0;
        int numeroSecreto = 76;

        System.out.println("------------------------------------");
        System.out.println("---------JOGO DE ADVINHAÇÃO---------");
        System.out.println("------------------------------------");

        System.out.println("Digite um numero: ");
        int palpite = scanner.nextInt();

        while (palpite != numeroSecreto){
            if (palpite > numeroSecreto){
                System.out.println("O número secreto é menor.");
            } else if (palpite< numeroSecreto) {
                System.out.println("O número secreto é maior.");
            }

            System.out.println("Digite um numero: ");
            palpite = scanner.nextInt();
            tentativa++;
        }

        System.out.println("Parabéns! Você acertou!");
        System.out.println("Tentativas realizadas: " + tentativa);
    }
}
