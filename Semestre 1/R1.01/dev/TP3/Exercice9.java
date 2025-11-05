import java.util.Scanner;
public class Exercice9 {
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
        // TRI PAR INSERTION (ordre décroissant)
        for (int i = 1; i < N; i++) {
            int valeurCourante = tab[i];
            int j = i - 1;
            // On décale les éléments plus petits vers la droite
            while (j >= 0 && tab[j] < valeurCourante) {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = valeurCourante;
        }
        System.out.println("donnez l'élément que vous voulez entrer dans le tableau");
        int elt = in.nextInt();
        int pos=0;
        // TRI PAR SÉLECTION 
        while(pos<N && tab[pos]>elt){
            pos++;
        }
        for(int i=N-1;i>pos;i--){
            tab[i]=tab[i-1];
        }
        tab[pos]=elt;
        // AFFICHAGE DU TABLEAU TRIÉ 
        System.out.println("Tableau trié par ordre décroissant :");
        for (int i = 0; i < N; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static void main(String[] args) {
        new Exercice9().run();
    }
}
