package Revisao;

import java.util.Scanner;
/*Crie um programa Java que armazene em um array unidimensional de 6 posições os valores
das temperaturas médias diárias de uma semana. Esses valores devem ser digitados pelo
usuário e armazenados como double. Depois, o programa deve exibir:
• Todas as temperaturas digitadas;
• A média semanal de temperatura;
• Quantos dias ficaram acima da média*/
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperatura = new double[5];
        double soma = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Digite a teperatura media diaria da semana: ");
            temperatura[i] = scanner.nextDouble();
            soma += temperatura[i];
        }

        double media = soma / 6;
        int acima = 0;

        System.out.println("Temperaturas digitadas: ");
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println(temperatura[i]);
            if (temperatura[i] > media ){
                acima++;
            }
        }
        System.out.println("Média semanal: " + media);
        System.out.println("Dias acima da média: " + acima);

    }
}
