import java.util.Scanner;
public class Training5 {
    Scanner in = new Scanner(System.in);
    void run (){
        final int N = 5;
        int tab [] = new int [N];
        for (int i = 0; i < N; i++ ){
            System.out.println("Entrez votre valeur ");
            tab[i]=in.nextInt();
        }
        System.out.println("Entrez e :");
        int e = in.nextInt();
        int compteur = 0;
        for (int i = 0;i < N;i++){
            if(tab[i]== e)
            compteur ++;
        }
        System.out.println("le nombre d'occurence est de "+ compteur);
    
}
        public static void main(String[] args) {
        new Training5().run();
    }    
}
