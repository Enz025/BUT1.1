import java.util.Scanner;

public class Exercice10 {
    Scanner in = new Scanner(System.in);

    void run() {
        int anneeC, moisC;
        int dejaExpire = 0;
        int nbMois1 = 0;
        int nbMois2 = 0;
        int nbMois3 = 0;
        int nbMois4 = 0;
        int nbMois4plus = 0;

        System.out.print("Donnez l'année actuelle (AAAA) : ");
        anneeC = in.nextInt();
        System.out.print("Donnez le mois actuel (1-12) : ");
        moisC = in.nextInt();

        System.out.println("Saisissez l’année (AA) et le mois (MM) du produit, -1 pour arrêter :");
        while (true) {
            int aa = in.nextInt();
            if (aa == -1) break;
            int mm = in.nextInt();

            int anneeP = 2000 + aa;
            int moisP = mm;
            int ageMois = (anneeC - anneeP) * 12 + (moisC - moisP);

            if (ageMois < 0) {
                continue;
            } else if (ageMois > 4) {
                dejaExpire++;
            } else {
                switch (ageMois) {
                    case 1:
                        nbMois1++;
                        break;
                    case 2:
                        nbMois2++;
                        break;
                    case 3:
                        nbMois3++;
                        break;
                    case 4:
                        nbMois4++;
                        break;
                    case 0:
                        nbMois4plus++;
                        break;
                }
            }
        }

        System.out.println("\nRécapitulatif :");
        System.out.println("Produits déjà expirés : " + dejaExpire);
        System.out.println("Produits qui expirent dans 1 mois : " + nbMois1);
        System.out.println("Produits qui expirent dans 2 mois : " + nbMois2);
        System.out.println("Produits qui expirent dans 3 mois : " + nbMois3);
        System.out.println("Produits qui expirent dans 4 mois : " + nbMois4);
        System.out.println("Produits valides depuis moins d’1 mois : " + nbMois4plus);

        System.out.println("\nGraphique ASCII :");
        System.out.print("Déjà expirés      : "); afficherEtoiles(dejaExpire);
        System.out.print("Expire dans 1 mois: "); afficherEtoiles(nbMois1);
        System.out.print("Expire dans 2 mois: "); afficherEtoiles(nbMois2);
        System.out.print("Expire dans 3 mois: "); afficherEtoiles(nbMois3);
        System.out.print("Expire dans 4 mois: "); afficherEtoiles(nbMois4);
        System.out.print("Moins de 1 mois   : "); afficherEtoiles(nbMois4plus);
    }

    void afficherEtoiles(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Exercice10().run();
    }
}