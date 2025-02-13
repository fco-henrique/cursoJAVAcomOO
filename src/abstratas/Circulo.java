package abstratas;

public class Circulo extends Forma {
    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Double raio, Cores cor) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        return raio * raio * 3.14;
    }
}
