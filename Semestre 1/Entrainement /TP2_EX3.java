import java.util.Scanner;

public class TP2_EX3 {
    Scanner in = new Scanner(System.in);
    void run(){
    double somme;
    double Euro,FL,IR,F,ESC;
    System.out.println("Entrez votre somme en Francs:");
    somme = in.nextDouble();
    Euro=somme/6.55957;
    FL=somme*2.20371;
    IR=somme*0.787564;
    F=somme*6.55957;
    ESC=somme*200.482;
        // Affichage avec arrondi à deux chiffres
        System.out.printf("\n%.2f francs = %.2f euros\n", somme, Euro);
        System.out.printf("FL (Pays-Bas) : %.2f\n", FL);
        System.out.printf("£IR (Irlande) : %.2f\n", IR);
        System.out.printf("F (France) : %.2f\n", F);
        System.out.printf("ESC (Portugal) : %.2f\n", ESC);
    }

    public static void main(String[] args) {
        new TP2_EX3().run();
    }
}