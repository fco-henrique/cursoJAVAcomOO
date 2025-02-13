package vetores;

import java.util.Scanner;

public class MaisVelha {

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

            p[i] = new Pessoa(nome, idade);
        }
        
        int maisVelha = p[0].getIdade();
        int posicao = 0;
        
        for (int i = 0; i < p.length; i++) {
            if(p[i].getIdade() > maisVelha) {
                maisVelha = p[i].getIdade();
                posicao = i;
            }
        }
        
        System.out.println("Mais velha: " + p[posicao].getNome());

        scan.close();
    }
}
