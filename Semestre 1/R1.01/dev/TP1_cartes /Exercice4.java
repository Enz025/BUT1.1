//EX4_1
/* 
import cartes.*;

class EX4_1 extends Cartes {
    void run() {
        initExercice("4.1");
        rapide();

        // Étape 1 : mettre la première carte de tas 1 sur tas 2
        if (!tasVide(1)) {
            deplacer(1, 2);
        }

        // Étape 2 : comparer chaque carte restante
        while (!tasVide(1)) {
            if (valeurSommet(1) > valeurSommet(2)) {
                // On a trouvé une carte plus forte → on évacue l’ancienne max
                deplacer(2, 3);
                deplacer(1, 2);
            } else {
                // Carte moins forte → on l’écarte
                deplacer(1, 3);
            }
        }

        finir();
    }

    public static void main(String[] args) {
        new EX4_1().run();
    }
}
*/
/* 
//EX4_2
import cartes.*;

class EX4_2 extends Cartes {
    void run() {
        initExercice("4.2");
        rapide();
        while(!tasVide(1)) {
            deplacer(1, 2);
        }
        // Étape 2 : comparer chaque carte restante
        while (!tasVide(1)) {
            if (valeurSommet(1) > valeurSommet(2)) {
                // On a trouvé une carte plus forte → on évacue l’ancienne max
                deplacer(2, 3);
                deplacer(1, 2);
            } else {
                // Carte moins forte → on l’écarte
                deplacer(1, 3);
            }
                deplacer(2,4);
        }
        finir();
    }
        
    public static void main(String[] args) {
        new EX4_2().run();
    }
}
*/
/* 
//EX4_3
import cartes.*;

class EX4_3 extends Cartes {
    void run() {
        initExercice("4.3");
        rapide();
        while(!tasVide(3)){
            deplacer(3,5);
        }
        while (!tasVide(5)) {
            deplacer(5, 4);
            
        }
        while(!tasVide(1)){
            deplacer(1, 3);
        }
        while(!tasVide(3)){
            deplacer(3,2);
        }
        
        finir();
    }
        public static void main(String[] args) {
        new EX4_3().run();
    }
}
*/ 
/* pas finis 
//EX4_4
import cartes.*;

class EX4_4 extends Cartes {
    void run() {
        initExercice("4.4");
        rapide();

        

        finir();
    }

    public static void main(String[] args) {
        new EX4_4().run();
    }
}
*/
/*  pas finis 
//EX4_5
//Il en faut 5 tas coeur carreau pique trefle et un de stockage  
import cartes.*;

class EX4_5 extends Cartes {
    void run() {
        initExercice("4.5");
        rapide();
        while(!tasVide(1)){
            if (valeurSommet(1)) == (sommetCoeur(1)) {
                deplacer(1,5);
                
                
                
            }
        }


        

        finir();
    }

    public static void main(String[] args) {
        new EX4_5().run();
    }
}
*/
/* 
//correction
import cartes.*;

class EX4_3 extends Cartes {
    void run() {
        initExercice("4.3");
        rapide();
        while (!tasVide(1)) {
        
            while(!tasVide(3)&& (valeurSommet(1)!=valeurSommet(3))||(sommetCarreau(1)&&!sommetCarreau(3))||(sommetPique(1)&&sommetPique(3))||(sommetTrefle(1)&&sommetTrefle(3))){
                deplacer(3, 4);    
            }
                deplacer(3, 2);
            while(!tasVide(4)){
                deplacer(4, 3);
            }
        deplacer(1, 5);
        }
        finir();
    }
    public static void main(String[] args) {
        new EX4_3().run();
    }
}
*/
/* 
import cartes.*;

class EX4_5 extends Cartes {
    void run() {
        initExercice("4.5");
        rapide();
        while(!tasVide(1)){
            if (valeurSommet(1)) == (sommetCoeur(1)) {
                deplacer(1,5);
                
                
                
            }
        }


        

        finir();
    }

    public static void main(String[] args) {
        new EX4_5().run();
    }
}
*/
///* 
import cartes.*;

class EX4_9 extends Cartes {
    void run() {
        initExercice("4.9");
        rapide();
        while(!tasVide(1)) {
            boolean ok = false;
            while (!tasVide(2)&&!ok) {
                if (valeurSommet(1)<valeurSommet(2)) {
                    deplacer(2, 3);   
                }
                else{
                    deplacer(1, 2);
                    ok = true;
                }
            }
        if (!ok) {
            deplacer(1,2);
            
        }
        while (!tasVide(3)) {
            deplacer(3, 2);
            
        }
    }
        finir();
        }
    public static void main(String[] args) {
        new EX4_9().run();
    }
}
//*/