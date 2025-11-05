import java.util.Scanner;
public class Training3 {
    Scanner in = new Scanner(System.in);
    void run(){
        final int N = 5;
        int tab [] = new int [N];
        double moyenne = 0;
        int somme = 0;
        for(int i = 0;i < N;i++){
            System.out.println("Entrez votre valeur :");
            tab[i]=in.nextInt();
            somme=somme+tab[i];
        }
        moyenne = somme/N;
        System.out.println("votre moyenne est :"+ moyenne);
    }

    public static void main(String[] args) {
        new Training3().run();
    }    
}