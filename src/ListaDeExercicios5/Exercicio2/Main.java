package ListaDeExercicios5.Exercicio2;
/*Crie dois arrays unidimensionais A e B, com 5 elementos cada. Escreva uma função que
calcule o produto escalar entre eles (isto é, A[0]*B[0] + A[1]*B[1] + ... + A[4]B[4]). Exiba no
console o resultado do produto escalar.*/
public class Main {
    public static void main(String[] args) {

        int[] aaaaa = {0,1,2,3,4};
        int[] bbbbb = {5, 6, 7, 8, 9};

        int somas = multiplicacao(aaaaa, bbbbb);

        System.out.println("Produto escalar: " + somas);
    }
    public static int multiplicacao(int[] vetorA, int[] vetorB){
        int valor = 0;
        for (int i = 0; i < 5; i++){
            valor = valor + (vetorA[i]*vetorB[i]);
        }
         return valor;
    }
}
