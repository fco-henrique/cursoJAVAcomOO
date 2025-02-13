package exercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        List<Produto> list = new ArrayList<>();
        
        System.out.print("Quantos produtos voce vai inserir? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Entre com os dados do produto #%d\n", i);
            System.out.println("Qual o tipo do produto? (i) importado (u) usado (c) comum ");
            char tipo = sc.next().charAt(0);
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            
            if(tipo == 'i') {
                System.out.print("taxa alfandegaria: ");
                double taxa = sc.nextDouble();
                
                list.add(new ProdutoImportado(taxa, nome, preco));
                continue;
            }
            if(tipo == 'u') {
                System.out.print("Data de fabricacao: ");
                Date dataFab = sdf.parse(sc.next());
                
                list.add(new ProdutoUsado(dataFab, nome, preco));
                continue;
            }
            
            list.add(new Produto(nome, preco));
        }
        
        for (Produto p : list) {
            p.etiqueta();
        }
        
        sc.close();
    }
}
