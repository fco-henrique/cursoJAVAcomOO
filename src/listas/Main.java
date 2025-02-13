package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionarios você vai inserir?");
        int qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("ID do funcionario:");
            int id = scan.nextInt();
            System.out.println("Nome do funcionario:");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.println("Salário do funcionario:");
            double salario = scan.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.println("Qual o id do funcionário que você deseja alterar o salário:");
        int idFunc = scan.nextInt();

        Funcionario funcionario = funcionarios.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);

        System.out.println(funcionario);

        if (funcionario == null) {
            System.out.println("Funcionário não encontrado");
        } else {
            System.out.println("Quantos reais você deseja aumentar?");
            double aumento = scan.nextDouble();
            for (Funcionario func : funcionarios) {
                if (func == funcionario) {
                    func.setSalario(func.getSalario() + aumento);
                    System.out.println("Seu salario era: " + (func.getSalario() - aumento) + " e agora é: " + func.getSalario());
                }
            }
        }
        System.out.println("------------------");
        for (Funcionario funcionario1 : funcionarios) {
            System.out.println(funcionario1);
        }

        scan.close();
    }
}
