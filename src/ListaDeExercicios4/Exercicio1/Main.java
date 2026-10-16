package ListaDeExercicios4.Exercicio1;

import java.util.Scanner;

/*Peça ao usuário para digitar 6 números inteiros e armazene em um array. Depois, mostre no
terminal:
• Todos os números digitados;
• O maior e o menor número;
• A média dos valores.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int numero = 1;
        int maior = 0;
        int menor = 100;
        double soma = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite o " + numero + " numero: ");
            numeros[i] = scanner.nextInt();
            numero++;
        }

        System.out.println("Todos os numeros digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");


            if (numeros[i] > maior ){
                maior = numeros[i];
            }



            if (numeros[i] < menor){
                menor = numeros[i];
            }

            soma = soma +  numeros[i];
        }

        System.out.println(" ");
        System.out.println("O maior numero digitado: "+ maior);
        System.out.println("O menor numero digitado: "+ menor);

        soma = soma/numeros.length;

        System.out.println("A media dos valores: " + soma);

    }
}
