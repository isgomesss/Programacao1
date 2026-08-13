package ListaDeExercicios1.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Faça um algoritmo que:
➢ receba do usuário o nome, sobrenome e a função de um funcionário de uma empresa de
software, e guarde essas informações em suas próprias variáveis.
➢ peça ao usuário o salário, um valor de gratificação e um valor de desconto e guarde esses
valores em suas próprias variáveis.
➢ Mostre na tela um relatório com o seguinte formato:
• Nome completo:
• Função:
• Salário:
• Gratificação:
• Desconto:
• Salário Final.
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua função na empresa?");
        String funcao = scanner.nextLine();

        System.out.println("Qual o seu salario na empresa?");
        double salario = scanner.nextDouble();

        System.out.println("Qual o seu valor de gratificação?");
        double gartificacao = scanner.nextDouble();

        System.out.println("Qual seu valor de desconto?");
        double desconto = scanner.nextDouble();

        double salarioFinal = salario - desconto + gartificacao;

        System.out.println("------------RELATORIO---------------");
        System.out.println("Nome completo: " + nome
                + "\nFunção: " + funcao
                + "\nSalario: " + salario
                + "\nGratificação: " + gartificacao
                + "\nDesconto: " + desconto
                + "\nSalario final: " + salarioFinal);
    }
}
