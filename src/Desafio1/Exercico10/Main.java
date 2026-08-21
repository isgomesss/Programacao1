package Desafio1.Exercico10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ObjetoFisico objetoFisico = new ObjetoFisico();

        System.out.println("Digite a massa do objeto (kg):");
        objetoFisico.massa = scanner.nextDouble();

        System.out.println("Digite a velocidade do objeto (m/s):");
        objetoFisico.velocidade = scanner.nextDouble();


        System.out.println("Energia Cinética: " + objetoFisico.calcularEnergiaCinetica());
        System.out.println("Altura correspondente: " + objetoFisico.calcularAlturaEquivalente());

    }
}
