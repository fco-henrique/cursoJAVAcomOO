package abstratas;

public class Retangulo extends Forma {
    private Double largura;
    private Double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(Double largura, Double altura, Cores cor) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return largura * altura;
    }
}
