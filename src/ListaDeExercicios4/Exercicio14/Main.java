package ListaDeExercicios4.Exercicio14;

import java.util.*;

/*Crie um programa que simule a coleta de votos para uma eleição em uma escola. O exercício
deve seguir esta lógica:
• Use um ArrayList para armazenar os votos recebidos, onde cada voto é o nome de
um candidato. Insira alguns votos repetidos para simular vários alunos votando no
mesmo candidato.
• Mostre todos os votos recebidos (ArrayList) e informe o total de votos.
• Converta o ArrayList em um HashSet para identificar os candidatos únicos que
receberam votos e exiba essa lista.
• Crie um HashMap para associar cada candidato à quantidade de votos recebidos,
percorrendo o ArrayList original.
• Exiba cada candidato e sua quantidade de votos, informando também o candidato
vencedor (quem recebeu mais votos).
• Por fim, pergunte ao usuário o nome de um candidato e informe quantos votos ele
recebeu (se não tiver recebido nenhum, informe zero).*/
public class Main {
    public static void main(String[] args) {

        List<String> votos = new ArrayList<>();
        votos.add("Guilherme");
        votos.add("Rhuan");
        votos.add("Guilherme");
        votos.add("Guilherme");
        votos.add("Juliano");
        votos.add("Guilherme");
        votos.add("Guilherme");
        votos.add("Rhuan");
        votos.add("Juliano");

        System.out.println("Votos: " + votos);
        System.out.println("Quatidade de votos: " + votos.size());

        HashSet<String> candidatosUnicos = new HashSet<>(votos);
        System.out.println("\nCandidatos que receberam votos");
        for (String candidato : candidatosUnicos) {
            System.out.println(candidato);
        }

        HashMap<String, Integer> contagem = new HashMap<>();

        for (String voto : votos) {
            if (contagem.containsKey(voto)) {
                contagem.put(voto, contagem.get(voto) + 1);
            } else {
                contagem.put(voto, 1);
            }
        }
        System.out.println("\nContagem de votos por candidato");
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " voto(s)");
        }

        System.out.println("\n=== Contagem de votos por candidato ===");
        String vencedor = "";
        int maiorQuantidade = 0;

        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            String candidato = entrada.getKey();
            int quantidade = entrada.getValue();

            System.out.println(candidato + ": " + quantidade + " voto(s)");

            if (quantidade > maiorQuantidade) {
                maiorQuantidade = quantidade;
                vencedor = candidato;
            }
        }

        System.out.println("\nCandidato vencedor: " + vencedor + " com " + maiorQuantidade + " voto(s)");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome de um candidato: ");
        String nomeBuscado = scanner.nextLine().trim();

        int votosDoCandidato = contagem.getOrDefault(nomeBuscado, 0);
        System.out.println(nomeBuscado + " recebeu " + votosDoCandidato + " voto(s).");
    }
}
