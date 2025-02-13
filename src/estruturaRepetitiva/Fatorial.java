package estruturaRepetitiva;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int fat = num;
        
        for (int i = num - 1; i > 0; i--) {
            fat *= i;
        }
        
        if(num == 0){
            fat = 1;
            System.out.println(fat);
        } else {
            System.out.println(fat);
        }
        
        scan.close();
    }
}
