package ListaDeExercicios5.Exercicio1;
/*Faça um programa Java em que você monte uma função que avalie três valores e retorne
qual deles é o maior e depois crie uma outra função que avalie estes mesmos três números
e retorne qual deles é o menor. Na sua função main, faça a chamada dessas duas funções e
apresente o resultado no console*/
public class Main {
    public static void main(String[] args) {

       int valorMaior = maiorValor(3, 4, 5 );

       int valorMenor = menorValor(5,7,2);
        System.out.println("Maior Valor: " + valorMaior);
        System.out.println("Menor Valor: " + valorMenor);

    }

    public static int maiorValor(int a, int b, int c) {
        int maior = a;

        if (maior < b){
            maior = b;
        }
        if (maior < c){
            maior = c;
        }

        return maior;
    }

    public static int menorValor(int a, int b, int c){
        int menor = a;

        if (menor > b){
            menor = b;
        }
        if (menor > c){
            menor = c;
        }

        return menor;
    }
}
