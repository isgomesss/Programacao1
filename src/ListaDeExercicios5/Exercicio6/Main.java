package ListaDeExercicios5.Exercicio6;

import java.util.Scanner;

/*Agora faça o mesmo cálculo de fatorial do exercício anterior, nas mesmas condições, mas
utilize de função recursiva para calcular o fatorial.*/
public class Main {
    public static int calculoFatorial(int valorFuncao){
        if (valorFuncao <= 1){
            return 1;
        }
        return valorFuncao * calculoFatorial(valorFuncao - 1);
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