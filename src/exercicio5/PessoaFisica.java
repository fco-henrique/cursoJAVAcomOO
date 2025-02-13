package exercicio5;

public class PessoaFisica extends Contribuinte {
    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(Double gastosComSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }
    
    @Override
    public double imposto() {
        if(super.getRendaAnual() < 20000) {
            return super.getRendaAnual() * 0.15 - gastosComSaude * 0.5;
        } 
        
        return super.getRendaAnual() * 0.25 - gastosComSaude * 0.5;
    }
    
}
