package vetores;

import java.util.Scanner;

public class SomaDeDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas números você vai digitar em cada grupo?");
        int num = scan.nextInt();
        int[] numsA = new int[num];
        int[] numsB = new int[num];
        int[] numsC = new int[num];
        
        for (int i = 0; i < numsA.length; i++) {
            numsA[i] = scan.nextInt();
        }
        for (int i = 0; i < numsB.length; i++) {
            numsB[i] = scan.nextInt();
        }
        
        int soma = 0;
        
        for (int i = 0; i < numsB.length; i++) {
            soma = numsB[i] + numsA[i];
            numsC[i] = soma;
        }
        
        for (int i = 0; i < numsC.length; i++) {
            System.out.println(numsC[i]);
        }
        
        scan.close();
    }
}
