package estruturaCondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numUm = scan.nextInt();
        int numDois = scan.nextInt();
        
        if(numUm % numDois == 0 || numDois % numUm == 0) System.out.println("Multiplos");
        else System.out.println("Não são Multiplos");
        
        scan.close();
    }
}
