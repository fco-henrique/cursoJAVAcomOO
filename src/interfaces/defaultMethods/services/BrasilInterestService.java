package interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public class BrasilInterestService implements InterestService {
    private double taxaDejuros;

    public BrasilInterestService(double taxaDejuros) {
        this.taxaDejuros = taxaDejuros;
    }

    @Override
    public double getTaxaDeJuros() {
        return taxaDejuros;
    }
}
