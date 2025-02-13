package composicao;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Worker;
import entidades.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Entre com o nome do departamento: ");
        String departamento = scan.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalho = scan.nextLine();
        System.out.print("Nível: ");
        String nivelTrabalho = scan.nextLine();
        System.out.print("Salário base: ");
        double salalrioBase = scan.nextDouble();
        
        Worker worker = new Worker(nomeTrabalho, WorkerLevel.valueOf(nivelTrabalho), salalrioBase, new Departamento(departamento));
        
        System.out.print("Quantos contratos esse trabalhador tem?");
        int n = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Entre com os dados do contrato #%d\n", i);
            System.out.print("Entre com a data: (DD/MM/AAAA)");
            Date dataContrato = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            double valorHora = scan.nextDouble();
            System.out.print("Duração em horas: ");
            int duracao = scan.nextInt();
            
            ContratoHora contrato = new ContratoHora(dataContrato, valorHora, duracao);
            worker.addContract(contrato);
        }
        
        System.out.println("");
        System.out.print("Entre com mês e ano para calcular o salário: (MM/yyyy)");
        String mesEAno = scan.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartamento().getName());
        System.out.println("Ganho em " +  mesEAno + ": " + String.format("%.2f", worker.ganho(ano, mes)));
        
        scan.close();
    }
}
