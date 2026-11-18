package Revisao;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor original do produto: ");
        double valorOriginal = sc.nextDouble();

        System.out.println("Informe o percentual de desconto (%)");
        double percentual = sc.nextDouble();

        double valorFinal = calcularDesconto(valorOriginal, percentual);
        String classificacao = mensagemFaixa(valorFinal);

        System.out.println("\nValor com desconto: " + valorFinal);
        System.out.println("Classificacao: " + classificacao);
    }

    public static double calcularDesconto(double valor, double percent) {
        double desconto = valor * (percent/100);
        return valor - desconto;
    }

    public static String mensagemFaixa(double valorFinal) {
        if(valorFinal  <= 50) {
            return "Preco baixo";
        } else if(valorFinal > 200) {
            return "Preco alto";
        } else {
            return "Preco medio";
        }
    }
    /* Crie um programa Java que implemente as seguintes funções:
• calcularDesconto(double valor, double percentual) → retorna o valor com desconto
aplicado;
• mensagemFaixa(double valorFinal) → retorna uma mensagem de acordo com a faixa
de preço fina, sendo elas:
o Valor final até 50 → “Preço baixo”;
o Valor entre 50 e 200 → “Preço médio”;
o Valor acima de 200 → “Preço alto”.
Na main, peça ao usuário o valor original e o percentual de desconto, chame as duas
funções e exiba no console o valor com desconto e a faixa de classificação que ele se
encontra.*/
}
