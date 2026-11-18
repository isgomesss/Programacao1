package ListaDeExercicios5.Exercicio4;

import java.util.Scanner;

/*. Crie uma função chamada calcularCedulas que receba um valor inteiro em reais (o troco de
uma compra) e retorne um array de inteiros com a menor quantidade possível de cédulas e
moedas de 100, 50, 20, 10, 5, 2 e 1 real, nessa ordem (a posição 0 guarda quantas de 100,
a posição 1 quantas de 50, e assim por diante). No main, peça o valor do troco ao usuário,
chame a função e exiba apenas as cédulas e moedas que forem usadas. Exemplo: para 289,
a saída deve mostrar 2 x R$ 100, 1 x R$ 50, 1 x R$ 20, 1 x R$ 10, 1 x R$ 5 e 2 x R$ 2.*/
public class Main {

    public static int[] calcularCedulas(int troco){
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        int[] posicoes =new int[7];

        int resto = troco;

        for (int i = 0; i < cedulas.length; i++) {
            posicoes[i] = resto / cedulas[i];
            resto = resto % cedulas[i];
        }

        return posicoes;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do troco: ");
        int trocoUsu = scanner.nextInt();

        int[] quantidades = calcularCedulas(trocoUsu);

        int[] valores = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < quantidades.length; i++) {
            if (quantidades[i] > 0){
                System.out.println(quantidades[i] + " x R$ " + valores[i]);
            }
        }
    }
}
