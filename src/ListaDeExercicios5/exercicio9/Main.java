package ListaDeExercicios5.exercicio9;

import java.util.Scanner;

public class Main {
    public static boolean ehPalindromo(String palavra) {
        if (palavra.length() <= 1) {
            return true;
        }

        if (palavra.charAt(0) != palavra.charAt(palavra.length() - 1)) {
            return false;
        }

        return ehPalindromo(palavra.substring(1, palavra.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}
