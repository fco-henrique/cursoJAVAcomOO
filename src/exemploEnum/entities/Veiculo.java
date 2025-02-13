package exemploEnum.entities;

import exemploEnum.enums.TipoVaga;

public class Veiculo {
    private String placa;
    private TipoVaga tipoVaga;

    public Veiculo(String placa, TipoVaga tipoVaga) {
        this.placa = placa;
        this.tipoVaga = tipoVaga;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVaga getTipoVaga() {
        return tipoVaga;
    }

    public double calcularTarifa(int horas) {
        return tipoVaga.calcularTarifa(horas);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", tipoVaga=" + tipoVaga +
                '}';
    }
}
