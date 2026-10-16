package ListaDeExercicios4.Exercicio13;

import java.util.*;

/*Crie um programa para gerenciar inscrições em um curso online. Comece usando um
ArrayList para armazenar os nomes dos alunos inscritos, incluindo alguns nomes repetidos
de propósito. Em seguida, exiba a lista completa de inscrições e informe o total de inscrições
realizadas, incluindo duplicatas. Depois, converta o ArrayList em um HashSet para remover
as duplicatas, mostrando a quantidade de alunos únicos e os nomes correspondentes. Em
seguida, solicite que o usuário digite um nome e informe se esse aluno está inscrito,
verificando na lista do HashSet. Por fim, exiba quais alunos aparecem mais de uma vez na
lista original, indicando quantas vezes cada um se repetiu.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inscricoes = new ArrayList<>();
        inscricoes.add("Ana");
        inscricoes.add("Bruna");
        inscricoes.add("Claudia");
        inscricoes.add("Ana");
        inscricoes.add("Diego");
        inscricoes.add("Joao");
        inscricoes.add("Ana");
        inscricoes.add("Elisa");
        inscricoes.add("Fernanda");
        inscricoes.add("Joao");

        System.out.println("Lista completa de inscrições:");
        for (String nome : inscricoes) {
            System.out.println(nome);
        }

        System.out.println("Total de inscrições: " + inscricoes.size());

        Set<String> alunosUnicos = new HashSet<>(inscricoes);

        System.out.println("\nAlunos únicos: " + alunosUnicos.size());
        System.out.println("Nomes: " + alunosUnicos);

        System.out.print("\nDigite um nome para verificar a inscrição: ");
        String busca = scanner.nextLine();

        if (alunosUnicos.contains(busca)) {
            System.out.println(busca + " está inscrito(a) no curso.");
        } else {
            System.out.println(busca + " NÃO está inscrito(a) no curso.");
        }

        Map<String, Integer> contagem = new HashMap<>();
        for (String nome : inscricoes) {
            contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
        }

        System.out.println("\nAlunos com inscrições repetidas:");
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            if (entrada.getValue() > 1) {
                System.out.println(entrada.getKey() + " aparece " + entrada.getValue() + " vezes");
            }

        }
    }
}