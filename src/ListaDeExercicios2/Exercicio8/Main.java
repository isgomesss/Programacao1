package ListaDeExercicios2.Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] prova = new double[2];
        double[] trabalho = new double[2];

        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        for (int i = 0; i < prova.length; i++) {
            System.out.println("Digite a " + (i+1) + " nota de prova: ");
            prova[i] = scanner.nextDouble();
        }

        for (int i = 0; i < trabalho.length; i++) {
            System.out.println("Digite a " + (i+1) + " nota de trabalho: ");
            trabalho[i] = scanner.nextDouble();
        }

        int pesoProvas = 7;
        int pesoTrabalho = 3;
        double somaPonderada = 0;

        for (int i = 0; i < prova.length; i++) {
            somaPonderada += prova[i] * pesoProvas;
        }

        for (int i = 0; i < trabalho.length; i++) {
            somaPonderada += trabalho[i] * pesoTrabalho;
        }

        double soma = (pesoProvas * prova.length) + (pesoTrabalho * trabalho.length);
        double media = somaPonderada / soma;

        if (media >= 6){
            System.out.println("Aluno: " + aluno + ", Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno: "+ aluno + ", em Recuperação");
        } else if (media < 5) {
            System.out.println("aluno: " + aluno + ", Reprovado");
        }

    }
}
