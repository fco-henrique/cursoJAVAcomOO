package interfaces.model.services;

import interfaces.model.entities.AluguelCarro;
import interfaces.model.entities.Fatura;

import java.time.Duration;

public class AluguelServices {
    private Double precoHora;
    private Double precoDia;

    private TaxService brasilTaxServices;

    public AluguelServices(Double precoHora, Double precoDia, TaxService brasilTaxServices) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.brasilTaxServices = brasilTaxServices;
    }

    public void processoDeFatura(AluguelCarro aluguelCarro) {
        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        double horas = minutos / 60;

        double pagamentobasico;
        if(horas <= 12) {
            pagamentobasico = precoHora * Math.ceil(horas);
        } else {
            pagamentobasico = precoDia * Math.ceil(horas / 24);
        }

        double taxa = brasilTaxServices.taxa(pagamentobasico);

        aluguelCarro.setFatura(new Fatura(pagamentobasico, taxa));
    }
}
