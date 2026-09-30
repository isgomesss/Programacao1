package Desafio2.Exercio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a leitura de temperatura (ex: 36.5C ou 98.6F): ");
        String leitura = scanner.nextLine();


        char escala = leitura.charAt(leitura.length() - 1);
        String parteNumerica = leitura.substring(0, leitura.length() - 1);

        double valor = Double.parseDouble(parteNumerica);
        double celsius;

        if (escala == 'F') {
            celsius = (valor - 32) * 5 / 9;
        } else if (escala == 'C') {
            celsius = valor;
        } else {
            System.out.println("Escala inválida");
            scanner.close();
            return;
        }

        String classificacao;
        if (celsius >= 37.8) {
            classificacao = "Febre";
        } else {
            classificacao = "Normal";
        }

        System.out.println("Leitura original: " + leitura);
        System.out.println("Valor convertido em Celsius: " + celsius);
        System.out.println("Classificação: " + classificacao);
    }
}
