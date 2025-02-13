package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> list = new ArrayList<>();
        
        System.out.print("quantos funcionarios vao ser inseridos? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite os dados do funcionario #%d\n", i);
            
            System.out.print("Ele é terceirizado? s (sim), n (nao)  ");
            char carac = sc.next().charAt(0);
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.print("Horas trabalhadas: ");
            int horasTrab = sc.nextInt();
            
            System.out.print("Valor por hora: ");
            Double valorHora = sc.nextDouble();
            
            if(carac == 's') {
                System.out.print("Valor adicional: ");
                double va = sc.nextDouble();
                
                list.add(new FuncionarioTerceirizado(va, nome, horasTrab, valorHora));
                continue;
            }
            
            list.add(new Funcionario(nome, horasTrab, valorHora));
            
        }
        
        System.out.println("");
        for (Funcionario f : list) {
            System.out.println(f.getNome() + " - $ " + f.pagamento());
        }
        
        sc.close();
    }
}
