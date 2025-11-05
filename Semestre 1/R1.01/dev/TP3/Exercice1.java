class Exercice1 {
    void run() {
        int[] tab = {4,7,3,8,2,8};
        for (int i = 0 ; i < tab.length-1; i++){
            System.out.print(tab[i]+",");
        }
        System.out.print(tab[tab.length-1]);
    }

    public static void main(String[] args) {
        new Exercice1().run();
    }
}