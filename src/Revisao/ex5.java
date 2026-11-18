package Revisao;

import java.util.ArrayList;

/*Crie um programa Java que contenha um ArrayList com 10 números inteiros e implemente
funcionalidades para:
• Exibir todos os números;
• Exibir apenas os pares;
• Exibir apenas os ímpares;
• Exibir a soma de todos os elementos;Exibir o maior e o menor número*/
public class ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(7);
        numeros.add(3);
        numeros.add(20);
        numeros.add(15);
        numeros.add(8);
        numeros.add(1);
        numeros.add(30);
        numeros.add(9);
        numeros.add(4);

        int soma = 0;
        int maior = numeros.get(0);
        int menor = numeros.get(0);

        System.out.println("Todos os números:");
        for (int n : numeros) {
            System.out.println(n);
            soma += n;
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }

        System.out.println("Pares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        System.out.println("Ímpares:");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
