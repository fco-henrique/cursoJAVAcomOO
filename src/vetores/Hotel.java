package vetores;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você vai digitar?");
        int num = scan.nextInt();

        Pessoa[] p = new Pessoa[10];
        //String[] quartos = new String[10];
        
        for (int i = 0; i < num; i++) {
            System.out.println("Digite o nome:");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.println("Digite o email:");
            String email = scan.nextLine();
            System.out.println("Digite o quarto que deseja:");
            int quarto = scan.nextInt();
            
            p[quarto] = new Pessoa(nome, email);
        }
        
        System.out.println("Os hospedes cadastrados são:");
        for (int i = 0; i < p.length; i++) {
            if(p[i] != null) {
                System.out.println("Nome: " + p[i].getNome() + " Email: " + p[i].getEmail() + " Quarto: " + i);
            }
        }
        
        scan.close();
    }
}
