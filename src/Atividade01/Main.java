package Atividade01; // Esta é a pasta do nosos projeto

import java.util.Scanner;//Biblioteca da classe Scanner

public class Main { //essa é nossa classe "principal" e publica.
    public static void main(String[] args) { //Aqui é o metodo inicial para omeçarmos a escrever o codigo.
        //Seria nosso (Inicio) em portugol//


        Scanner scanner = new Scanner(System.in);
        /*Para usarmos o ler de portugol, nos precisamos declarar um Objeto do tipo classe Scanner,
        e iniciar ele nos parametros*/


        //Assim nos declaramos nossa (variaveis), com seu tipo primitivo e o nome da variavell na frente
        String nome = "Isadora Gomes Oliveira";
        int idade;


        //Esse seria nosso (Escreva) em portugol
        System.out.println("Aluno: " + nome);
        System.out.println("Qual a idade do aluno?");
        /* Essa é a 'tag' que usamos para imprimir a escrita entre " ", no nosso terminal */

        idade = scanner.nextInt();// nosso ler em portugol

        // o IF e ELSE, seria nosso "se, senao" em portugol

        if (idade >= 18){ //Se (condição){ faça}
            System.out.println("O aluno é maior de idade");
        } else { // senao { faça }
            System.out.println("O aluno é menor de idade");
        }

        scanner.close();//metodo para fechar o Scanner
    }

    /*Tipos primitivos em java
    * int - inteiro - portugol "inteiro"
    * long - numeros inteiros muito grande - portugol "inteiro"
    * short - numero inteiro de -32.768 a 32.767 - portgol "inteiro"
    * byte - numero inteiro pequeno de -128 a 127
    * char - um caracter - portugol "caracter"
    * double - numeros decimal preciso tipo preço - portugol "real"
    * float - numero decial nao tao precido tipo altura - portugol "real"
    * boolean - true ou false - Portugol "logico"
    * Em portugol existe a Cadeia, que seria a String em java, mas String é um tipo de dado não primitivo*/

} //Essa ultima chave seria nosso "Fim" em portugol
