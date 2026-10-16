package ListaDeExercicios4.Exercicio9;

import java.util.ArrayList;
import java.util.List;

/*Crie um ArrayList com 10 números inteiros e implemente funcionalidades para:
• Exibir todos os números;
• Exibir apenas os pares;
• Exibir apenas os ímpares;
• Exibir a soma de todos os elementos;
• Exibir o maior e o menor número.*/
public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        System.out.println(numeros);

        int[] pares = new int [10];
        int[] impares = new int [10];

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) % 2 == 0){
                pares[i] = numeros.get(i);
            } else {
                impares[i] = numeros.get(i);
            }
        }

        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        System.out.println("A soma dos numeros é: "+ soma);

        int menor = numeros.get(0);
        int maior = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > menor){
                maior = numeros.get(i);
            }
            if (numeros.get(i) < menor){
                menor = numeros.get(i);
            }
        }

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
    }
}