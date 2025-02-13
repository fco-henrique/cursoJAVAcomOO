package exercicio5;

public class PessoaJuridica extends Contribuinte {
    private Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(Integer numFuncionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    
    @Override
    public double imposto() {
        if(numFuncionarios > 10) {
            return super.getRendaAnual() * 0.14;
        }
        
        return super.getRendaAnual() * 0.16;
    }
    
}
