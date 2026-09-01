package ListaDeExercicios2.Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------Menu--------------");
        System.out.println("1- Pizza de Calabresa (R$ 40,00)");
        System.out.println("2- Pizza de Mussarela (R$38,00)");
        System.out.println("3- Pizza de Frango (R$ 42,00)");
        System.out.println("4- Refrigerante (R$ 8,00)");
        System.out.println("5- Suco (R$ 10,00)");

        System.out.println("Digite uma opção");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("1- Pizza de Calabresa (R$ 40,00)");
                break;
            case 2:
                System.out.println("2- Pizza de Mussarela (R$38,00)");
                break;
            case 3:
                System.out.println("3- Pizza de Frango (R$ 42,00)");
                break;
            case 4 :
                System.out.println("4- Refrigerante (R$ 8,00)");
                break;
            case 5:
                System.out.println("5- Suco (R$ 10,00)");
        }
    }
}
