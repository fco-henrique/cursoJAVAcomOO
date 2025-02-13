package heranca;

public class Program {
    public static void main(String[] args) {
        Conta conta = new Conta(123456, "Ismael", 0.0);
        ContaEmpresa ce = new ContaEmpresa(1000.0, 102030, "Dilma", 0.0);
        
        //UPCASTING
        Conta c1 = ce; //ce é uma conta
        Conta c2 = new ContaEmpresa(1500.0, 102031, "maria", 0.0); //contaEmpresa é uma conta
        Conta c3 = new ContaPolpanca(0.01, 123789, "Henrique", 0.0); //Contapolpansa também é uma conta
        
        //DOWNCASTING
        ContaEmpresa c4 = (ContaEmpresa) c2;
        c4.emprestimo(0);
        //ContaEmpresa c5 = (ContaEmpresa) c3;
        if(c3 instanceof ContaEmpresa) {
            ContaEmpresa c5 = (ContaEmpresa) c3;
            c5.emprestimo(100.0);
            System.out.println("Emprestimo realizado!");
        }
        
        if(c3 instanceof ContaPolpanca) {
            ContaPolpanca c5 = (ContaPolpanca) c3;
            c5.atualizarSaldo();
            System.out.println("Saldo atualizado");
        }
    }
}
