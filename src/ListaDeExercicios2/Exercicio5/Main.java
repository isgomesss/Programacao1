package ListaDeExercicios2.Exercicio5;

/*. Faça um algoritmo que classifique uma palavra digitada pelo usuário. O programa deve solicitar
que o usuário digite uma palavra.
• Se a palavra começar com uma vogal, escreva em tela: “A palavra começa com vogal”.
• Se a palavra começar com uma consoante, escreva em tela: “A palavra começa com
consoante”.
• Se o primeiro caractere não for uma letra, escreva em tela: “Entrada inválida”.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vogais = "AEIOU";

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();

        char caracter = palavra.charAt(0);

        if (!Character.isLetter(caracter)){
            System.out.println("Entrada invalida");
        }
        else if (palavra.startsWith("a")||palavra.startsWith("e")||palavra.startsWith("i")||palavra.startsWith("o")||palavra.startsWith("u")) {
            System.out.println("A palavra começa com uma vogal");
        } else {
            System.out.println("A palavra começa com uma consoante");
        }
    }
}
