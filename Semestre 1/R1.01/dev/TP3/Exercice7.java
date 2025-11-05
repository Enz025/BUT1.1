import java.util.Scanner;

public class Exercice7 {
    Scanner in = new Scanner(System.in);
    void run() {
        System.out.print("Entrez la taille du tableau : ");
        int N = in.nextInt();
        int[] tab = new int[N];
        // Lecture des éléments du tableau
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = in.nextInt();
        }
        // TRI PAR SÉLECTION 
        for (int i = 0; i < N - 1; i++) {
            int posMin = i; // position du minimum
            for (int j = i + 1; j < N; j++) {
                if (tab[j] < tab[posMin]) {
                    posMin = j;
                }
            }
            // Échange des valeurs si nécessaire
            if (posMin != i) {
                int temp = tab[i];
                tab[i] = tab[posMin];
                tab[posMin] = temp;
            }
        }
        // AFFICHAGE DU TABLEAU TRIÉ 
        System.out.println("Tableau trié par ordre croissant :");
        for (int i = 0; i < N; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static void main(String[] args) {
        new Exercice7().run();
    }
}