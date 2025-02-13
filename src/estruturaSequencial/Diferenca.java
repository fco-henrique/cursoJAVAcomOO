package estruturaSequencial;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        
        System.out.printf("DIFERENÇA = %d%n", (A * B) - (C * D));
        
        scan.close();
    }
}