import java.util.Scanner;

public class Exercice16 {
    Scanner in = new Scanner(System.in);
    void run() {
        final int N = 10; // taille maximale
        int[] x = new int[N];
        int[] y = new int[N];
        int[] r = new int[2 * N]; // le produit peut faire jusqu’à 2N chiffres

        System.out.print("Entrez la base b : ");
        int b = in.nextInt();

        System.out.println("Entrez les chiffres du premier nombre (du plus faible au plus fort) :");
        for (int i = 0; i < N; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = in.nextInt();
        }

        System.out.println("Entrez les chiffres du second nombre (du plus faible au plus fort) :");
        for (int i = 0; i < N; i++) {
            System.out.print("y[" + i + "] = ");
            y[i] = in.nextInt();
        }

        // Multiplication en base b
        for (int i = 0; i < N; i++) {
            int retenue = 0;
            for (int j = 0; j < N; j++) {
                int produit = r[i + j] + x[i] * y[j] + retenue;
                r[i + j] = produit % b;
                retenue = produit / b;
            }
        }
    }

    public static void main(String[] args) {
        new Exercice16().run();
    }
}