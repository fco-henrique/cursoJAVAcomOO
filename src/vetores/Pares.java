package vetores;

import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas números você vai digitar?");
        int num = scan.nextInt();
        int[] nums = new int[num];
        int pares = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println("Números pares");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(" " + nums[i]);
                pares++;
            }
        }

        System.out.println("Total de pares: " + pares);

        scan.close();
    }
}
