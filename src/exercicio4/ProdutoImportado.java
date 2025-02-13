package exercicio4;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandegaria;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(Double taxaAlfandegaria, String nome, Double preco) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }
    
    public double precoTotal() {
        return super.getPreco() + taxaAlfandegaria;
    }
    
    @Override
    public void etiqueta() {
        System.out.println(super.getNome() + " $ " + precoTotal() + " (Taxa alfandegaria: $ " + taxaAlfandegaria + ")");
    }
    
}
