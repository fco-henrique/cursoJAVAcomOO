package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos contribuintes você vai inserir? ");
        int n = sc.nextInt();
        
        List<Contribuinte> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Entre com os dados do contribuinte #%d\n", i);
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();
            
            System.out.print("Pessoa fisica (f) ou juridica (j): ");
            char res = sc.next().charAt(0);
            
            if(res == 'f') {
                System.out.print("Gastos com saude: ");
                double saude = sc.nextDouble();
                
                list.add(new PessoaFisica(saude, nome, renda));
                continue;
            }
            
            System.out.print("Quantidade de funcionarios: ");
            int funcionarios = sc.nextInt();
            
            list.add(new PessoaJuridica(funcionarios, nome, renda));
        }
        
        for (Contribuinte contribuinte : list) {
            System.out.println(contribuinte.getNome() + ": $ " + contribuinte.imposto());
        }
        
        sc.close();
    }
}
