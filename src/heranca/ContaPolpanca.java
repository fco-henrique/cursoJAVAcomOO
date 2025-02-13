package heranca;

public class ContaPolpanca extends Conta {
    private Double taxaJuros;

    public ContaPolpanca() {
        super();
    }

    public ContaPolpanca(Double taxaJuros, Integer number, String titular, Double saldo) {
        super(number, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void atualizarSaldo() {
        saldo  += saldo * taxaJuros;
    }
    
}
