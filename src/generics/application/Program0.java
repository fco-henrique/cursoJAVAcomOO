package generics.application;

import generics.services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Qual o número de valores: ");
        int numVal = sc.nextInt();

        for (int i = 0; i < numVal; i++) {
            int valor = sc.nextInt();
            ps.addValue(valor);
        }

        ps.print();
        System.out.println("Primeiro valor: " + ps.first());

        sc.close();
    }
}
