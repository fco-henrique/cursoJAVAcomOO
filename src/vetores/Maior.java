package vetores;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas números você vai digitar?");
        int num = scan.nextInt();
        int[] nums = new int[num];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        
        int maior = nums[0];
        int posicao = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > maior) {
                maior = nums[i];
                posicao = i;
            }
        }
        
        System.out.printf("O maior valor é %d e está na posição %d", maior, posicao);
        
        scan.close();
    }
}
