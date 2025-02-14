package interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService{
    private double taxaDejuros;

    public UsaInterestService(double taxaDejuros) {
        this.taxaDejuros = taxaDejuros;
    }

    @Override
    public double getTaxaDeJuros() {
        return taxaDejuros;
    }
}
