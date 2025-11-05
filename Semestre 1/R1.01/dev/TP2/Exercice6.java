import java.util.Scanner;

public class Exercice6 {
    Scanner in = new Scanner(System.in);
    void run() {
        double n; 
        double racine;
        System.out.println("Donnez un entier positif:");
        n = in.nextInt();
        if (n<0) {
            System.out.println("Le nombre doit être positif.");
        }
        else{
            /*if (Math.sqrt(n)==(int)Math.sqrt(n)) {*/
            racine=(int)Math.sqrt(n);
            if (racine*racine==n) {
                System.out.println("Le nombre " + n + " est un carré parfait.");
        }   else {
                System.out.println("Le nombre " + n + " n'est pas un carré parfait.");
        }    
        }   
    }
    public static void main(String[] args) {
        new Exercice6().run();
    
}
}
/*seconde méthode */
/* 
import java.util.Scanner;

public class Exercice6 {
    Scanner in = new Scanner(System.in);
    void run() {
        double n; 
        double racine;
        System.out.println("Donnez un entier positif:");
        n = in.nextInt();
        if (n<0) {
            System.out.println("Le nombre doit être positif.");
        }
        else{
            if (Math.sqrt(n)==(int)Math.sqrt(n)) {
                System.out.println("Le nombre " + n + " est un carré parfait.");
        }   else {
                System.out.println("Le nombre " + n + " n'est pas un carré parfait.");
        }    
        }   
    }
    public static void main(String[] args) {
        new Exercice6().run();
    
}
}
*/