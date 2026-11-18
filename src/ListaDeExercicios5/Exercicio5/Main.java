package ListaDeExercicios5.Exercicio5;

import java.util.Scanner;

/* Faça um programa Java para realizar o cálculo de um fatorial baseado em um valor informado
pelo usuário. Tanto para calcular, quanto para imprimir o fatorial, utilize de funções.*/
public class Main {

    public static int calculoFatorial(int valorFuncao){
        int conta = 1;
        for (int i = 1; i <= valorFuncao ; i++) {
            conta = conta * i;
        }
        return conta;
    }

    public static void  mostrar (int valor, int resultado){
        System.out.println("Numero digitado: " + valor + ", fatorial: " + resultado);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        int resultado = calculoFatorial(valor);
        mostrar(valor, resultado);
    }
}
