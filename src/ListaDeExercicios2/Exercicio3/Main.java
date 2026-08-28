package ListaDeExercicios2.Exercicio3;

/* Faça um algoritmo que simule um login simples. O sistema deve pedir que o usuário digite um
nome de usuário e uma senha. Considere como usuário correto "admin" e senha correta
"1234".
• Se os dois estiverem corretos, escreva em tela “Acesso permitido”;
• Se apenas o usuário estiver incorreto, escreva “Usuário inválido”;
• Se apenas a senha estiver incorreta, escreva “Senha incorreta”.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Login------------");
        System.out.println("Usuario: ");
        String usuario = scanner.next();
        System.out.println("Senha: ");
        String senha = scanner.next();

        if (usuario.equals("admin") && senha.equals("1234") ){
            System.out.println("Acesso permitido");
        } else if (!usuario.equals("admin")) {
            System.out.println("Usuario invalido");
        } else if (!senha.equals("1234")) {
            System.out.println("Senha incorreta");
        }
    }
}
