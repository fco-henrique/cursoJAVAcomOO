package estruturaCondicional;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num < 26) System.out.println("Intervalo [0,25]");
        else if(num < 51) System.out.println("Intervalo [25,50]");
        else if(num < 76) System.out.println("Intervalo [50,75]");
        else System.out.println("Intervalo [75,100]");
        
        scan.close();
    }
}
