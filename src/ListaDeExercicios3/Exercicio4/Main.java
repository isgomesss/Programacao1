package ListaDeExercicios3.Exercicio4;

import java.util.Scanner;

/*Escreva um algoritmo que leia uma lista de nomes do usuário até encontrar o nome
"fim" e depois imprima a quantidade de nomes lidos (excluindo o "fim").6*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;

        System.out.println("Digite o nome dos usuarios, ou 'fim' para terminar: ");
        String nome = scanner.nextLine();

        while (!nome.equals("fim")){
            quantidade++;
            System.out.println("Digite o nome dos usuarios, ou 'fim' para terminar: ");
            nome = scanner.nextLine();
        }

        System.out.println("Quantidade de noems lidos: " + quantidade);
    }
}
