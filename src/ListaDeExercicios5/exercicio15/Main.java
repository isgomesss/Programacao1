package ListaDeExercicios5.exercicio15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void adicionarNota(ArrayList<Double> notas, double nota) throws Exception {
        if (nota < 0 || nota > 10) {
            throw new Exception("Nota inválida! Deve ser entre 0 e 10.");
        }
        notas.add(nota);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");
        double nota = scanner.nextDouble();

        while (nota != -1) {
            try {
                adicionarNota(notas, nota);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            nota = scanner.nextDouble();
        }

        System.out.println("\nNotas cadastradas:");
        double soma = 0;
        for (double n : notas) {
            System.out.println(n);
            soma += n;
        }

        if (notas.size() > 0) {
            System.out.println("Média: " + soma / notas.size());
        } else {
            System.out.println("Nenhuma nota cadastrada.");
        }
    }
}
