package entidades;

import entidades.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalarial;
    
    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>(); //como trabalho tem muitos contratos, esses contratos não precisam ser incluidos no constructor

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalarial, Departamento departamento) {
        this.name = name;
        this.level = level;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void addContract(ContratoHora contrato) {
        contratos.add(contrato);
    }
    
    public void removeContract(ContratoHora contrato) {
        contratos.remove(contrato);
    }
    
    public double ganho(int ano, int mes){
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora contrato : contratos) {
            cal.setTime(contrato.getData());
            int anoC = cal.get(Calendar.YEAR);
            int mesC = 1 + cal.get(Calendar.MONTH);
            if(anoC == ano && mesC == mes){
                soma += contrato.valorTotal();
            }
            
        }
        
        return soma;
    }
}
