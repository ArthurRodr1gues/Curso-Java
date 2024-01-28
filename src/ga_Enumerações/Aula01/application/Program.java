package ga_Enumerações.Aula01.application;


import java.util.Date;

import ga_Enumerações.Aula01.entities.Order;
import ga_Enumerações.Aula01.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        //Acima, no new order, utilizamos o construtor completo
        //Quando digitamos, no último argumento, OrderStatus. ele já
        //pede para selecionar o status
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}