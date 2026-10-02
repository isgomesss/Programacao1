package ListaDeExercicios3.Exercicio9;

import java.util.Scanner;

/*Faça um algoritmo que simule um sistema simples de cadastro de usuários. O programa deverá
solicitar repetidamente um nome de usuário até que o usuário digite "fim". Para cada nome
informado:
• Verifique se possui pelo menos 5 caracteres;
• Verifique se começa com uma letra;
• Se as duas condições forem atendidas, informe "Usuário válido";
• Caso contrário, informe "Usuário inválido".
Ao final, mostre:
• Quantidade de usuários informados;
• Quantidade de usuários válidos;
• Quantidade de usuários inválidos.
A palavra "fim" não deve ser contabilizada.*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int validos = 0;
        int invalidos = 0;

        System.out.print("Digite um nome de usuário ou fim para encerrar: ");
        String nome = scanner.nextLine();

        while (!nome.equalsIgnoreCase("fim")) {
            total++;

            if (nome.length() >= 5 && Character.isLetter(nome.charAt(0))) {
                System.out.println("Usuário válido");
                validos++;
            } else {
                System.out.println("Usuário inválido");
                invalidos++;
            }

            System.out.print("Digite um nome de usuário (ou \"fim\" para encerrar): ");
            nome = scanner.nextLine();
        }

        System.out.println("Usuários informados: " + total);
        System.out.println("Usuários válidos: " + validos);
        System.out.println("Usuários inválidos: " + invalidos);

    }
}
