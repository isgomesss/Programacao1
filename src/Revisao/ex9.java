package Revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Crie um programa em Java que simule o cadastro de informações de pessoas. O programa
deve pedir ao usuário que digite três informações: a idade da pessoa, o nome da pessoa e a
quantidade de filhos que ela possui. O programa deve tratar as seguintes situações:
I. Se a idade digitada for negativa ou maior que 150, lance uma
IllegalArgumentException com a mensagem "Idade inválida! Deve ser entre 0 e
150.".
II. Se o nome digitado estiver vazio (null) ou apenas com espaços (“ “), lance uma
IllegalArgumentException com a mensagem "Nome inválido! O nome não pode
estar vazio.".
III. Se a quantidade de filhos digitada for negativa ou maior que 20, lance uma
IllegalArgumentException com a mensagem "Quantidade de filhos inválida! Deve
ser entre 0 e 20.".
IV. Se o usuário digitar um valor que não seja um número inteiro para idade ou quantidade
de filhos, capture a exceção InputMismatchException e exiba a mensagem "Erro:
digite um número inteiro válido.".
Independente de ocorrer erro ou não, sempre exiba, usando um bloco finally, a mensagem
"Cadastro finalizado.". Quando todos os dados forem digitados corretamente, exiba as
informações cadastradas no console.*/
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // limpa o Enter que sobrou

            if (idade < 0 || idade > 150) {
                throw new IllegalArgumentException("Idade inválida! Deve ser entre 0 e 150.");
            }

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome inválido! O nome não pode estar vazio.");
            }

            System.out.print("Digite a quantidade de filhos: ");
            int filhos = sc.nextInt();

            if (filhos < 0 || filhos > 20) {
                throw new IllegalArgumentException("Quantidade de filhos inválida! Deve ser entre 0 e 20.");
            }

            System.out.println("\n--- Cadastro realizado ---");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Filhos: " + filhos);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro válido.");
        } finally {
            System.out.println("Cadastro finalizado.");
        }
    }
}
