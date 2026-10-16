package ListaDeExercicios4.Exercicio7;

import java.util.Scanner;

/* Com a matriz do exercício anterior, percorra usando for-each para exibir todos os dias
consecutivamente, separados por espaço.
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int[][] calendario = new int[12][];
        int[] diaDoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < 12; i++) {
            calendario[i] = new int[diaDoMes[i]];
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                calendario[i][j] = j + 1;
            }
        }

        System.out.println("Digite o mes de 1 a 12: ");
        int mes = scanner.nextInt();

        System.out.println("Mes " + mes + ": ");
        for (int dia : calendario[mes - 1]) {
            System.out.println(dia);
        }

        System.out.println(" ");
    }
}
