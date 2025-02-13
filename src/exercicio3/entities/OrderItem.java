package exercicio3.entities;

public class OrderItem {
    private Integer quantidade;
    private Double preco;
    
    private Product produto;

    public OrderItem() {
    }

    public OrderItem(Integer quantidade, Double preco, Product produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }
        
    public double subTotal(){
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return getProduto().getNome()
            + ", $"
            + String.format("%.2f", preco)
            + ", Quantity: "
            + quantidade
            + ", Subtotal: $"
            + String.format("%.2f", subTotal());
    }
    
}
