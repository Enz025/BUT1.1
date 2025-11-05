import java.util.Scanner;
public class Training4 {
    Scanner in = new Scanner(System.in);
    void run (){
        final int N = 5;
        int tab [] = new int [N];
        int tab_inv [] = new int [N];
        for (int i = 0; i < N; i++ ){
            System.out.println("Entrez votre valeur ");
            tab[i]=in.nextInt();
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++){
            tab_inv[i] = tab[N-1-i];
        }
        for (int i = 0; i < tab_inv.length; i++) {
            System.out.print(tab_inv[i]);
            if (i < tab_inv.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
        public static void main(String[] args) {
        new Training4().run();
    }    
}
