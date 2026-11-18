package Revisao;

import java.util.Scanner;
/*Crie um programa em Java que armazene em uma matriz 3x3 de números inteiros os valores
informados pelo usuário. Em seguida, o programa deverá exibir todos os valores digitados na
forma visual de uma matriz. Na sequência calcule e exiba a soma de todos os elementos da
matriz. Por fim, calcule e exiba a média dos valores armazenados.*/
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("informe um valor para a posicao [" +
                        i + "]["+ j +"]:");
                matriz[i][j] = sc.nextDouble();

                soma += matriz[i][j];
            }
        }
        double totalElementos = matriz.length * matriz[0].length;
        double media = soma / totalElementos;

        for(int i = 0; i < matriz.length; i++) {
            for(int j =0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " \t");
            }
            System.out.println();
        }

        System.out.println("\nSoma de todos os elementos: " + soma);
        System.out.println("Media dos valores armazenados: " + media);
    }
}
