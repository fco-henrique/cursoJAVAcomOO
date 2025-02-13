package exemploEnum.enums;

public enum TipoVaga {
    CARRO,
    MOTO_BIKE;

    public double calcularTarifa(int horas) {
        switch (this) {
            case CARRO:
                return horas * 5.0; // Exemplo: R$ 5,00 por hora para carros
            case MOTO_BIKE:
                return horas * 2.5; // Exemplo: R$ 2,50 por hora para motos/bikes
            default:
                throw new IllegalArgumentException("Tipo de vaga inválido");
        }
    }
}
