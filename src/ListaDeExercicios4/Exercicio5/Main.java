package ListaDeExercicios4.Exercicio5;

import java.util.Scanner;

/*Escreva um programa que leia dois arrays bidimensionais 2x2. Utilizando os conceitos de
matemática de cálculo de matrizes, calcule a multiplicação entre essas duas matrizes e exiba
o resultado na tela.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numeros1 = new int[2][2];
        int[][] numeros2 = new int[2][2];
        int[][] resultado = new int[2][2];

        System.out.println("Digite os numeros para 1° matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Posição [" + i + "][" + j + "]: ");
                numeros1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os numeros para 2° matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Posição [" + i + "][" + j + "]: ");
                numeros2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = numeros1[i][0] * numeros2[0][j] + numeros1[i][1] * numeros2[1][j];
                System.out.print(resultado[i][j]);
            }
            System.out.println();
        }

        
        



    }
}
