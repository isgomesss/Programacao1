package ListaDeExercicios5.Exercicio8;

public class Main {

    public static String inverter(String texto) {

        if (texto.length() <= 1) {
            return texto;
        }

        return inverter(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Java";
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + inverter(original));
    }
}
