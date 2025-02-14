package interfaces.model.services;

public class PayPalService implements ServicoDePagamentoOnline {

    @Override
    public double taxaDePagamento(double montante) {
        return montante * 0.02;
    }

    @Override
    public double interest(double montante, int meses) {
        return montante * 0.01 * meses;
    }
}
