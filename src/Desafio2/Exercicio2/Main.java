package Desafio2.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Escolha um comando (upper, lower, len, contains, position): ");
        String comando = scanner.nextLine();

        switch (comando) {

            case "upper":
                System.out.println(frase.toUpperCase());
                break;

            case "lower":
                System.out.println(frase.toLowerCase());
                break;

            case "len":
                System.out.println("Quantidade de caracteres: " + frase.length());
                break;

            case "contains":
                System.out.print("Digite a palavra-chave: ");
                String palavra = scanner.nextLine();

                if (frase.contains(palavra)) {
                    System.out.println("A palavra está contida na frase!");
                } else {
                    System.out.println("A palavra não contém dentro da frase!");
                }
                break;

            case "position":
                System.out.print("Digite o caractere: ");
                String caractereDigitado = scanner.nextLine();
                char caractere = caractereDigitado.charAt(0);

                int posicao = frase.indexOf(caractere);

                if (posicao == -1) {
                    System.out.println("Não foi possível encontrar o caractere na frase!");
                } else {
                    System.out.println("O caractere foi encontrado na posição: " + posicao);
                }
                break;

            default:
                System.out.println("Comando inválido!");
                break;
        }
    }
}
