package ListaDeExercicios3.Exercicio6;

import java.util.Scanner;

/*Desenvolva um algoritmo que solicite ao usuário um número inteiro positivo e calcule
o fatorial desse número. Mostre na tela do console da mesma forma que no exemplo a
seguir. Exemplo: 5! = 5 × 4 × 3 × 2 × 1 = 120*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro e positivo: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = numero; i > 1; i--) {
            fatorial = fatorial * i;

            System.out.println(i);
        }
        System.out.println( "= " + fatorial);


    }
}
