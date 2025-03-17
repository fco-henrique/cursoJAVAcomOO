package sets.tarefa;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
    static private Integer qtd = 0;
    private Integer id;
    private String nome;
    private ArrayList<Curso> cursos;

    public Aluno(String nome) {
        id = qtd;
        qtd++;
        this.nome = nome;
        cursos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> listCourses() {
        return cursos;
    }

    public void registerForTheCouse(Curso curso) {
        curso.adicionarAluno(this);
        cursos.add(curso);
    }

    public void leaveTheCourse(Curso curso) {
        curso.removerAluno(this);
        cursos.remove(curso);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "[" +
                " id=" + id +
                ", nome='" + nome + '\'' +
                " ]";
    }
}
