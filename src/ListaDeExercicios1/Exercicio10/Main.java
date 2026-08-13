package ListaDeExercicios1.Exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a massa do objeto (kg):");
        double m = scanner.nextDouble();

        System.out.println("Digite a velocidade do objeto (m/s):");
        double v = scanner.nextDouble();

        double energiaCinetica = (m * v * v) / 2;

        double G = 9.8;
        double energiaPotencial = energiaCinetica;
        double hAltura = energiaPotencial / (m * G);

        System.out.println("Energia Cinética: " + energiaCinetica);
        System.out.println("Altura correspondente: " + hAltura);
    }
}
