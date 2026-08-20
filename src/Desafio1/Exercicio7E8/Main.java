package Desafio1.Exercicio7E8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();


        System.out.println("Digite seu nome completo: ");
        funcionario.nome = scanner.nextLine();

        System.out.println("Qual a sua função na empresa?");
        funcionario.funcao = scanner.nextLine();

        System.out.println("Qual o seu salario na empresa?");
        funcionario.salario = scanner.nextDouble();

        System.out.println("Qual o seu valor de gratificação?");
        funcionario.gratificacao = scanner.nextDouble();

        System.out.println("Qual seu valor de desconto?");
        funcionario.desconto = scanner.nextDouble();

        System.out.println(funcionario.relatorio());

    }
}
