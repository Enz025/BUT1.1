import java.util.Scanner;

public class Exercice15 {

    void run() {
        Scanner in = new Scanner(System.in);
        int N = 10; // taille maximale des tableaux

        int[] x = new int[N];
        int[] y = new int[N];
        int[] resultat = new int[N + 1]; // +1 pour gérer la retenue finale

        System.out.print("Entrez le premier nombre : ");
        int n1 = in.nextInt();
        System.out.print("Entrez le second nombre : ");
        int n2 = in.nextInt();
        System.out.print("Entrez la base : ");
        int b = in.nextInt();

        // Conversion du premier nombre en base b
        for (int i = 0; i < N && n1 > 0; i++) {
            x[i] = n1 % b;
            n1 /= b;
        }

        // Conversion du second nombre en base b
        for (int i = 0; i < N && n2 > 0; i++) {
            y[i] = n2 % b;
            n2 /= b;
        }

        // Addition des deux tableaux
        int retenue = 0;
        for (int i = 0; i < N; i++) {
            int somme = x[i] + y[i] + retenue;
            resultat[i] = somme % b;
            retenue = somme / b;
        }

        // Gestion d’une éventuelle retenue finale
        if (retenue != 0) {
            resultat[N] = retenue;
        }

        // Affichage du résultat (du plus grand chiffre au plus petit)
        System.out.print("Résultat en base " + b + " : ");
        boolean started = false;
        for (int i = resultat.length - 1; i >= 0; i--) {
            if (resultat[i] != 0) started = true;
            if (started) System.out.print(resultat[i]);
        }
        if (!started) System.out.print("0");

        System.out.println();
        in.close();
    }

    public static void main(String[] args) {
        new Exercice15().run();
    }
}