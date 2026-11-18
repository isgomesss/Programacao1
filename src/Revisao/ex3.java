package Revisao;
/*Crie programa Java que armazene um array bidimensional 3x3 que contenha notas de 3 alunos
em 3 provas. Portanto, cada linha do meu array bidimensional vai representar um aluno. Na
sequência crie um array unidimensional com 3 nomes de alunos. Calcule a média de cada
aluno e exiba no console. Posteriormente, indique qual aluno teve a maior média e o seu nome*/
public class ex3 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Isadora", "Carol"};

        double[][] notas = {
                {7.5, 8.5, 9.5},
                {8.5, 8.0, 9.0},
                {9.0, 9.5, 8.0}
        };

        double maiorMedia = 0;
        String melhorAluno = "";

        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }
            double media = soma / 3;
            System.out.println("Média de " + nomes[i] + ": " + media);

            if (media > maiorMedia) {
                maiorMedia = media;
                melhorAluno = nomes[i];
            }
        }
        System.out.println("Maior média: " + maiorMedia);
        System.out.println("Aluno: " + melhorAluno);

    }
}
