package interfaces.application;

import interfaces.model.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\henri\\qualquer_nome\\arquivinho.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCsv = br.readLine();

            while (funcionarioCsv != null) {
                String[] fields = funcionarioCsv.split(",");
                list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCsv = br.readLine();
            }

            Collections.sort(list);

            for (Funcionario funcionario : list) {
                System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
