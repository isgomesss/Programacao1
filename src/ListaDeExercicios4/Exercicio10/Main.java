package ListaDeExercicios4.Exercicio10;

import java.util.ArrayList;
import java.util.List;

/*10. Utilize um LinkedList de Strings para simular uma fila de atendimento bancário. Com isso,
adicione 5 pessoas na fila. Posteriormente, atenda as 2 primeiras pessoas (remova do início
da fila). Depois disso, adicione mais 2 pessoas ao final da fila. Por fim, exiba a fila final e a
fila original para comparação.
*/
public class Main {
    public static void main(String[] args) {

        List<String> fila = new ArrayList<>();
        fila.add("Joao");
        fila.add("Marcelo");
        fila.add("Isadora");
        fila.add("Alex");
        fila.add("Ana");
        System.out.println(fila);

        fila.remove("Joao");
        fila.remove("Marcelo");

        fila.add("Pedro");
        fila.add("Thiago");

        System.out.println(fila);
    }
}
