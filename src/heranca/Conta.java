package heranca;

public class Conta {
    private Integer number;
    private String titular;
    protected Double saldo; //ele  é protected para que a classe filha possa usar essa variável livremente nela

    public Conta() {}

    public Conta(Integer number, String titular, Double saldo) {
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double valor) {
        saldo -= valor;
    }
    
    public void deposito(double valor) {
        saldo += valor;
    }
}
