package Desafio1.Exercicio9;

public class Produto {

    double preco;
    double precoFinal;

    public double precoFinal(){
        if (preco > 50) {
            precoFinal = preco * 0.85;
            return precoFinal;
        }
        else {
            precoFinal = preco;
            return precoFinal;
        }

    }
}
