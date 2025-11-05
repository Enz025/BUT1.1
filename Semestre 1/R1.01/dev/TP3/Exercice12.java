import java.util.Scanner;
public class Exercice12 {
    Scanner in = new Scanner(System.in);
    void run (){
        final int N = 4; 
        int[] tab = new int[N];
        int M = 2 * N;
        int [] tab_occurence = new int [M];
        //System.out.println("Entrez la valeur max M");
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = in.nextInt();
        }
        int j ;
        boolean deja_traite ;
        int nbPaire = 0;
        for (int i = 0; i< tab.length; i++) {
            deja_traite = false;
            j = 0;
            while(j<nbPaire){
                if (tab_occurence[j*2]==tab[i]){
                    deja_traite = true;
                }
                j++;
            }
            int nbAppariton;
            nbAppariton=0;
            if(!deja_traite){
                for(int k = i; k<tab.length;k++){
                    if(tab[k]==tab[i]){
                        nbAppariton++;
                    }
                }
                tab_occurence[nbPaire * 2] = tab[i];
                tab_occurence[nbPaire * 2 + 1] = nbAppariton;
                nbPaire ++;
            }
        }
        // Étape 3: Trier les paires par ordre croissant de la valeur
        for (int i = 0; i < nbPaire - 1; i++) {
            int index_min = i;
            for (int k = i + 1; k < nbPaire; k++) {
                // On compare la VALEUR de la paire (élément à l'index k*2)
                if (tab_occurence[k * 2] < tab_occurence[index_min * 2]) {
                    index_min = k;
                }
            }

            // Si on a trouvé une valeur plus petite, on permute la PAIRE entière
            if (index_min != i) {
                // Permutation de la valeur
                int temp_val = tab_occurence[i * 2];
                tab_occurence[i * 2] = tab_occurence[index_min * 2];
                tab_occurence[index_min * 2] = temp_val;

                // Permutation de l'occurrence
                int temp_count = tab_occurence[i * 2 + 1];
                tab_occurence[i * 2 + 1] = tab_occurence[index_min * 2 + 1];
                tab_occurence[index_min * 2 + 1] = temp_count;
            }
        }

        // Étape 4: Afficher le résultat trié
        System.out.println("\nOccurrences par valeur (ordre croissant) :");
        for (int i = 0; i < nbPaire; i++) {
            System.out.print("(" + tab_occurence[2 * i] + ", " + tab_occurence[2 * i + 1] + ") ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new Exercice12().run();
    }
}
