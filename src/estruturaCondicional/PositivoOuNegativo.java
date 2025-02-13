package estruturaCondicional;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num > 0) System.out.println("Positivo");
        else if(num < 0) System.out.println("Negativo");
        else System.out.println("Nulo");
        
        scan.close();
    }
}
