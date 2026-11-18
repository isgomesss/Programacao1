package Revisao;

import java.util.Scanner;

/*Crie um programa em Java que permita ao usuário digitar uma frase qualquer. O programa
deverá ter uma função chamada contarVogais( ), que receberá a frase digitada e retornará a
quantidade de vogais presentes nela (a, e, i, o, u), tanto maiúsculas quanto minúsculas. Além
disso, o programa também deverá ter uma segunda função chamada inverterTexto( ), na qual
receberá a mesma frase informada inicialmente e retornará essa frase de forma invertida, ou
seja, com os caracteres na ordem inversa. Na função main, o programa deve solicitar ao
usuário que digite a frase, chame as funções contarVogais e inverterTexto e exiba no console:
• A frase informada pelo usuário;
• A quantidade de vogais encontradas;
• A frase com os caracteres na ordem inversa*/
public class ex7 {
    public static int contarVogais(String frase) {
        int contador = 0;
        String minuscula = frase.toLowerCase();

        for (int i = 0; i < minuscula.length(); i++) {
            char c = minuscula.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static String inverterTexto(String frase) {
        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        return invertida;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int vogais = contarVogais(frase);
        String invertida = inverterTexto(frase);

        System.out.println("Frase informada: " + frase);
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Frase invertida: " + invertida);
    }
}
