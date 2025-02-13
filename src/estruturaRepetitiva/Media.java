package estruturaRepetitiva;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int reps = scan.nextInt();
        
        for (int i = 0; i < reps; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            
            double media = (a * 1 + b * 2 + c * 3) / 6;
            System.out.printf("%.1f", media);
            
        }
        
        scan.close();
    }
}
