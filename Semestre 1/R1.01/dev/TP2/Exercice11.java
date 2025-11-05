import java.util.Scanner;

public class Exercice11 {
    Scanner in = new Scanner(System.in);
    void run (){
        int a,b;
        System.out.println("Entrez a :");
        a = in.nextInt();
        System.out.println("Entrez b :");
        b = in.nextInt();
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("pgcd "+a);
    }
    public static void main(String[] args) {
        new Exercice11().run();
    }
}