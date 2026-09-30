package ListaDeExercicios3.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUM_MAX = 3;
        int tentativa = 0;
        String usuario = "isadora";
        int senha = 2807;
        boolean logado = false;


        while (tentativa != NUM_MAX){

        System.out.println("----------Login-------------");

            System.out.println("Digite seu usuario: ");
            String tentativaUsuario = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            int tentativaSenha = scanner.nextInt();

            tentativa++;

            if (usuario.equals(tentativaUsuario) && tentativaSenha == senha) {
                System.out.println("Parabéns! Usuário logado");
                logado = true;
            } else if (usuario.equals(tentativaUsuario)) {

                System.out.println("Senha incorreta");
            } else {
                System.out.println("Usuário incorreto");
            }
        }
        if (!logado) {
            System.out.println("Que pena você esgotou suas tentativas de login, tente novamente mais tarde.");
        }

    }
}

