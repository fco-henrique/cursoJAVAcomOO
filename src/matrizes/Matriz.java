package matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Número de linhas");
        int linhas = scan.nextInt();
        System.out.println("Número de colunas");
        int colunas = scan.nextInt();
        int[][] matriz = new int[linhas][colunas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Valor da linha %d coluna %d\n", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Digite o número que você está procurando");
        int num = scan.nextInt();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == num){
                    if(j + 1 < matriz[i].length) System.out.printf("Direita: %d ", matriz[i][j + 1]);
                    if(j > 0) System.out.printf("Esquerda: %d ", matriz[i][j - 1]);
                    if(i > 0) System.out.printf("Em cima: %d ", matriz[i - 1][j]);
                    if(i + 1 < matriz.length) System.out.printf("Em baixo: %d ", matriz[i + 1][j]);
                }
            }
        }
        
        scan.close();
    }
}
