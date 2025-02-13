package enumeracao;

import entidades.Pedidos;
import entidades.enums.OrderStatus;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos(152, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
        
        System.out.println(pedido);
        
        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("ENVIADO");
        
        System.out.println(os1);
        System.out.println(os2);

    }
}
