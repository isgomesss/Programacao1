package ListaDeExercicios1.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo que peça para o usuário entrar com um número inteiro qualquer e
incremente esse número em três formas diferentes, conforme a tabela abaixo dos Operadores
de Atribuição. Posteriormente, mostre o número resultante para o usuário.
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();


        //soma
        num1 += 1;
        System.out.println("Resultado do numero digitado + 1: " + num1);

        //multiplicação:
        num1 *= 2;
        System.out.println("Resultado do numero multiplicado por 2: " + num1);

        //Divisão:
        num1 /= 2;
        System.out.println("Resultado do numero dividido por 2: " + num1);
    }
}
