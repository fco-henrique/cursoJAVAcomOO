package interfaces.model.services;

import interfaces.model.entities.Contrato;
import interfaces.model.entities.Parcela;

import java.time.LocalDate;

public class ContratoService {
    private  ServicoDePagamentoOnline servicoDePagamentoOnline;

    public ContratoService(ServicoDePagamentoOnline servicoDePagamentoOnline) {
        this.servicoDePagamentoOnline = servicoDePagamentoOnline;
    }

    public void processamentoContrato(Contrato contrato, int meses) {
        double parcelaBasica = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate vencimentoParcela = contrato.getData().plusMonths(i);

            double juro = servicoDePagamentoOnline.interest(parcelaBasica, i);
            double taxa = servicoDePagamentoOnline.taxaDePagamento(parcelaBasica + juro);
            double cota = parcelaBasica + juro + taxa;

            contrato.getParcelas().add(new Parcela(vencimentoParcela, cota));
        }
    }
}
