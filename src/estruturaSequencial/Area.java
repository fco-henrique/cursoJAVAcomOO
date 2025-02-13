package estruturaSequencial;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float raio = scan.nextFloat();
        double PI = 3.14159;
            
        double area = (double) raio * raio * PI;
        System.out.println(area);
        
        scan.close();
    }
}
