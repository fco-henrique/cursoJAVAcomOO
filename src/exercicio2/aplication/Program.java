package exercicio2.aplication;

import exercicio2.entitites.Coments;
import exercicio2.entitites.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
        
        Coments c1 = new Coments("Isso e muito e massa");
        Coments c2 = new Coments("Catapimbas");
        Post p1 = new Post(sdf.parse("21/06/2018  13:05:44"), "minha viagem", "uma viagem muito legal", 4);
        
        p1.addComent(c1);
        p1.addComent(c2);
        
        System.out.println(p1);

    }
}
