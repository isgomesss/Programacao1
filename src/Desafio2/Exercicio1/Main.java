package Desafio2.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        int totalCaracteres = nome.length();

        int primeiroEspaco = nome.indexOf(" ");
        int ultimoEspaco = nome.lastIndexOf(" ");

        boolean silva =nome.contains("Silva");
        int posicaoSilva = nome.indexOf("Silva");

        char primeiraLetra = nome.charAt(0);
        boolean comecaComMaiuscula = Character.isUpperCase(primeiraLetra);

        char ultimaLetra = nome.charAt(totalCaracteres - 1);
        boolean terminaComMinuscula = Character.isLowerCase(ultimaLetra);


        System.out.println("--------Relatorio----------");
        System.out.println("Quantidade de caracter: " + totalCaracteres);

        if (primeiroEspaco == -1){
            System.out.println("O nome não possui sobre nome");
        }  else {
            System.out.println("Posição do primeiro espaço em branco: " + primeiroEspaco);
            System.out.println("Posição do último espaço em branco: " + ultimoEspaco);
        }
        if (silva) {
            System.out.println("O nome contém o sobrenome Silva, começando na posição: " + posicaoSilva);
        } else {
            System.out.println("O nome não contém o sobrenome Silva.");
        }

        if (comecaComMaiuscula) {
            System.out.println("O nome começa com letra maiúscula.");
        } else {
            System.out.println("O nome NÃO começa com letra maiúscula.");
        }

        if (terminaComMinuscula) {
            System.out.println("O nome termina com letra minúscula.");
        } else {
            System.out.println("O nome NÃO termina com letra minúscula.");
        }

    }
}
