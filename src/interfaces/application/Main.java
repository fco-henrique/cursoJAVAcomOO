package interfaces.application;

import interfaces.model.entities.Contrato;
import interfaces.model.entities.Parcela;
import interfaces.model.services.ContratoService;
import interfaces.model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");

        System.out.print("Número: ");
        int num = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);

        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contrato contrato = new Contrato(num, data, valor);

        System.out.print("Número de parcelas: ");
        int parcelas = sc.nextInt();

        ContratoService contratoService = new ContratoService(new PayPalService());

        contratoService.processamentoContrato(contrato, parcelas);

        System.out.println("Parcelas: ");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela);
        }

        sc.close();
    }
}
