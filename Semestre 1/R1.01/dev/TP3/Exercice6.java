
import java.util.Scanner;
public class Exercice6 {
Scanner in = new Scanner(System.in);
    void run() {
    System.out.print("Entrez la taille du tableau : ");
        int N = in.nextInt();
        int[] tab = new int[N];
        for (int j = 0; j < N; j++) {
            System.out.print("Entrez l'élément " + (j + 1) + " : ");
            tab[j] = in.nextInt();
        }
        int beg,end;
        int minimum;
        System.err.println("Entrez beg");
        beg=in.nextInt();
        System.out.println("Entrez end");
        end=in.nextInt();

        if (beg < 0 || end > N || beg >= end) {
            System.out.println("Erreur: Indices invalides. Assurez-vous que 0 <= beg < end <= " + N);
            return;
        }

        int posMin=beg;
        minimum=tab[beg];
        for(int i=beg;i<end;i++){
            if(tab[i]<minimum){
                posMin=i;
                minimum=tab[i];
            }
        }
        System.out.println("Le minimum entre les positions "+beg+" et "+end+" est : "+minimum+" à la position "+posMin);
    }
    public static void main(String[] args) {
        new Exercice6().run();
    }
}

