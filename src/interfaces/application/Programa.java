package interfaces.application;

import interfaces.model.entities.AluguelCarro;
import interfaces.model.entities.Veiculo;
import interfaces.model.services.AluguelServices;
import interfaces.model.services.BrasilTaxServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel.");

        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Retirada: (dd/MM/yyyy hh:mm) ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Devolução: (dd/MM/yyyy hh:mm) ");
        LocalDateTime devolucao = LocalDateTime.parse(sc.nextLine(), dtf);

        AluguelCarro aluguel = new AluguelCarro(retirada, devolucao, new Veiculo(modelo));

        System.out.print("Preço por hora: ");
        double precoHora = sc.nextDouble();

        System.out.print("Preço por dia: ");
        double precoDia = sc.nextDouble();

        AluguelServices aluguelServices = new AluguelServices(precoHora, precoDia, new BrasilTaxServices());

        aluguelServices.processoDeFatura(aluguel);

        System.out.println("Fatura:");
        System.out.println("Pagamento Básico = " + aluguel.getFatura().getPagamentoBasico());
        System.out.println("Imposto = " + aluguel.getFatura().getTaxa());
        System.out.println("Pagamento Total = " + aluguel.getFatura().getPagamentoTotal());

        sc.close();
    }
}
