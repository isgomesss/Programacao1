package ListaDeExercicios5.exercicio10;

import java.util.Scanner;

public class Main {
    public static String paraBinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero == 1) {
            return "1";
        }
        return paraBinario(numero / 2) + (numero % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        System.out.println("Binário: " + paraBinario(numero));
    }
}
