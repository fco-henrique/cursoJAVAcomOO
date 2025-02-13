package abstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class    Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Forma> list = new ArrayList<>();
        
        System.out.print("Quantas formas você vai inserir? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Entre com os dados da forma #%d\n", i);
            
            System.out.print("A forma é um retangulo ou um circulo? (r/c) ");
            char res = sc.next().charAt(0);
            
            System.out.print("Qual a cor da figura? ");
            sc.nextLine();
            Cores c = Cores.valueOf(sc.nextLine());
            
            if(res == 'r') {
                System.out.print("Digite a altura: ");
                double al = sc.nextDouble();
                System.out.print("Digite a largura: ");
                double la = sc.nextDouble();
                
                list.add(new Retangulo(la, la, c));
                continue;
            }
            
            System.out.print("Digite o raio: ");
            double raio = sc.nextDouble();
                
            list.add(new Circulo(raio, c));
        }
        
        for (Forma forma : list) {
            System.out.println(forma.area());
        }
        
        sc.close();
    }
}
