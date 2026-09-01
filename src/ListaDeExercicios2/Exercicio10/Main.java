package ListaDeExercicios2.Exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cores e valores:");
        System.out.println("Vermelha - R$30,00");
        System.out.println("Azul - R$35,00");
        System.out.println("Verde - R$40,00");
        System.out.println("Preta - R$50,00");

        System.out.println("Digite a cor desejada: ");
        String camiseta = scanner.next();

        switch (camiseta){
            case "Vermelho":
                System.out.println("Vermelha - R$30,00");
                break;
            case "Azul":
                System.out.println("Azul - R$35,00");
                break;
            case "Verde":
                System.out.println("Verde - R$40,00");
                break;
            case "Preto":
                System.out.println("Verde - R$40,00");
                break;
            default:
                System.out.println("Produto indisponivel!");
        }

    }
}
