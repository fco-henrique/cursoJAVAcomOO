package estruturaCondicional;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num % 2 == 0) System.out.println("Par");
        else System.out.println("Ímpar");
        
        scan.close();
    }
}
