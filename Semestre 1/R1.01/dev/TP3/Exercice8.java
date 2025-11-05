import java.util.Scanner;

public class Exercice8 {
    Scanner in = new Scanner(System.in);

    void run() {
        final int N=10;
        System.out.print("Entrez la taille du tableau : ");
        //int N = in.nextInt();
        int[] tab = new int[N];
        // Saisis les élement du tableau
        System.out.println("Entrez les 4 premiers entier du tableau dans l'ordre décroissant: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = in.nextInt();
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
        new Exercice8().run();
    }
}
    
