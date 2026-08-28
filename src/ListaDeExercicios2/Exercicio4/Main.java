package ListaDeExercicios2.Exercicio4;

/* Faça um algoritmo em que o usuário informe duas palavras. Faça uma comparação de Strings
para dizer se as palavras são iguais ou não, e apresente o resultado na tela do terminal.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a 1 palavra: ");
        String palavra1 = scanner.next();

        System.out.println("Digite a 2 palavra: ");
        String palavra2 = scanner.next();

        if (palavra1.equals(palavra2)){
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras não são iguais");
        }
    }
}
