import java.util.Scanner;
public class Training2 {
    Scanner in = new Scanner(System.in);
    void run(){
        final int N = 5;
        int tab[] = new int[N];
        for(int i = 0; i < N; i++){
            System.out.println("Entrez votre valeur numéro "+(i+1)+":");
            tab[i]=in.nextInt();
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        new Training2().run();
    }    
}
