package ListaDeExercicios4.Exercicio8;

/*8. Crie um programa que utilize um ArrayList de Strings para armazenar nomes de cidades. O
programa deve:
• Adicione pelo menos 10 nomes de cidades e exiba elas no terminal;
• Perguntar ao usuário uma letra e exibir apenas as cidades que começam com essa
letra;
• Exibir no terminal quantas cidades começam com vogais e quantas começam com
consoantes;
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inicial = false;

        List<String> cidades = new ArrayList<>();
        cidades.add("Cianorte");
        cidades.add("Maringá");
        cidades.add("Umuarama");
        cidades.add("Indianopolis");
        cidades.add("Cascavel");
        cidades.add("Ponta Grossa");
        cidades.add("Curitiba");
        cidades.add("Japura");
        cidades.add("Araruna");
        cidades.add("Paraiso do Norte");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        System.out.println("Digite uma letra e verifique se ha alguma cidade da lista com esta letra: ");
        char letra = scanner.next().charAt(0);

        String vogais = "aeiouAEIOU";
        String consoantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        int contadorVogais = 0;
        int contadorConsoantes = 0;

        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).charAt(0)==letra){
                System.out.println(cidades.get(i)+", ");
            }

            if (vogais.contains(String.valueOf(cidades.get(i).charAt(0)))){
                contadorVogais++;
            }

            if (consoantes.contains(String.valueOf(cidades.get(i).charAt(0)))){
                contadorConsoantes++;
            }


        }

        System.out.println(contadorVogais + " cidades começam com vogais. " + contadorConsoantes + "\n cidades começam com consoantes.");
    }
}
