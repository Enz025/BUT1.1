import java.util.Scanner;
public class Training_tri_insertion{
    Scanner in = new Scanner(System.in);
    void run(){
        int [] tab = {18,7,-2,9,43,8,5,27};
        int elt ;//élement à insérer 
        int pos;//postion insertion
        for(int t = 1;t < tab.length ;t++){
            elt = tab[t];
            pos = 0;
            while(elt > tab[pos] && pos < t){
                    pos++; 
            }   
            for(int i = t-1 ;i >= pos ;i--){
                    tab[i+1]=tab[i];
            }
            tab[pos]= elt ;  
        }  
                // AFFICHAGE DU TABLEAU TRIÉ 
        System.out.println("Tableau trié par ordre croissant :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }

    public static void main(String[] args) {
        new Training_tri_insertion().run();
    }
}