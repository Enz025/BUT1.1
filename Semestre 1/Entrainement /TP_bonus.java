    import java.util.Scanner;
public class TP_bonus {

    Scanner in = new Scanner(System.in);

    void run() {
        double somme = 0;
        int count = 0;
        double note;
        System.out.println("Entrez les notes (tapez -1 pour arrêter) :");
        while (true) {
            note = in.nextDouble();
            if (note == -1) break;
            somme += note;
            count++;
        }
        if (count > 0) {
            double moyenne = somme / count;
            System.out.println("La moyenne est : " + moyenne);
        } else {
            System.out.println("Aucune note saisie.");
        }
        in.close();
    }

    public static void main(String[] args) {
        new TP_bonus().run();
    }
}
    