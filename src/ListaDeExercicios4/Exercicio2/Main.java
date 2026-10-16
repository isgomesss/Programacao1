package ListaDeExercicios4.Exercicio2;

import java.util.Scanner;

/*Dado um array de 10 números inteiros pré-definidos e que não sejam distintos, peça ao
usuário para digitar um número. O programa deve informar quantas vezes esse número
aparece no array*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {0,1,2,3,3,4,5,6,6,10};

        int quantidade = 0;

        System.out.println("Digite um numero: ");
        int numUsuario = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numUsuario == numeros[i]){
                quantidade++;
            }
        }

        System.out.println("Qauntas vezes o numero aparece no array: " + quantidade);
    }
}
