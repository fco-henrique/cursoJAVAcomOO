package exercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    private Date datadeFabricacao;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado() {
    }

    public ProdutoUsado(Date datadeFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.datadeFabricacao = datadeFabricacao;
    }

    public Date getDatadeFabricacao() {
        return datadeFabricacao;
    }

    public void setDatadeFabricacao(Date datadeFabricacao) {
        this.datadeFabricacao = datadeFabricacao;
    }
    
    @Override
    public void etiqueta() {
        System.out.println(super.getNome() + " (usado) $" + super.getPreco() + " (Data de fabricaacao: " + sdf.format(datadeFabricacao));
    }
    
    
}
