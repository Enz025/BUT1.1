import java.util.Random;
import java.util.Scanner;

public class Exercice1 {
    Scanner in = new Scanner(System.in);
    void run(){
        final int KM_VOYAGE = 300; // Distance à parcourir pour gagner
        final int KM_NORM_MIN = 10; // Distance min à la Distance min. à la vitesse normale
        final int KM_NORM_MAX = 15 ;// Distance max. à la vitesse normale
        final int KM_RAP_MIN = 20 ;// Distance min. à toute vitesse
        final int KM_RAP_MAX = 25 ;// Distance max. à toute vitesse
        final int AVANTAGE_VOYAGEUR = 20; // L ' avantage i n i t i a l du voyageur
        final int GOURDE_PLEINE = 12; // Le nombre de gorgées de la gourde
        final int MORT_SOIF = 4;// Nombre de tours pour mourir de soif
        final int MORT_FATIGUE = 4; // Nombre de tours pour mourir de fatigue
        final int DIF_AIDE = 3 ;// Difficult é pour trouver de l ' aide
        final int AVANCE_NATIFS = 4; // Vitesse des natifs
        System.out.println("LE JEU DU CHAMEAU !");
        System.out.println("Vous avez volé un chameau pour traverser le grand désert .\n" + //
                        "Les natifs veulent le récupérer .\n" + //
                        "Votre objectif est de survivre à la traversée de 300 km sans être attrapé ( e ) .");
        int kmVoyageur = 0 ;// Distance totale parcourue .
        int kmNatifs = kmVoyageur - AVANTAGE_VOYAGEUR ;// Distance parcourue par les natifs .
        int gourde = GOURDE_PLEINE / 2; // Nombre de gorgés dans la gourde .
        int soif = 0 ;// Niveau de soif du voyageur .
        int fatigue = 0 ;// Niveau de fatigue du chameau.
        int choix = 6;

        while(choix != 0){
            System.out.println("\nO P T I O N S :");
            System.out.println("1. Boire");
            System.out.println("2. Avancer normalement");
            System.out.println("3. Avancer à toute vitesse");
            System.out.println("4. Repos");
            System.out.println("5. Espérer de l ' aide");
            System.out.println("0. Terminer la partie");
            System.out.print("Qu' allez vous faire ? ");
            


            do{
                System.out.println("Entrez votre choix :");
                choix=in.nextInt();
            }while(choix<0 || choix>5);

            if (choix == 1){
                if(gourde == 0){
                    System.out.println("La gourde est vide !");
                }
                else{
                    soif = 0;
                    gourde = gourde - 1;
                    System.out.println("Vous avez bu une gorgée");
                }
            } else if(choix == 2){
                fatigue += 1;
                Random r = new Random();
                int kmParcourus = KM_NORM_MIN + r.nextInt(KM_NORM_MAX - KM_NORM_MIN + 1);
                kmVoyageur += kmParcourus;
                System.out.println("La distance parcourue est " + kmParcourus + " km.");
            } else if(choix == 3){
                fatigue += 2;
                Random r = new Random();
                int kmParcourus = KM_RAP_MIN + r.nextInt(KM_RAP_MAX - KM_RAP_MIN + 1);
                kmVoyageur += kmParcourus;
                System.out.println("La distance parcourue est " + kmParcourus + " km.");
            } else if(choix == 4){
                fatigue = 0;
                System.out.println("Votre chameau s’est bien reposé.");
            } else if(choix == 5){
                Random r = new Random();
                int aide = r.nextInt(DIF_AIDE + 1);
                if (aide == 0) {
                    System.out.println("Vous avez trouvé de l’aide.");
                    if (gourde >= GOURDE_PLEINE) {
                        System.out.println("La gourde est déjà pleine!");
                    } else {
                        gourde += 3;
                        if (gourde > GOURDE_PLEINE) {
                            gourde = GOURDE_PLEINE;
                        }
                        System.out.println("Quelques gorgées ont été ajoutées à votre gourde.");
                    }
                } else {
                    System.out.println("Vous n’avez pas trouvé de l’aide.");
                }
            } else if(choix == 0){
                System.out.println("Partie terminée.");
            } else {
                System.out.println("Option invalide!");
                System.out.println("Quel est votre choix :");
                choix=in.nextInt();
            }

            //avancement du voyageur
            if(kmVoyageur>KM_VOYAGE){
                System.out.println("Bravo chef tu as gagné");
            }else{
                System.out.println("La distance totale parcourue jusqu’ici est"+kmVoyageur);
            }
            //avancement des natifs
            Random r = new Random();
            int km_natif=r.nextInt(AVANCE_NATIFS+1);
            if(km_natif==0){
                fatigue += 2;
                kmNatifs = KM_RAP_MIN + r.nextInt(KM_RAP_MAX - KM_RAP_MIN + 1);
                kmVoyageur += kmNatifs;
                System.out.println("La distance parcourue est " + kmNatifs + " km.");
            }
            if(km_natif==1){
                if(gourde == 0){
                    System.out.println("La gourde est vide !");
                }
                else{
                    soif = 0;
                    gourde = gourde - 1;
                    System.out.println("Vous avez bu une gorgée");
                }
            }
            if(km_natif >= kmVoyageur){
                System.out.println("Vous avez été attrapé par les natifs! ");
            }
            else{
                int avantage = kmVoyageur - kmNatifs;
                System.out.println("Voici l'avantage que vous avez sur les natifs : "+ avantage);
            }

            //SOIF 
            soif+=1;
            if(soif < MORT_SOIF){
                System.err.println("Le voyageur est mort de soif ");
            }
            else{
                if(soif == 0){
                    System.out.println("Vous n’avez pas soif.");
                }
                if(soif == 1){
                    System.out.println("Vous avez un peu soif. ");
                }
                if(soif == 2){
                    System.out.println("Vous avez beaucoup soif ! ");
                }
                if(soif == 3){
                    System.out.println("Vous allez mourir de soif ! ! ");
                }
            }
            //GOURDE 
            System.out.println("Le nombre de gorgées dans la gourde est " + gourde );
            
            //Fatigue du chameau
            if(fatigue>MORT_FATIGUE){
                System.out.println("Le chameau est mort de fatigue ");
            }
            else{
                if(fatigue == 0){
                    System.out.println("Le chameau est en bonne forme.");
                }
                if(fatigue == 1){
                    System.out.println(" Le chameau est un peu fatigué.");
                }
                if(fatigue == 2){
                    System.out.println("Le chameau est très fatigué ! ");
                }
                if(fatigue == 3){
                    System.out.println("Le chameau va mourir de fatigue!! ");
                }

            }
            }
        }
    
    public static void main(String[] args) {
        Exercice1 game = new Exercice1();
        game.run();
    }
}