import java.util.Scanner;

public class Exercice5 {
    Scanner in = new Scanner(System.in);

    void run() {
        double a, b, c, x1, x2;
        double delta;

        System.out.println("Donnez a:");
        a = in.nextDouble();

        System.out.println("Donnez b:");
        b = in.nextDouble();

        System.out.println("Donnez c:");
        c = in.nextDouble();

        delta = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Nombre infini de solutions");
                } else {
                    System.out.println("Impossible, aucune solution");
                }
            } else {
                x1 = -c / b;
                System.out.println("Une solution : " + x1);
            }
        } else {
            if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Deux solutions :");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Une solution : x1 = " + x1);
            } else {
                System.out.println("Impossible, aucune solution");
            }
        }
    }

    public static void main(String[] args) {
        new Exercice5().run();
    }
}
