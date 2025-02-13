package vetores;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você vai digitar?");
        int num = scan.nextInt();
        
        Pessoa[] p = new Pessoa[num];
        
        for (int i = 0; i < p.length; i++) {
            scan.nextLine();
            System.out.println("Digite o nome da pessoa:");
            String nome = scan.nextLine();
            System.out.println("Digite a idade da pessoa:");
            int idade = scan.nextInt();
            System.out.println("Digite a altura da pessoa:");
            double altura = scan.nextDouble();
            
            p[i] = new Pessoa(nome, idade, altura);
        }
        
        double alturaTot = 0;
        for (int i = 0; i < p.length; i++) {
            alturaTot += p[i].getAltura();
        }
        
        int menorDe16 = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].getIdade() < 16) menorDe16++;
        }
        
        System.out.println("Altura média: " + alturaTot / p.length);
        System.out.println("Menores de 16: " + (double) menorDe16 / p.length * 100 + "%");
        
        for (int i = 0; i < p.length; i++) {
            if(p[i].getIdade() < 16) System.out.println(p[i].getNome());
        }
        
        scan.close();
    }
}
