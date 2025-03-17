package sets.tarefa;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {
    static private Integer qtd = 0;
    private Integer id;
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Curso(String nome, Professor professor) {
        this.id = qtd;
        qtd++;
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.professor = professor;
        this.professor.addCourse(this);
    }

    public ArrayList<Aluno> listStudent() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "[ " +
                "id=" + id +
                ", nome='" + nome + '\'' +
                " ]";
    }
}
