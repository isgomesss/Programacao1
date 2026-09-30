package ListaDeExercicios3.Exercicio1;

import java.util.Scanner;

/*Faça um algoritmo que utilize o laço while para mostrar todos os números pares
positivos até o número estipulado pelo usuário.
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int i = 0;
        while ( i <= numero ){
            if (i % 2  == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
