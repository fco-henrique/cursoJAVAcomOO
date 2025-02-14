package interfaces.model.entities;

public class Veiculo {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo() {
    }

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
}
