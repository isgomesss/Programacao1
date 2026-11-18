package ListaDeExercicios5.Exercicio13;

import java.util.Scanner;

public class Main {
    public static int calcular(int a, int b, char operador) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b; // com int, dividir por zero lança ArithmeticException
            default:
                throw new IllegalArgumentException("Operador inválido");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        try {
            int resultado = calcular(a, b, operador);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operação finalizada");
        }
    }
}
