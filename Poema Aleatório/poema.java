import java.util.Random;

public class poema {

    private static final String[] sujeitos = {
        "O vento", "A noite", "Um algoritmo", "A saudade", "O silêncio", "A memória", "A exceção"
    };

    private static final String[] verbos = {
        "sussurra", "caminha", "compila", "desaparece", "renasce", "observa", "transborda"
    };

    private static final String[] complementos = {
        "nos bits da existência.", "pelos fios do destino.", "em silêncio absoluto.",
        "entre loops infinitos.", "nas entrelinhas do código.", "como um bug poético.",
        "no eco da máquina."
    };

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("=== Poema Aleatório ===\n");

        for (int i = 0; i < 4; i++) {
            String verso = sujeitos[random.nextInt(sujeitos.length)] + " " +
                           verbos[random.nextInt(verbos.length)] + " " +
                           complementos[random.nextInt(complementos.length)];
            System.out.println(verso);
        }

        System.out.println("\n---\nVersos escritos na linguagem da alma... ou quase isso.");
    }
}
