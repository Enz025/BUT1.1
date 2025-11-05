import java.util.Scanner;

public class Exercice8 {
    Scanner in = new Scanner(System.in);
    void run() {
        int mois,annee;
        do{
            System.out.println("Donnez un mois (1-12):");
            mois=in.nextInt();
            if(mois<1 || mois>12){
                System.out.println("Le mois doit être compris entre 1 et 12.");
            }
        }while(mois<1 || mois>12);
        System.out.println("Donnez une année:");
        annee=in.nextInt();
        if(mois==2){
            if((annee%4==0 && annee%100!=0) || (annee%400==0)){
                System.out.println("Le mois "+mois+" de l'année "+annee+" a 29 jours.");
            }
            else{
                System.out.println("Le mois "+mois+" de l'année "+annee+" a 28 jours.");
            }
        }
        else if(mois==4 || mois==6 || mois==9 || mois==11){
            System.out.println("Le mois "+mois+" de l'année "+annee+" a 30 jours.");
        }
        else{
            System.out.println("Le mois "+mois+" de l'année "+annee+" a 31 jours.");
        }
    
    }
    public static void main(String[] args) {
        new Exercice8().run();
    }
}

