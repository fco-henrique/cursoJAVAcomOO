package polimorfismo;

public class FuncionarioTerceirizado extends Funcionario {

    private Double valorAdicional;
    
    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(Double valorAdicional, String nome, Integer horasTrabalhadas, Double valorHora) {
        super(nome, horasTrabalhadas, valorHora);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public double pagamento(){
        return super.pagamento() + valorAdicional * 1.1;
    }
    
    
}
