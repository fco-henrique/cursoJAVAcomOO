package estruturaCondicional;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int horaInicio = scan.nextInt();
        int horaFim = scan.nextInt();
        
        int horasTotais = 0;
        
        if(horaInicio < horaFim) {
            horasTotais = horaFim - horaInicio;
        } else {
            horasTotais = 24 - horaInicio + horaFim;
        }
        
        System.out.println("O jogo durou " + horasTotais + " horas");
        
        scan.close();
    }
}
