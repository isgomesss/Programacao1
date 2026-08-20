package Desafio1.Exercicio7E8;

public class Funcionario {

    String nome;
    String funcao;
    double salario;
    double gratificacao;
    double desconto;
    double novoSalario;
    double salarioFinal;

    double salarioFinal (){
    salarioFinal = reajusteSalario() - desconto + gratificacao;
        return salarioFinal;
    }

    double reajusteSalario(){
        if (salario < 1000.00){
            novoSalario = salario * 1.01;
            return novoSalario;
        } else if (salario >= 1000.00) {
             novoSalario = salario * 1.05;
            return novoSalario;
            }
        return novoSalario;
    }

    public String relatorio(){
        salarioFinal();
        System.out.println("-----------------RELATORIO--------------------");
        return ("Nome: " + nome
                + "\nFunção: " + funcao
                + "\nSalario: " + salario
                + "\nGratificação: " + gratificacao
                + "\nDesconto: " + desconto
                + "\nNovo Salario : " + salarioFinal);
    }
}
