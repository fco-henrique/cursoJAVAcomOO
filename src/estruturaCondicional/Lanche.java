package estruturaCondicional;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int codigo = scan.nextInt();
        int qtd = scan.nextInt();
        
        double valorFinal = 0;
        
        switch(codigo){
            case 1: 
                valorFinal = (double) qtd * 4;
                break;
            case 2:
                valorFinal = (double) qtd * 4.5;
                break;
            case 3:
                valorFinal = (double) qtd * 5;
                break;
            case 4:
                valorFinal = (double) qtd * 2;
                break;
            case 5:
                valorFinal = (double) qtd * 1.5;
                break;
            default:
                System.out.println("Valor inválido");
        }
        
        System.out.println("Total: " + valorFinal);
        
        scan.close();
    }
}
