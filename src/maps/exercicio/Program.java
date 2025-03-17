package maps.exercicio;

import generics.entities.Produto;
import generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<Candidato,Integer> candidatos = new TreeMap<>();
        String path = "C:\\Users\\henri\\qualquer_nome\\arquivinho.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] f = line.split(",");
                candidatos.put(new Candidato(f[0]), Integer.parseInt(f[1]) + candidatos.getOrDefault(new Candidato(f[0]), 0));
                line = br.readLine();
            }

            for (Map.Entry<Candidato, Integer> entry : candidatos.entrySet()) {
                System.out.println(entry.getKey() + " recebeu " + entry.getValue() + " votos.");
            }
        }
        catch(IOException E) {
            System.out.println("Error" + E.getMessage());
        }
    }
}
