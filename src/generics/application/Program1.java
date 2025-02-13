package generics.application;

import generics.entities.Produto;
import generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        String path = "C:\\Users\\henri\\qualquer_nome\\arquivinho.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String f[] = line.split(",");
                list.add(new Produto(f[0], Double.parseDouble(f[1])));
                line = br.readLine();
            }

            Produto maior = CalculationService.max(list);

            System.out.println("Maior: " + maior);
        }
        catch(IOException E) {
            System.out.println("Error" + E.getMessage());
        }
    }
}
