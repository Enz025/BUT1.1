import java.util.Scanner;
public class TP2_EX2{
    Scanner in = new Scanner(System.in);
    void run(){
        int pouces,pieds,yards,miles;
        double metres;
        int distance ;
        System.out.println("Donnez la distance en pouce:");
        distance = in.nextInt();
        System.out.println(distance+"pouces correspond à :");
        metres = distance * 0.0254;
        pouces = distance%12;
        distance = distance/12;//distance en pied
        pieds = distance%3;
        distance = distance/3;//distance en yard 
        yards = distance%1760;
        miles = distance/1760;//distance en miles 
        if (miles!= 0){
            if(miles==1){
                System.out.println("1 mile");
            }
            else{
                System.out.println(miles+"miles");
            }
        }
        if (pieds!= 0){
            if(pieds==1){
                System.out.println("1 pied");
            }
            else{
                System.out.println(miles+"miles");
            }
        }
        if (yards!= 0){
            if(yards==1){
                System.out.println("1 yard");
            }
            else{
                System.out.println(yards+"yards");
            }
        }
        if (pouces!= 0){
            if(pouces==1){
                System.out.println("1 pouces");
            }
            else{
                System.out.println(pouces+"pouces");
            }
        }
        if (metres!= 0){
            if(metres==1){
                System.out.println("1 metre");
            }
            else{
                System.out.println(metres+"metres");
            }
        }
    }
public static void main(String[] args) {  
        new TP2_EX2().run();
    }
    
}