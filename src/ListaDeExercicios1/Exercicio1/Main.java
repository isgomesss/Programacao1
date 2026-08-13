package ListaDeExercicios1.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "\nSeja bem-vindo ao sistema!");
    }
}
