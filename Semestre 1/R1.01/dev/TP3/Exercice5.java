import java.util.Scanner;

public class Exercice5 {
Scanner in = new Scanner(System.in);
    void run() {
    System.out.print("Entrez la taille du tableau : ");
        int N = in.nextInt();
        int[] tab = new int[N];
        int e;
        int compteur=0;
        System.err.println("Entrez e");
        e=in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = in.nextInt();
        }
        for (int i = 0; i< tab.length; i++) {
            if(tab[i]==e){
                compteur=compteur+1;
            }
        }
        System.out.println("Le nombre d'occurences de "+e+" est de : "+compteur);
    }
    public static void main(String[] args) {
        new Exercice5().run();
    }
}
