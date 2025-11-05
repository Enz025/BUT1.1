import java.util.Scanner;

public class Exercice9 {
    Scanner in = new Scanner(System.in);
    void run(){
        double x,y;
        double dx,dy;
        final int w,h;
        w=1920;
        h=1024;
        x=w/2;
        y=h/2;
        System.out.println("position en x:"+x+"position en y:"+y);
        while(true){
            System.out.println("Donnez un nombre réel x entre -1920 ET + 1920");
            dx=in.nextDouble();
            System.out.println("Donnez un nombre réel y entre -2024 et 2024");
            dy=in.nextDouble();
            x=x+dx;
            y=y+dy;
            if(x<0){
                x = x + w;
            }
            if(x>=w){
                x = x - w;
            }
            if(y<0){
                y = y + w;
            }
            if(y>=h){
                y = y - w;
            }
            System.out.println("position en x:"+x+"position en y:"+y);
        }
    }
    public static void main(String[] args) {
        new Exercice9().run();
    }
}
