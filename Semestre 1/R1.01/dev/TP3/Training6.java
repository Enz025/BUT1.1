import java.util.Scanner;
public class Training6 {
    Scanner in = new Scanner(System.in);
    void run (){
        final int N = 6;
        int tab [] = new int [N];
        for (int i = 0; i < N; i++ ){
            System.out.println("Entrez votre valeur ");
            tab[i]=in.nextInt();
        }
        int beg, end;
        int Posmin=0;
        System.out.println("Donnez beg :");
        beg = in.nextInt();
        System.out.println("Donnez end :");
        end = in.nextInt();
        for(int i = beg;i < end; i ++){
            if(tab[Posmin]>tab[i]){
                Posmin=i;
            }
        System.out.println("le minimum est "+tab[Posmin]);
        }
    }
        public static void main(String[] args) {
        new Training6().run();
    }    
}
