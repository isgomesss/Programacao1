package ListaDeExercicios4.Exercicio3;

import java.util.Scanner;

/*Crie um array com 6 nomes de alunos. Peça para o usuário digitar um nome e verifique se
ele existe na lista, ignorando maiúsculas e minúsculas. Se existir, mostre a posição (índice).
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = {"Ana", "Carol", "Michele", "Isadora", "Herom", "Gustavo"};
        int tentativa = 0;

        System.out.println("Digite um nome de alunos da sala: ");
        String tentativaNome = scanner.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            tentativa++;
            if (tentativaNome.equalsIgnoreCase(nomes[i])){
                System.out.println("Você acertou, posição: " + tentativa );
            } else {

            }
        }
    }
}
