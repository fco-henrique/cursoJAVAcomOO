package exercicio3.entities;

import entidades.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date momento;
    private OrderStatus status;
    
    private Client cliente;
    
    private List<OrderItem> itens = new ArrayList<OrderItem>();

    public Order() {
    }

    public Order(Date momento, OrderStatus status, Client cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    
    public void addItem(OrderItem item){
        itens.add(item);
    }
    
    public void removeItem(OrderItem item){
        itens.remove(item);
    }
    
    public Double total(){
        double sum = 0.0;
        
        for (OrderItem iten : itens) {
            sum += iten.subTotal();
        }
        
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
    }
    
    
    
}
