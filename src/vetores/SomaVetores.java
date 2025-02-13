package vetores;

import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int num = scan.nextInt();
        double[] nums = new double[num];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextDouble();
        }
        
        double soma = 0;
        System.out.print("Valores:");
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
            System.out.print(" " + nums[i]);
        }
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma / nums.length);
        
        scan.close();
    }
}
