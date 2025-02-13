package estruturaRepetitiva;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int reps = scan.nextInt();
      
        for (int i = 0; i < reps; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            double div = 0;
            
            if(b == 0) {
                System.out.println("Impossivel dividir por zero");
                continue;
            } 
            
            div = (double) a / b;
            System.out.println(div);
        }
        
        scan.close();
    }
}
