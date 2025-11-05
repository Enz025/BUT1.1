/* 
//EX3_1

import cartes.*;

class EX3_1 extends Cartes {
    void run() {
        rapide();
        initExercice("3.1");
        while (!tasVide(1)) {
            if (sommetCoeur(1)) {
                deplacer(1, 2);  // les cœurs vont directement au tas 2
            } else if (sommetCarreau(1)) {
                deplacer(1, 3);  // on met les carreaux de côté temporairement
            }
        }

        // On remet les carreaux sur le tas 1
        while (!tasVide(3)) {
            deplacer(3, 1);
        }
            
        finir();
    }
    public static void main(String[] args) {
        new EX3_1().run();
    }
}
*/
//EX3_2
import cartes.*;

class EX3_2 extends Cartes {
    void run() {
        initExercice("3.2");
        rapide();
        int compteur = 0;
        while (compteur < 3 && !tasVide(1)) {
                deplacer(1, 2);
                compteur++;
            }

            // Si on n'a pas déplacé 3 cartes, ça veut dire qu'il reste moins de 3 → arrêter
            if (compteur < 3) {
                // On remet les cartes déplacées sur tas 1
                while (!tasVide(2)) {
                    deplacer(2, 1);
                }
        }    
    
        finir();
    }

    public static void main(String[] args) {
        new EX3_2().run();
    }
}


//EX3_5



//EX3_6
/* 
import cartes.*; 
class EX3_6 extends Cartes{
    void run(){
        initExercice("3.6");
        while (!tasVide(1)) {
            deplacer(1,2);
            if(!tasVide(1)){
            deplacer(1,3);
            if(!tasVide(1)){
                deplacer(1,4);
            }
        }
        }
        finir();
    }

    public static void main(String[] args){
        new EX3_6().run();
    }
}

*/


/* 
//EX3_7
//import java.io.*;
import cartes.*; 

class EX3_7 extends Cartes{
    void run(){
        initExercice("3.7");
        rapide();
        while (!tasVide(1)){
            deplacer(1,2);
        }
        while (!tasVide(2)){
                deplacer(2,3);
        }
        while(!tasVide(3)){
            deplacer(3,1);
        }

        finir();
    }

    public static void main(String[] args){
        new EX3_7().run();
    }
}
*/

/* 
//EX3_8
import cartes.*; 

class EX3_8 extends Cartes{
    void run(){
        initExercice("3.8");
        rapide();
        while(!tasVide(1)&&!tasVide(2)){
            deplacer(1,2);
            deplacer(1,3);            
        }
            if(tasVide(1)&&tasVide(2)){
                System.out.println("égalité");
            }
            else{
                if(tasVide(1)){
                    System.out.println("Le tas 2 est plus grand");
                }
                else{
                    System.out.println("Le tas 1 est plus grand");
                }
            }
        finir();
    }

    public static void main(String[] args){
        new EX3_8().run();
    }
}

*/
/* 
//EX3_9 Bis il ne marche pas si il reste que une carte sur le tas car il fait deux par deux (j'ai mis deux deplacer après le While)
import cartes.*; 

class EX3_9 extends Cartes{
    void run(){
        initExercice("3.9");
        rapide();
        for (int i = 0; i < 10; i++) {
        //melanger
            while (!tasVide(1)) {
                deplacer(1, 2);
                deplacer(1, 3);   
            }
            while(!tasVide(2)&&!tasVide(3)){
                deplacer(2,1);
                deplacer(3,1);    
            }
        }
        finir();
    } 
    public static void main(String[] args){
        new EX3_9().run();
    }
}

*/