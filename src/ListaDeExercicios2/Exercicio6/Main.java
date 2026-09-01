package ListaDeExercicios2.Exercicio6;

import java.util.Scanner;

/*Faça um algoritmo que peça a idade do usuário e classifique sua faixa etária. Com base no
valor informado, mostre em tela:
• Menor que 12 anos → “Criança”
• Entre 12 e 17 anos → “Adolescente”
• Entre 18 e 59 anos → “Adulto”
• 60 anos ou mais → “Idoso”
Após informar a faixa etária, o programa deve também mostrar a situação do voto dessa
pessoa:
• Menor de 16 anos – Não pode votar.
• Entre 16 e 18 anos – Voto opcional.
• Entre 18 e 70 anos – Voto obrigatório.
• Maior que 70 – Voto opcional.
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 12){
            System.out.println("Criança - Não pode votar");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolecente");
            if (idade <= 16){
                System.out.println(" - Não pode votar");
            } else {
                System.out.println(" - Voto opcional");
            }
        } else if (idade >= 18 && idade >= 59) {
            System.out.println("Adulto - Voto obrigatório");
        } else if (idade >= 60) {
            System.out.println("Idoso");
            if (idade < 70){
                System.out.println(" - Voto obrigatório");
            } else if (idade >= 70) {
                System.out.println(" - Voto opcional");
            }
        }
    }
}
