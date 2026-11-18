package Revisao;

import java.util.Scanner;

//Crie um programa Java que armazene um array unidimensional com 6 nomes de alunos
//(definidos diretamente na sua declaração). Peça para o usuário digitar um nome e verifique se
//ele existe na lista, ignorando maiúsculas e minúsculas. Se existir, mostre a posição (índice)
//caso ele não se repita dentro do array. Caso ele se repita, informe quantas vezes ele aparece
//no array e em quais posições foi encontrado
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alunos = {"Isadora", "Ana", "Herom", "Carol", "Gabriela", "Michele" };

        System.out.println("Digte um nome: ");
        String nome = scanner.next();

        int contador = 0;
        int indice = -1;
        String indices = "";

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].equalsIgnoreCase(nome)){
                if (contador==0){
                    indice = i;
                    indices = "" + i;
                } else {
                    indices += ", " + i;
                }
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("O nome " + nome + " não foi encontrado na lista");
        } else if (contador == 1) {
            System.out.println("O nome " + nome + " esta na posição " + indice);
        } else {
            System.out.println("O nome " + nome + " aparece " + contador + " vezes, nas posições " + indices);
        }
    }
}
