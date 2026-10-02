package ListaDeExercicios3.Exercicio11;

import java.util.Scanner;

/* Faça um algoritmo que solicite ao usuário que cadastre uma senha. A senha será considerada
válida somente se:
• Possuir pelo menos 8 caracteres;
• Possuir pelo menos uma letra maiúscula;
• Possuir pelo menos uma letra minúscula;
• Possuir pelo menos um número.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                temMaiuscula = true;
            }

            if (c >= '0' && c <= '9') {
                temNumero = true;
            }
            if (c >= 'a' && c <= 'z') {
                temMinuscula = true;
            }
        }

        if (senha.length() >= 8 && temMaiuscula && temMinuscula && temNumero) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }
    }
}