package encapsulamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta c1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o número da conta?");
        int numConta = scan.nextInt();
        scan.nextLine();
        System.out.println("Qual o titular da conta?");
        String titular = scan.nextLine();

        System.out.println("Deseja fazer um deposito inicial? (S/N)");
        String resposta = scan.next();

        if ("S".equals(resposta)) {
            System.out.println("Digite o valor que você deseja depositar");
            double depositoInicial = scan.nextDouble();
            c1 = new Conta(numConta, titular, depositoInicial);
        } else {
            c1 = new Conta(numConta, titular);
        }

        while (true) {
            System.out.println("O que deseja fazer? (V) verificar saldo, (D) depositar, (S) sacar, (T) mudar nome do titular, (C) ver"
                    + " número da conta ou (E) sair");
            resposta = scan.next();

            if ("E".equals(resposta)) {
                System.out.println("tchau");
                break;
            }

            if ("V".equals(resposta)) {
                System.out.println("Seu saldo é: R$" + c1.getSaldo());
            } else if ("D".equals(resposta)) {
                System.out.println("Digite o valor a ser depostitado:");
                double valor = scan.nextDouble();
                c1.deposito(valor);
                System.out.printf("Seu saldo era: R$%f e agora é: R$%f", c1.getSaldo() - valor, c1.getSaldo());
            } else if ("S".equals(resposta)) {
                System.out.println("Digite o valor a ser sacado:");
                double valor = scan.nextDouble();
                c1.saque(valor);
                System.out.printf("Seu saldo era: R$%f e agora é: R$%f", c1.getSaldo() + valor + 5, c1.getSaldo());
            } else if ("T".equals(resposta)) {
                scan.nextLine();
                System.out.println("Digite o novo nome do titular da conta:");
                String novoNome = scan.nextLine();
                c1.setTitularConta(novoNome);
                System.out.println("Nome alterado para " + c1.getTitularConta());
            } else if ("C".equals(resposta)) {
                System.out.println("O número da sua conta é " + c1.getNumConta());
            } else {
                System.out.println("Operação inválida");
            }

        }

        scan.close();
    }
}
