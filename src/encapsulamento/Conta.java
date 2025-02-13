package encapsulamento;

public class Conta {
    private int numConta;
    private String titularConta;
    private double saldo;
    
    public Conta(int numConta, String titularConta, double depositoInicial) {
        this.numConta = numConta;
        this.titularConta = titularConta;
        deposito(depositoInicial);
    }
    
    public Conta(int numConta, String titularConta) {
        this.numConta = numConta;
        this.titularConta = titularConta;
    }

    public int getNumConta() {
        return numConta;
    }
    public String getTitularConta() {
        return titularConta;
    }
    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void saque(double valor) {
        this.saldo -= valor + 5;
    }
    
    public void deposito(double valor) {
        this.saldo += valor;
    }
}
