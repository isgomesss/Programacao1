package Desafio2.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        boolean tamanhoValido = senha.length() >= 8;

        boolean comecaComMaiuscula = false;
        if (senha.length() > 0) {
            char primeiroCaractere = senha.charAt(0);
            comecaComMaiuscula = Character.isUpperCase(primeiroCaractere);
        }

        boolean contemNumero = false;
        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            if (Character.isDigit(caractere)) {
                contemNumero = true;
                break;
            }
        }

        if (tamanhoValido && comecaComMaiuscula && contemNumero) {
            System.out.println("Senha válida!");
        } else {
            System.out.print("Senha inválida! Motivo: ");

            if (!tamanhoValido) {
                System.out.println("a senha deve ter no mínimo 8 caracteres.");
            } else if (!comecaComMaiuscula) {
                System.out.println("a senha deve começar com uma letra maiúscula.");
            } else {
                System.out.println("a senha deve conter pelo menos um número.");
            }
        }
    }
}
