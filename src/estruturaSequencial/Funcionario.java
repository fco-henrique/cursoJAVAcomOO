package estruturaSequencial;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero = scan.nextInt();
        int horas = scan.nextInt();
        double valorHora = scan.nextDouble();
        
        double salario = (double) horas * valorHora;
        
        System.out.println("NÚMERO = " + numero + "\nSALÁRIO = " + salario);
        
        scan.close();
    }
}
