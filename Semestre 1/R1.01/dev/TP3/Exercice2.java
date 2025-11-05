import java.util.Scanner;
public class Exercice2 {
Scanner in = new Scanner(System.in);
void run() {
    System.out.print("Entrez la taille du tableau : ");
    int n = in.nextInt();
    int[] tab = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Entrez l'élément " + (i + 1) + " : ");
        tab[i] = in.nextInt();
    }
    System.out.print("Contenu du tableau : ");
    for (int i = 0; i < n; i++) {
        System.out.print(tab[i] + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        new Exercice2().run();
    }
}




