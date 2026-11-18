package ListaDeExercicios5.Exercicio11;

import java.util.Scanner;

public class Main {
    public static int dobrar(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        try {
            int resultado = dobrar(numero);
            System.out.println("O dobro é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("O programa continua rodando.");
    }
}
