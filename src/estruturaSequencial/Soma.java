package estruturaSequencial;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int valorUm = scan.nextInt();
        int valorDois = scan.nextInt();
        
        System.out.printf("SOMA = %d\n", valorUm + valorDois);
        
        scan.close();
    }
}
