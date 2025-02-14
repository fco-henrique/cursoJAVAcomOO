package interfaces.model.services;

public interface ServicoDePagamentoOnline {
    double taxaDePagamento(double montante);
    double interest(double montante, int meses);
}
