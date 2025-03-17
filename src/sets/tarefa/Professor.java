package sets.tarefa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Professor {
    private static Integer qtd = 0;
    private Integer id;
    private String nome;
    private ArrayList<Curso> cursosMinistrados;

    public Professor(String nome) {
        this.id = qtd;
        qtd++;
        this.nome = nome;
        cursosMinistrados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> listCourses() {
        return cursosMinistrados;
    }

    public void addCourse(Curso c) {
        cursosMinistrados.add(c);
    }

    @Override
    public String toString() {
        return "[ " +
                "id=" + id +
                ", nome='" + nome + '\'' +
                " ]";
    }
}
