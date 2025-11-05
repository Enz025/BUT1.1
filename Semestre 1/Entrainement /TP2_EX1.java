import java.util.Scanner;

public class TP2_EX1 {
    Scanner in = new Scanner(System.in);
    void run() {
        double m1, m2, m3;
        final double coeff_M1 = 3;
        final double coeff_M2 = 2.5;
        final double coeff_M3 = 6;
        double somme_notes, moyenne;
        System.out.println("Entrez la note M1 :");
        m1 = in.nextDouble();
        System.out.println("Entrez la note M2 :");
        m2 = in.nextDouble();
        System.out.println("Entrez la note M3 :");
        m3 = in.nextDouble();
        somme_notes = coeff_M1 * m1 + coeff_M2 * m2 + coeff_M3 * m3;
        moyenne = somme_notes / (coeff_M1 + coeff_M2 + coeff_M3);
        System.out.println("Votre moyenne est " + moyenne);
    }
    public static void main(String[] args) {
        new TP2_EX1().run();
    }
}
