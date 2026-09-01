package ListaDeExercicios2.Exercicio7;

/*Faça um algoritmo que leia três palavras digitadas pelo usuário. O programa deve comparar o
tamanho das palavras (quantidade de caracteres) e escrever em tela qual é a maior palavra.
Caso exista um empate entre duas ou mais palavras, escreva em tela: “Duas ou mais palavras
possuem o mesmo tamanho*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[3];

        for (int i = 0; i < palavras.length ; i++) {
            System.out.println("Digite a " + (i+1) + " palavra: ");
            palavras[i]= scanner.nextLine();
        }

        //Verifica maior tamanho
        int maiorTamanho = 0;
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maiorTamanho) {
                maiorTamanho = palavras[i].length();
            }
        }

        //valida tamanho
        int quantidadeMaiorTamanho = 0;
        String maiorPalavra = "";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() == maiorTamanho){
                quantidadeMaiorTamanho++;
                maiorPalavra = palavras[i];
            }
        }

        if (quantidadeMaiorTamanho > 1){
            System.out.println("Duas ou mais palavras possuem o mesmo tamanho!");
        } else {
            System.out.println("A maior palavra é: " + maiorPalavra);
        }


    }
}
