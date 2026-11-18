package Revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] jogadores = new String[4];
        double[] medias = new double[4];

        for(int i = 0; i < jogadores.length; i++) {
            System.out.println("Informe o nome do jogador " + (i+1) + ":");
            jogadores[i] = sc.next();
        }

        double somaMedias = 0;
        for(int i = 0; i < jogadores.length; i++) {
            List<Integer> pontuacoes = new ArrayList<>();

            while (pontuacoes.size() < 3) {
                System.out.println(jogadores[i] + " - pontuacao da partida " +
                        (pontuacoes.size() + 1) + ": " );
                int pontos = sc.nextInt();

                adicionarPontuacao(pontuacoes, pontos);
            }

            medias[i] = mediaPontuacao(pontuacoes);
            somaMedias += medias[i];
        }

        int iMaior = 0, iMenor = 0;
        for (int i = 1; i < medias.length; i++) {
            if(medias[i] > medias[iMaior]) {
                iMaior = i;
            }
            if(medias[i] < medias[iMenor]) {
                iMenor = i;
            }
        }

        System.out.println("---- Resultado ----");
        for(int i = 0; i < jogadores.length; i++) {
            System.out.printf("Media de %s: %.2f%n", jogadores[i], medias[i]);
        }
        System.out.println("Maior media: " + iMaior);
        System.out.println("Menor media: " + iMenor);
        System.out.println("Media geral: " + (somaMedias/jogadores.length));
    }

    public static void adicionarPontuacao(List<Integer> pontuacoes, int pontos) {
        if(pontos < 0 || pontos > 100) {
            throw new IllegalArgumentException("Pontuacao invalida! Informe um" +
                    "valor que esteja entre 0 e 100 pontos.");
        }
        pontuacoes.add(pontos);
    }

    public static double mediaPontuacao(List<Integer> pontuacoes) {
        double soma = 0;
        for (int i = 0; i < pontuacoes.size(); i++) {
            soma += pontuacoes.get(i);
        }
        return soma / pontuacoes.size();
    }
}
