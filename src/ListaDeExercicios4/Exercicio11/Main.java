package ListaDeExercicios4.Exercicio11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Crie um programa que utilize um HashSet para armazenar números inteiros digitados pelo
usuário (até que ele digite 0). Mostre no terminal os números digitados na lista (sem
duplicatas) e informe se um número específico (digitado depois) está presente no conjunto.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();
        int num = 1;

        while (num != 0){
            numeros.add(num);
            System.out.println("Digte um numero: ");
            num = scanner.nextInt();
        }
        System.out.println("Numeros digitados, sem duplicidade: " + numeros);

        System.out.println("Digite um numero para verificar se esta na lista: ");
        int verificarNum = scanner.nextInt();

        if (numeros.contains(verificarNum)){
            System.out.println("O numero esta na lista: " + verificarNum);
        } else {
            System.out.println("O numero nao esta na lista: " + verificarNum);
        }
    }
}
