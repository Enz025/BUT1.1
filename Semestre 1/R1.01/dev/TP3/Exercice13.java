public class Exercice13 {
    void run() {
        final int NBDIGITS = 10;
        int[] tab = new int[NBDIGITS];
        int n = 5, b = 2;
        int i = 0;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        // Convertir n en base b
        while (n > 0 && i < NBDIGITS) {
            tab[i] = n % b;
            n = n / b;
            i++;
        }
        // Vérifier le dépassement de capacité
        if (n > 0) {
            System.out.println("overflow");
        } else {
            // Afficher le résultat dans le bon ordre
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(tab[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Exercice13().run();
    }
}