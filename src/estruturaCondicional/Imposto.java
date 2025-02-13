package estruturaCondicional;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salario = scan.nextDouble();
        double imposto = 0;
        
        if(salario < 2001) System.out.println("Isento");
        else if(salario < 3001) {
            salario -= 2000;
            imposto = salario  * 0.08;
        }
        else if(salario < 4501) {
            salario -= 3000;
            imposto = (1000 * 0.08) + salario * 0.18;
        }
        else {
            salario -= 4500; 
            imposto = (1000 * 0.08) + (1500 * 0.18) + salario * 0.28;
        }
        
        System.out.printf("R$ %.2f", imposto);
        
        scan.close();
    }
}
