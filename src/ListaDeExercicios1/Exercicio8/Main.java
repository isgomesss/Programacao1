package ListaDeExercicios1.Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Crie um algoritmo que leia o salário atual de um funcionário. Se o salário for menor que R$1000,
aplique um aumento de 10%; caso contrário, aplique um aumento de 5%. Exiba o novo salário.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu salario? ");
        double salario = scanner.nextDouble();
        if (salario < 1000.00){
        double novoSalario = salario * 1.01;

            System.out.println("Seu novo salario é: " + novoSalario);
        }

        else if (salario > 1000.00) {
            double novoSalario = salario * 1.05;
            System.out.println("Seu novo salario é: " + novoSalario);
        }
    }
}
