package interfaces.defaultMethods.application;

import interfaces.defaultMethods.services.BrasilInterestService;
import interfaces.defaultMethods.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double quantia = sc.nextDouble();

        System.out.print("Tempo: ");
        int meses = sc.nextInt();

        InterestService is  = new BrasilInterestService(2.0);
        double pagamento = is.pagamento(quantia, meses);

        System.out.print("Valor a ser pago após " + meses + " meses: ");
        System.out.println(String.format("%.2f", pagamento));
        sc.close();
    }
}
