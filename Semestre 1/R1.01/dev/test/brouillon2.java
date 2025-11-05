public class brouillon2 {
    void decompte(int n){
        for(int i=n ;i>0;i--){
            System.out.println(i);
        }
    }
    void afficherLigneTirets(int nbColonnes){
        for(int c=0;c<nbColonnes;c++){
            System.out.print("--");
        }
        System.out.println("-");
    }
    void afficherLigneBarre(int nbColonnes){
        for(int c=0;c<nbColonnes;c++){
            System.err.print("|");
        }
        System.out.println("|");
    }
    void afficherDamier(int nbLigne,int nbColonnes){//la procédure à besoin d'un paramètre qu'on note n ici pour qu'elle marche cest un para formel
        for(int l =0;l< nbLigne;l++){
            afficherLigneBarre(nbColonnes);
            afficherLigneBarre(nbColonnes);
        }
        afficherLigneTirets(nbColonnes);       
    }
    //écrire une fonction qui calcule le carré d'un réel 
    double carre (double x){//paramètre formel
        return x * x;
    }
    int factoriel(int n){
        int produit = 1 ;
        for(int i = 2;i <= n ; i++){
            produit=produit*i;
        }
    return produit;
    }

    
    void run(){
        decompte(5);//5 est un paramètre effectif
        afficherDamier(6,3);
        System.out.println(carre(5));//affichage de la fonction carre 
        System.out.println(factoriel(5));
        }
    
public static void main(String[] args) {
    new brouillon2().run();
}
}
