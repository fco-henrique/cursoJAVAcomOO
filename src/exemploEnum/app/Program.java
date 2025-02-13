package exemploEnum.app;

import exemploEnum.entities.Veiculo;
import exemploEnum.enums.TipoVaga;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a placa do veículo:");
        String placa = scanner.nextLine();

        System.out.println("Digite o tipo de vaga (CARRO ou MOTO_BIKE):");
        String tipoInput = scanner.nextLine().toUpperCase();

        TipoVaga tipoVaga = null;
        switch (tipoInput) {
            case "carro", "Carro", "CARRO" -> tipoVaga = TipoVaga.CARRO;
            case "moto", "Moto", "MOTO" -> tipoVaga = TipoVaga.MOTO_BIKE;
            case "bike", "Bike", "BIKE" -> tipoVaga = TipoVaga.MOTO_BIKE;
            default -> throw new IllegalStateException("Unexpected value: " + tipoInput);
        }

        System.out.println("Digite a quantidade de horas estacionado:");
        int horas = scanner.nextInt();

        Veiculo veiculo = new Veiculo(placa, tipoVaga);
        double tarifa = veiculo.calcularTarifa(horas);

        System.out.println("Resumo:");
        System.out.println(veiculo);
        System.out.printf("Tarifa a pagar: R$ %.2f%n", tarifa);
    }
}
