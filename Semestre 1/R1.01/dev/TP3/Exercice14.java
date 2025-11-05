import java.util.Scanner;

public class Exercice14 {
    Scanner in = new Scanner(System.in);
    void run(){
        int N = 10;
        int [] tab = new int[N];
        int n,b;
        n=in.nextInt();
        b=in.nextInt();
        for(int i=0;i < N;i++){
            tab[i]=n%b;
            n=n/b;
        }
        int puissance = 1;
        int resultat = 0;
        for(int i = 0; i < N; i++){
            resultat=resultat+tab[i]*puissance;
            puissance=puissance*b;
        }
        System.out.println(resultat);
    }
    public static void main(String[] args) {
        new Exercice14().run();
    }
}