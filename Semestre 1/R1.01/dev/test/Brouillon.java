

//
//package dev;
// ceci est mon premier programme java (ou presque ...)
class Echange {
    void run() {
        int a,b,tmp;
        a=1;
        b=3;
        tmp=a;
        a=b;
        b=tmp;
// c’est ici que vous ´ecrirez votre code en Intro. Dev.
        System.out.println(a);
}
// on indique que le programme doit ex´ecuter le code
// qu’on a ´ecrit dans la proc´edure run(). On utilisera
// toujours ce squelette en Intro. Dev. pour ´eviter au mieux
// les objets que ne seront vus qu’au second semestre.
public static void main(String[] args) {
new Echange().run();
}
}

