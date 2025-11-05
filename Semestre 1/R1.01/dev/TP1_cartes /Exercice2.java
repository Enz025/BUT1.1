/* 
//EX2_1

import cartes.*;
class EX2_1 extends Cartes {
    void run() {
        initExercice("2.1");
        //rapide();
        for (int i = 0; i < 16; i++) {
            deplacer(1, 2);
        }
        for (int i =0; i < 15; i++){
            deplacer(2, 1);
        }
        finir();    }    public static void main(String[] args) {
        new EX2_1().run();
    }
}
*/
/* 
//EX2_2

import cartes.*;
class EX2_2 extends Cartes {
    void run() {
        initExercice("2.2");
        //rapide();
        for (int i = 0; i < 16; i++) {
            deplacer(1, 2);
        }
        finir();    }    public static void main(String[] args) {
        new EX2_2().run();
    }
}
*/
/* 
//EX2_3

import cartes.*;
class EX2_3 extends Cartes {
    void run() {
        initExercice("2.3");
        rapide();
        for (int i = 0; i < 16; i++) {
            deplacer(1, 3);
        }
        for (int i = 0; i < 16; i++) {
            deplacer(3, 2);
        }
        finir();    }    public static void main(String[] args) {
        new EX2_3().run();
    }
}
*/
/* 
//EX2_4

import cartes.*;
class EX2_4 extends Cartes {
    void run() {
        initExercice("2.4");
        //rapide();
        for (int i = 0; i < 6; i++) {
            deplacer(1, i + 1);  // pq ca change pas le resultat quans je mets i+2
        }
    finir();
    }

    public static void main(String[] args) {
        new EX2_4().run();
    }
}
    */
/* 
//EX2_5

import cartes.*;
class EX2_5 extends Cartes {
    void run() {
        initExercice("2.5");
        //rapide();
        int n = valeurSommet(1);
        for (int i = 0; i < n; i++) {
            deplacer(1, 2);
        }  
    finir();
    }

    public static void main(String[] args) {
        new EX2_5().run();
    }
}
*/
//EX2_6

import cartes.*;
class EX2_6 extends Cartes {
    void run() {
        initExercice("2.6");
        //rapide();
        int n = valeurSommet(1);
        for (int i = 0; i < n; i++) {
            deplacer(1, 3);
            deplacer(3, 2);
        }  
    finir();
    }

    public static void main(String[] args) {
        new EX2_6().run();
    }
}




