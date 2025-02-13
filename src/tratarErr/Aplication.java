package tratarErr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        metodo1();
         
        System.out.println("Fim!");
    }
    
    public static void metodo1() {
        System.out.println("---INICIO METODO 1---");
        metodo2();
        System.out.println("---FIM METODO 1---");
    }
    
    public static void metodo2() {
        Scanner s = new Scanner(System.in);
    
        System.out.println("---INICIO METODO 2---");
        try {
            String[] vet = s.nextLine().split(" ");
            int pos = s.nextInt();
                System.out.println(vet[pos]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicao invalida");
        }
        catch (InputMismatchException e) {
                System.out.println("Erro no input");
        }
        System.out.println("---FIM METODO 2---");        
        s.close();
    }

}
