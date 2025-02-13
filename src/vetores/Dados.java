package vetores;

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você vai digitar?");
        int num = scan.nextInt();

        Pessoa[] p = new Pessoa[num];
        
        for (int i = 0; i < p.length; i++) {
            System.out.println("Digite a altura:");
            double altura = scan.nextDouble();
            System.out.println("Digite o gênero:");
            scan.nextLine();
            String genero = scan.nextLine();
            
            p[i] = new Pessoa(altura, genero);
        }
        
        double maior = p[0].getAltura();
        double menor = p[0].getAltura();
        double soma = 0;
        int numMulheres = 0;
        int numHomens = 0;
        
        for (int i = 0; i < p.length; i++) {
            if("M".equals(p[i].getGenero())) {
                if(p[i].getAltura() > maior) maior = p[i].getAltura();
                if(p[i].getAltura() < menor) menor = p[i].getAltura();
                numHomens++;
            } else {
                if(p[i].getAltura() > maior) maior = p[i].getAltura();
                if(p[i].getAltura() < menor) menor = p[i].getAltura();
                numMulheres++;
                soma += p[i].getAltura();
            }
        }
        
        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
        System.out.println("Média da altura das mulheres: " + soma / numMulheres);
        System.out.println("Número de homens: " + numHomens);
        
        scan.close();
    }
}
