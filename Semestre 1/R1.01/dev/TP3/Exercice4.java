import java.util.Scanner;

public class Exercice4 {
    Scanner in = new Scanner(System.in);
    void run() {
    System.out.print("Entrez la taille du tableau : ");
        int N = in.nextInt();
        int[] tab = new int[N];
        //int j;
        int tmp;
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = in.nextInt();
        }
        for (int i = 0; i < N/2; i++) {
            tmp=tab[i];
            tab[i]=tab[N-1-i];
            tab[N-1-i]=tmp;
            
        }
        System.out.print("Contenu du tableau inversé : ");
        for (int i = 0; i < N; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static void main(String[] args) {
        new Exercice4().run();
    }
}