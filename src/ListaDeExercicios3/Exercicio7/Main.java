package ListaDeExercicios3.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*. Faça um algoritmo que solicite ao usuário que digite uma frase. O programa deve percorrer a
frase utilizando um laço de repetição e informar:
• A quantidade total de caracteres;
• A quantidade de vogais;
• A quantidade de consoantes;
• A quantidade de espaços;
• A quantidade de números presentes na frase.
Ao final, apresente todas as informações no termina*/

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Quantidade total de caracteres: " + frase.length());

        int vogais = frase.replaceAll("[^aeiou]", "").length();
        System.out.println("A quantidade de vogais: " + vogais);

        int consoantes = frase.replaceAll(("[^bcdfghjklmnpqrstvwxyz]"), "").length();
        System.out.println("A quantidade de consoantes: " + consoantes);

        int espacos = frase.replaceAll("[^ ]", "").length();
        System.out.println("A quantidade de espaços: " + espacos);

        int numeros = frase.replaceAll(("[^1234567890]"), "").length();
        System.out.println("A quantidade de numeros: " + numeros);













    }
}
