package sets.exercicio;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Usuario {
    private String name;
    private Date acess;

    public Usuario(String name, Date acess) {
        this.name = name;
        this.acess = acess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAcess() {
        return acess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(name, usuario.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
