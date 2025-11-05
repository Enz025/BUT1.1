import java.util.Scanner;

public class Exercice17 {

    void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez le degré du polynôme : ");
        int degre = in.nextInt();
        double[] t = new double[degre + 1];
        System.out.println("Entrez les coefficients du plus petit degré au plus grand :");
        for (int i = 0; i <= degre; i++) {
            System.out.print("Coefficient de x^" + i + " : ");
            t[i] = in.nextDouble();
        }
        // Affichage du tableau
        System.out.print("Tableau des coefficients : ");
        for (int i = 0; i <= degre; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
        // Affichage du polynôme
        System.out.print("Le polynôme est : ");
        boolean premier = true;
        for (int i = degre; i >= 0; i--) {
            double c = t[i];
            if (c != 0) {
                if (!premier) {
                    if (c > 0) System.out.print(" + ");
                    else System.out.print(" - ");
                } else {
                    if (c < 0) System.out.print("-");
                    premier = false;
                }

                double val = c;
                if (c < 0) val = -c;

                if (i == 0) System.out.print(val);
                else if (i == 1) System.out.print(val + "x");
                else System.out.print(val + "x^" + i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Exercice17().run();
    }
}