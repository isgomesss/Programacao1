package ListaDeExercicios5.Exercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void reservar(boolean[][] sala, int fila, int assento) {
        if (sala[fila][assento]) {
            throw new IllegalStateException();
        }
        sala[fila][assento] = true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] sala = new boolean[4][6]; // tudo começa como false (livre)

        while (true) {
            try {
                System.out.print("Digite a fila (0 para sair): ");
                int fila = scanner.nextInt();

                if (fila == 0) {
                    break;
                }

                System.out.print("Digite o assento: ");
                int assento = scanner.nextInt();

                // o usuário digita a partir de 1, o array começa em 0
                reservar(sala, fila - 1, assento - 1);
                System.out.println("Assento reservado com sucesso!");

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um número inteiro válido.");
                scanner.next(); // descarta o valor inválido para não repetir o erro
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: fila ou assento inexistente.");
            } catch (IllegalStateException e) {
                System.out.println("Erro: assento já ocupado.");
            }
        }

        System.out.println("Reservas encerradas.");
    }
}
