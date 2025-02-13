package exercicio3.aplication;

import entidades.enums.OrderStatus;
import exercicio3.entities.Client;
import exercicio3.entities.Order;
import exercicio3.entities.OrderItem;
import exercicio3.entities.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome do cliente: ");
        String nome = scan.nextLine();
        System.out.print("Email do cliente: ");
        String email = scan.nextLine();
        System.out.print("Data de nascimento do cliente: (DD/MM/YYYY) ");
        Date nascimento = sdf.parse(scan.next());
        
        Client client = new Client(nome, email, nascimento);
        
        System.out.println("Entre com os dados do pedido:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());
        
        Order order = new Order(new Date(), status, client);
              
        System.out.print("Quantos produtos vão ser adiconados? ");
        int n = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("Entre com os dados do pedido #%d\n", i);
            System.out.print("Nome do produto: ");
            scan.nextLine();
            String nomeProd = scan.nextLine();
            System.out.print("Preço do produto: ");
            double precoProd = scan.nextDouble();
            System.out.print("Quantidade do produto: ");
            int quanitdadeProd = scan.nextInt();
            
            Product product = new Product(nomeProd, precoProd);
            
            OrderItem oi = new OrderItem(quanitdadeProd, precoProd, product);
            
            order.addItem(oi);
        }
        
        System.out.println();
        System.out.println(order);
        
        scan.close();
    }
}
