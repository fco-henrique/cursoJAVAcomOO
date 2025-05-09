package exercicio2.entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
    
    private List<Coments> coments = new ArrayList<>();

    public Post() {
    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Coments> getComents() {
        return coments;
    }

    public void addComent(Coments coment){
        coments.add(coment);
    }
    
    public void removeComent(Coments coment){
        coments.remove(coment);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(likes).append(" - Likes - ");
        sb.append(sdf.format(momento)).append("\n");
        sb.append(conteudo).append("\n");
        sb.append("Coments:").append("\n");
        for (Coments c : coments) {
            sb.append(c.getText()).append("\n");
        }
         
        return sb.toString();
    }
    
}
