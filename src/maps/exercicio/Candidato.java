package maps.exercicio;

import java.util.Objects;

public class Candidato implements Comparable<Candidato> {
    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(nome, candidato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Candidato(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Candidato outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
