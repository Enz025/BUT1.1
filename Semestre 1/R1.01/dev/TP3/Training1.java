public class Training1 {
    void run(){
        final int [] tab = {4, 7, 3, 8, 2, 8};
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        new Training1().run();
    }    
}