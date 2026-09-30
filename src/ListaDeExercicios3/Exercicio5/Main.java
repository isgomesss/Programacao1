package ListaDeExercicios3.Exercicio5;

import javax.swing.*;
import java.util.Scanner;

/*. Crie um algoritmo que leia um número inteiro positivo e escreva o número invertido.
Posteriormente, faça o mesmo para uma String informada pelo usuário. Exemplo: se
o usuário digitar 1234, o programa deve mostrar 4321*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        int inverso = 0;
        while (numero > 0){
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + inverso);



        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseinversa = " ";
        for (int i = frase.length() -1 ; i >= 0; i--) {
            fraseinversa += frase.charAt(i);
        }
        System.out.println("Frase invertida: " + fraseinversa);
    }
}

