package ListaDeExercicios5.Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crie um programa em Java que peça ao usuário para digitar alguns nomes (um por linha) e
armazene todos eles em um ArrayList. A digitação deve parar quando o usuário digitar a
palavra "fim”. Após isso, o programa deve chamar uma função que receba esse ArrayList
como parâmetro e retorne um novo ArrayList somente com os nomes que tenham mais de 5
caracteres. Mostre no final os nomes filtrados.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        int fim = 0;

        while (fim == 0) {
            System.out.println("Digite um nome, ou digite fim para parar");
            String nome = scanner.next();

            if (nome == "fim"){
                fim++;
            }

            nomes.add(nome);
        }

        List<String> nomesFiltro = nomesCom5Caracteres(nomes);

        for (String nomess : nomesFiltro){
            System.out.println(nomess + ", ");
        }


    }

    public static List<String> nomesCom5Caracteres(List<String> parametro){
    List<String> listaNomes = new ArrayList<>();

    for (String nome : parametro){
        if (nome.length() > 5){
            listaNomes.add(nome);
        }
    }
    return listaNomes;

    }
}
