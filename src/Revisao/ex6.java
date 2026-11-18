package Revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Crie um programa em Java que armazene em um ArrayList<String> nomes de cidades
visitadas por um usuário. O programa deve permitir que o usuário informe os nomes em um
looping até digitar a palavra "fim". Após isso, exiba no terminal todas as cidades cadastradas.
Peça para o usuário informar uma letra ou palavra qualquer e filtre sua lista para mostrar
apenas as cidades que contenham aquela letra ou palavra.
*/
public class ex6 {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome das cidades que voce visitou." +
                "\nPara encerrar, digite a palavra \"fim\": ");
        String cidade = "";
        do {
            System.out.println("Informe o nome da cidade:");
            cidade = sc.next();

            if(!cidade.equalsIgnoreCase("fim")) {
                cidades.add(cidade);
            }
        } while (!cidade.equalsIgnoreCase("fim"));

        for (int i = 0; i < cidades.size(); i++) {
            System.out.println("- " + cidades.get(i));
        }

        System.out.println("Informe uma letra ou palavra para filtrar as cidade:");
        String filtro = sc.next().toLowerCase();

        for(int i = 0; i < cidades.size(); i++) {
            if(cidades.get(i).toLowerCase().contains(filtro)) {
                System.out.println("- " + cidades.get(i));
            }
        }
    }
}
