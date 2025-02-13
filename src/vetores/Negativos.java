package vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos números você vai digitar");
        int num = scan.nextInt();
        int[] nums = new int[num];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                System.out.println(nums[i]);
            }
        }
        
        scan.close();
    }
}