package estruturaSequencial;

import java.util.Scanner;

public class Peca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int codigoUm, codigoDois, qtdUm, qtdDois;
        double valorUm, valorDois;
        
        codigoUm = scan.nextInt();
        qtdUm = scan.nextInt();
        valorUm = scan.nextDouble();
        codigoDois = scan.nextInt();
        qtdDois = scan.nextInt();
        valorDois = scan.nextDouble();
        
        double valorAPagar = (double) qtdUm * valorUm + qtdDois * valorDois;
        
        System.out.printf("Valor a pagar = %.2f\n", valorAPagar);
        
        scan.close();
    }
}
