package generics.entities;

public class Retangulo implements Shape{
    private double tamanho;
    private double largura;

    public Retangulo(double tamanho, double largura) {
        this.tamanho = tamanho;
        this.largura = largura;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return 0;
    }
}
