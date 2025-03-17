package sets.exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\henri\\qualquer_nome\\sla.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        Scanner sc = null;
        Set<Usuario> set = new HashSet<>();

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] arr = sc.nextLine().split(" ");
                String nome = arr[0];
                Date data = sdf.parse(arr[1]);
                set.add(new Usuario(nome, data));
                System.out.println(arr[0] + " " + arr[1]);
            }

            System.out.println(set.size());
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Fim do programa");
        }
    }
}
