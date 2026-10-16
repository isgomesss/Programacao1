package ListaDeExercicios4.Exercicio12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Crie um programa que utilize um HashMap para armazenar nomes de alunos e suas
respectivas notas. Para isso:
• Adicione pelo menos 5 pares (nome → nota);
• Permita que o usuário consulte a nota de um aluno digitando o nome;
• Exiba todos os alunos com suas notas;
• Mostre qual aluno teve a maior nota.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> nomeNotas = new HashMap<>();
        nomeNotas.put("João Marcelo", 8.0);
        nomeNotas.put("Isadora", 8.5);
        nomeNotas.put("Pedro", 5.0);
        nomeNotas.put("Coroline", 9.0);
        nomeNotas.put("Leticia", 7.0);

        System.out.println("Digite um nome para consultar: ");
        String consulta = scanner.nextLine();
        if (nomeNotas.containsKey(consulta)){
            System.out.println(nomeNotas.get(consulta));
        }

        System.out.println("");


        double maiorNota = 0;

        for (Map.Entry<String, Double> item : nomeNotas.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue());

            if (item.getValue() > maiorNota){
                maiorNota = item.getValue();
            }
        }
        System.out.println("");

        System.out.println("Maior nota: " + maiorNota);

    }
}
