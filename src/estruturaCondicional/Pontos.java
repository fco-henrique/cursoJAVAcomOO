package estruturaCondicional;

import java.util.Scanner;

public class Pontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double p1 = scan.nextDouble();
        double p2 = scan.nextDouble();
        
        if(p1 > 0 && p2 > 0) System.out.println("Q1");
        else if(p1 < 0 && p2 < 0) System.out.println("Q3");
        else if(p1 > 0 && p2 < 0) System.out.println("Q4");
        else if(p1 < 0 && p2 > 0) System.out.println("Q2");
        else System.out.println("Origem");
        
        scan.close();
    }
}
