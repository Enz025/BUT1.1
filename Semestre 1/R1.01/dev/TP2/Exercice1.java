package TP2;
import java.util.Scanner;

public class Exercice1 {
    Scanner in = new Scanner(System.in);
    void run(){
        final double coeff_M1 = 3;
        final double coeff_M2 = 2.5;
        final double coeff_M3 = 6;
        double m1,m2,m3;
        double somme,moyenne,sommeCoeff;
        System.out.println("Donnez la note de M1:");
        m1=in.nextDouble();
        System.out.println("Donnez la note de M2:");
        m2=in.nextDouble();
        System.out.println("Donnez la note de M3:");
        m3=in.nextDouble();
        sommeCoeff=coeff_M1+coeff_M2+coeff_M3;
        somme=m1*coeff_M1+m2*coeff_M2+m3*coeff_M3;
        moyenne=somme/sommeCoeff;
        System.out.println("moyenne ="+moyenne);
    }
public static void main(String[] args) {  
        new Exercice1().run();
    }
    
}
