import java.util.Scanner;
public class Exercice3 {
Scanner in = new Scanner(System.in);
    void run(){
        int somme=0,moyenne=0;
        System.out.print("Entrez la taille du tableau : ");
        int N = in.nextInt();
        int[] tab = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = in.nextInt();
            somme+=tab[i];
        }
        moyenne=somme/N;
        System.out.println("la moyenne est de : "+moyenne);
        
    }
    public static void main(String[] args) {
        new Exercice3().run();
    }
}
