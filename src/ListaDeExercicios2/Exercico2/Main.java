package ListaDeExercicios2.Exercico2;

import java.util.Scanner;

/*Faça um algoritmo que peça ao usuário digitar um e-mail. O programa deve verificar se o texto
digitado contém o caractere @ e termina com .com. Caso atenda a essas condições, escreva
em tela “E-mail válido”. Caso contrário, escreva “E-mail inválido”.
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);

        System.out.println("Digite um email: ");
        String email = scanner.next();

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Email válido");
        }
        else {
            System.out.println("Email invalido");
        }
    }
}
