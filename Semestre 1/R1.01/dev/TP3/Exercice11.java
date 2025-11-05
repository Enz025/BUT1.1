import java.util.Scanner;

public class Exercice11 {
    Scanner in = new Scanner(System.in);

    void run() {
        final int N = 4; 
        int[] tab = new int[2 * N]; 

        //Remplissage du tableau
        System.out.println("Veuillez entrer " + N + " paires d'entiers.");
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez le premier entier de la paire " + (i + 1) + ": ");
            tab[2 * i] = in.nextInt();
            System.out.print("Entrez le second entier de la paire " + (i + 1) + ": ");
            tab[2 * i + 1] = in.nextInt();
        }
        //Affichage tab avant le tri 
        System.out.print("Paires non triées: ");
        for (int i = 0; i < N; i++) {
            System.out.print("(" + tab[2 * i] + ", " + tab[2 * i + 1] + ") ");
        }
        System.out.println();

        //Tri des paires par sélection
        for (int i = 0; i < N - 1; i++) {
            int Pos_min_paire = i; 
            // On cherche la plus petite paire dans le reste du tableau
            for (int j = i + 1; j < N; j++) {
                int a_min = tab[2 * Pos_min_paire];
                int b_min = tab[2 * Pos_min_paire + 1];
                // On récupère la nouvelle paire à comparer (a', b')
                int a_new = tab[2 * j];
                int b_new = tab[2 * j + 1];
                // ligne donné dans l'exo tu connais 
                if (a_new < a_min || (a_new == a_min && b_new < b_min)) {
                    Pos_min_paire = j; 
                }
            }
            //  permutation
            if (Pos_min_paire != i) {
                int temp_a = tab[2 * i];
                tab[2 * i] = tab[2 * Pos_min_paire];
                tab[2 * Pos_min_paire] = temp_a;

                // permutation de la seconde valeur b 
                int temp_b = tab[2 * i + 1];
                tab[2 * i + 1] = tab[2 * Pos_min_paire + 1];
                tab[2 * Pos_min_paire + 1] = temp_b;
            }
        }

        System.out.println("Tableau trié par ordre croissant :");
        for (int i = 0; i < N; i++) {
            System.out.print("(" + tab[2 * i] + ", " + tab[2 * i + 1] + ") ");
        }
    }

    public static void main(String[] args) {
        new Exercice11().run();
    }
}