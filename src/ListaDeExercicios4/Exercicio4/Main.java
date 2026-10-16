package ListaDeExercicios4.Exercicio4;
/*4. Crie um array bidimensional 3x3 que armazene notas de 3 alunos em 3 provas. Calcule a
média de cada aluno e exiba. Posteriormente, indique qual aluno teve a maior média*/
public class Main {
    public static void main(String[] args) {

        int[][] notas = {
                {60, 80, 70},
                {50, 70, 80},
                {90, 80, 80}
        };

        double mediaAluno1 = (notas[0][0] + notas[0][1] + notas[0][2]) / 3.0;
        double mediaAluno2 = (notas[1][0] + notas[1][1] + notas[1][2]) / 3.0;
        double mediaAluno3 = (notas[2][0] + notas[2][1] + notas[2][2]) / 3.0;

        System.out.println("Média do aluno 1: " + mediaAluno1);
        System.out.println("Média do aluno 2: " + mediaAluno2);
        System.out.println("Média do aluno 3: " + mediaAluno3);

        if (mediaAluno1 >= mediaAluno2 && mediaAluno1 >= mediaAluno3) {
            System.out.println("Maior média: aluno 1");
        } else if (mediaAluno2 >= mediaAluno3) {
            System.out.println("Maior média: aluno 2");
        } else {
            System.out.println("Maior média: aluno 3");
        }
    }
}