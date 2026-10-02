package ListaDeExercicios3.Exercicio10;

/*10. Faça um algoritmo que solicite ao usuário várias palavras. O programa deverá continuar
solicitando palavras até que o usuário digite "fim". Para cada palavra informada, mostre:
• A quantidade de caracteres;
• Se a palavra possui mais ou menos de 5 caracteres.
Ao finalizar, apresente:
• A quantidade total de palavras digitadas;
• A quantidade de palavras com mais de 5 caracteres;
• A quantidade de palavras com 5 caracteres ou menos;
• A maior palavra digitada.
A palavra "fim" não deve ser contabilizada.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        int quantmais5 = 0;
        int quantCOm5OuMais = 0;
        String fim = "fim";
        String maiorPalavra = "a";

        System.out.println("Digite varias palavras ou digite fim: ");
        String palavras = scanner.nextLine();

        while (!palavras.equalsIgnoreCase("fim")) {

            System.out.println("Quantidade de caracteres : " + palavras.length());

            if (palavras.length() > 5) {
                System.out.println("A palavra possui mais de 5 caracteres!");
                quantmais5++;
            } else {
                System.out.println("A palavra possui 5 ou menos caracteres!");
                quantCOm5OuMais++;
            }
            quantidade++;

            if (palavras.length() > maiorPalavra.length()) {
                maiorPalavra = palavras;
            }

            System.out.println("Digite varias palavras ou digite fim: ");
            palavras = scanner.nextLine();
        }


        System.out.println("Palaras digitadas: " + quantidade);
        System.out.println("Palaras com mais de 5 caracteres: " + quantmais5);
        System.out.println("Palaras com 5 ou menos caracteres: " + quantCOm5OuMais);


        if (quantidade > 0) {
            System.out.println("Maior palavra digitada: " + maiorPalavra);
        } else {
            System.out.println("Nenhuma palavra foi digitada.");
        }
    }
}
