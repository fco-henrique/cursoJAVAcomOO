package vetores;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas números você vai digitar?");
        int num = scan.nextInt();
        int[] nums = new int[num];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        
        int soma = 0;
        int pares = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                pares++;
                soma += nums[i];
            }
        }
        
        if(pares == 0) {
            System.out.println("Nenhum par encontrado.");
        } else {
            System.out.println("Média: " + soma / pares);
        }
        
        scan.close();
    }
}
