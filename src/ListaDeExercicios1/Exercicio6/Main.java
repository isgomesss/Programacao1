package ListaDeExercicios1.Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que defina uma constante e peça para o usuário chutar um número para
tentar acertar o valor da constante. Imprima na tela o resultado da comparação entre a entrada
do usuário e o valor da constante.
*/
        final int NUM_SECRETO = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o numero secreto de 1 a 100!");
        int tentativa = scanner.nextInt();

        if (tentativa == NUM_SECRETO){
            System.out.println("Parabéns numero correto!");
        }
        else if (tentativa > 12) {
            System.out.println("Numero muito alto! Tente novamente!");
        }
        else {
            System.out.println("Numero muito baixo! Tente novamente!");
        }
    }
}
