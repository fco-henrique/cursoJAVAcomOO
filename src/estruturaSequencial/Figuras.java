package estruturaSequencial;

import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        
        double triangulo = a * c / 2;
        double circulo = c * c * 3.14159;
        double trapezio = a * b * c;
        double quadrado = b * b;
        double retangulo = a * b;
        
        
        System.out.printf("Área Triângulo = %f\n", triangulo);
        System.out.printf("Área Círculo = %f\n", circulo);
        System.out.printf("Área Trapézio = %f\n", trapezio);
        System.out.printf("Área Quadrado = %f\n", quadrado);
        System.out.printf("Área Retângulo = %f\n", retangulo);
        
        scan.close();
    }
}
