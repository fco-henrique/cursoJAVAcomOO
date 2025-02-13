package orientacaoAObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Retangulo r = new Retangulo();
        
        r.altura = scan.nextDouble();
        r.largura = scan.nextDouble();
        
        System.out.println(r.area());
        System.out.println(r.diagonal());
        System.out.println(r.perimetro());
        
        scan.close();
    }
}
