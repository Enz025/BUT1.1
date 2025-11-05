import java.util.Scanner;

public class Exercice10 {
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
        // TRI À BULLES (ordre décroissant)
        boolean estTrie;
        do {
            estTrie = true; // On suppose que le tableau est trié
            for (int i = 0; i < tab.length - 1; i++) {
                // Si un élément est plus petit que le suivant, ils ne sont pas dans le bon ordre
                if (tab[i] < tab[i + 1]) {
                    // Permuter les 2 éléments pour mettre un peu plus d’ordre
                    int tmp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tmp;
                    estTrie = false; // Le tableau n'était pas trié, il faudra refaire un passage
                }
            }
        } while (!estTrie); // On continue tant que le tableau n'est pas entièrement trié
        // AFFICHAGE DU TABLEAU TRIÉ
        System.out.println("Tableau trié par ordre décroissant :");
        for (int i = 0; i < N; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new Exercice10().run();
    }
}
