package estruturaRepetitiva;

import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int reps = scan.nextInt();
        
        int dentro = 0, fora = 0;
        
        for (int i = 0; i < reps; i++) {
            int num = scan.nextInt();
            if(num <= 20 && num >= 10) dentro++; 
            else fora++;
        }
        
        System.out.printf("Dentro %d\nFora %d\n", dentro, fora);
        
        scan.close();
    }
}
