package ListaDeExercicios2.Exercico1;
/*Faça um algoritmo em que o usuário informe uma palavra. Posteriormente, crie uma condição
para validar que se a palavra tiver mais que 20 caracteres, escrever no terminal que a “palavra
é muito grande”. Caso contrário, informe que a “palavra é pequena”.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();

        if (palavra.length() > 20){
            System.out.println("A palavra é muito grande ");
        } else {
            System.out.println("A palavra é pequena");
        }

    }
}
