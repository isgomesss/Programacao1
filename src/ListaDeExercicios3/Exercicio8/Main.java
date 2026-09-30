package ListaDeExercicios3.Exercicio8;

import java.util.Scanner;

/**/
/* Faça um algoritmo que solicite ao usuário uma palavra e mostre a palavra original e a palavra
invertida. Posteriormente, verifique se a palavra é um palíndromo, ou seja, se pode ser lida
da mesma forma da esquerda para a direita e da direita para a esquerda.
Exemplo 1:
Digite uma palavra: radar
Palavra original: radar
Palavra invertida: radar
É um palíndromo? Sim
Exemplo 2:
Digite uma palavra: java
Palavra original: java
Palavra invertida: avaj
É um palíndromo? Não*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palavraInversa = "";

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        for (int i = palavra.length() -1; i >= 0 ; i--) {
            palavraInversa += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + palavraInversa);

        if (palavra.equalsIgnoreCase(palavraInversa) == true){
            System.out.println("A palavra é um plindromo? Sim!");
        } else {
            System.out.println("A palavra é um polindromo? Nâo!");
        }
    }
}
