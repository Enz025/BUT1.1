import java.util.Scanner;
public class Exercice4 {
    Scanner in = new Scanner(System.in);
    void run(){
        double somme_versee,somme_Due,a_Rendre ;
        int b500,b200,b100,b50,b20,b10,b5;
        int p2,p1,c50,c20,c10,c5,c2,c1;
        int enCentimes;
        do{
        System.out.println("Somme versé du client:");
        somme_versee = in.nextDouble();
        System.out.println("Somme versé due:");
        somme_Due = in.nextDouble();
        }
        while(somme_versee<somme_Due);
        a_Rendre = somme_versee - somme_Due ;
        enCentimes =(int)(a_Rendre*100);
        System.out.println("à rendre :"+ a_Rendre);
        b500=enCentimes/50000;//afin de savoir le nombre de billete de 500
        enCentimes=enCentimes%50000;
        b200=enCentimes/20000;
        enCentimes=enCentimes%20000;
        b100=enCentimes/10000;
        enCentimes=enCentimes%10000;
        b50=enCentimes/5000;
        enCentimes=enCentimes%5000;
        b20=enCentimes/2000;
        enCentimes=enCentimes%2000;
        b10=enCentimes/1000;
        enCentimes=enCentimes%1000;
        b5=enCentimes/500;
        enCentimes=enCentimes%500;
        p2=enCentimes/200;
        enCentimes=enCentimes%200;
        p1=enCentimes/100;
        enCentimes=enCentimes%100;
        c50=enCentimes/50;
        enCentimes=enCentimes%50;
        c20=enCentimes/20;
        enCentimes=enCentimes%20;
        c10=enCentimes/10;
        enCentimes=enCentimes%10;
        c5=enCentimes/5;
        enCentimes=enCentimes%5;
        c2=enCentimes/2;
        enCentimes=enCentimes%2;
        c1=enCentimes/1;
        enCentimes=enCentimes%1;
        if(b500>0){
            System.out.println(b500+"billets de 500");
        }
        if (b200>0) {
            System.out.println(b200+"billets de 200");     
        }
        if (b100>0) {
            System.out.println(b100+"billets de 100");     
        }
        if (b50>0) {
            System.out.println(b50+"billets de 50");     
        }
        if (b20>0) {
            System.out.println(b20+"billets de 20");     
        }
        if (b10>0) {
            System.out.println(b10+"billets de 10");     
        }
        if (b5>0) {
            System.out.println(b5+"billets de 5");     
        }
        if (p2>0) {
            System.out.println(p2+"pièces de 2");     
        }
        if (p1>0) {
            System.out.println(p1+"pièces de 1");     
        }
        if (c50>0) {
            System.out.println(c50+"pièces de 50 centimes");     
        }
        if (c20>0) {
            System.out.println(c50+"pièces de 20 centimes");     
        }
        if (c10>0) {
            System.out.println(c10+"pièces de 10 centimes");     
        }
        if (c5>0) {
            System.out.println(c5+"pièces de 5 centimes");     
        }
        if (c2>0) {
            System.out.println(c2+"pièces de 2 centimes");     
        }
        if (c1>0) {
            System.out.println(c1+"pièces de 1 centimes");     
        }      
    }    
public static void main(String[] args) {  
        new Exercice4().run();
    }
    
}

