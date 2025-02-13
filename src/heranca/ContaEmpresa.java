package heranca;

public class ContaEmpresa extends Conta {
    private Double limite;

    public ContaEmpresa() {
        super();
    }

    public ContaEmpresa(Double limite, Integer number, String titular, Double saldo) {
        super(number, titular, saldo);
        this.limite = limite;
    }
    
    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
    public void emprestimo(double valor) {
        if(valor <= limite) {
            saldo += valor - 10;
        }
    }
    
}
