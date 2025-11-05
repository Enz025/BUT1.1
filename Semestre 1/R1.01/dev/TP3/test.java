import java.util.Scanner;
public class test{
    Scanner in = new Scanner(System.in);
    void run(){
        int [] tab = {18,7,-2,9,43,8,5,27};
        int elt ;//élement à insérer 
        int pos;//postion insertion
        for(int t = 1;t < tab.length ;t++){
            elt = tab[t];
            pos = 0;
            while(pos < t && elt < tab[pos]){
                    pos++; 
            }   
            for(int i = t-1 ;i >= pos ;i--){
                    tab[i+1]=tab[i];
            }
            tab[pos]= elt ;  
        }  
                // AFFICHAGE DU TABLEAU TRIÉ 
        System.out.println("Tableau trié par ordre décroissant :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }

    public static void main(String[] args) {
        new test().run();
    }
}