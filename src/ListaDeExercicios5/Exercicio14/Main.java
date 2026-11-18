package ListaDeExercicios5.Exercicio14;

public class Main {
    public static int contarMinusculas(String texto) {
        if (texto == null) {
            throw new NullPointerException("String não pode ser nula");
        }
        // caso base: texto vazio não tem nenhum caractere
        if (texto.length() == 0) {
            return 0;
        }
        // 1 se o primeiro caractere for minúsculo, 0 se não for
        int atual = Character.isLowerCase(texto.charAt(0)) ? 1 : 0;

        // soma com o resultado do resto do texto
        return atual + contarMinusculas(texto.substring(1));
    }

    public static void main(String[] args) {
        // teste com uma String válida
        try {
            String frase = "Java Sistemas 2026";
            System.out.println("Minúsculas em \"" + frase + "\": " + contarMinusculas(frase));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // teste com String nula
        try {
            String nula = null;
            System.out.println(contarMinusculas(nula));
        } catch (NullPointerException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }

        System.out.println("O programa continua executando. Exceção tratada com sucesso!");
    }
}
