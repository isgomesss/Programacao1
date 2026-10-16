package ListaDeExercicios4.Exercicio6;

import java.util.Scanner;

/*Crie uma matriz irregular representando os dias de cada mês (ex.: fevereiro com 28 dias, abril
com 30, etc., simplifique sem ano bissexto). Preencha cada posição com o número do dia e
exiba o calendário do mês escolhido pelo usuário.*/
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
        for (int i = 0; i < calendario[mes - 1].length; i++) {
            System.out.println(calendario[mes - 1][i] + " ");
        }


    }
}
