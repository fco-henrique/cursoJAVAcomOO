package interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getTaxaDeJuros();

    default double pagamento(double quantia, int tempo) {
        if(tempo < 1) {
            throw new InvalidParameterException("O tempo não pode ser menor que um mês.");
        }
        return quantia * Math.pow(1.0 + getTaxaDeJuros() / 100, tempo);
    }
}
