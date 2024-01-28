package ga_Enumerações.Aula01.application;

import java.util.Date;
import java.util.Scanner;

import ga_Enumerações.Aula01.entities.Order;
import ga_Enumerações.Aula01.entities.enums.OrderStatus;

public class Program1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada do ID do pedido
        System.out.print("Enter the order ID: ");
        int orderId = scanner.nextInt();
        
        // Solicitar entrada do ID do produto
        System.out.print("Enter the product ID: ");
        int productId = scanner.nextInt();
        
        // Solicitar entrada do status do pedido
        System.out.print("Enter the order status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String statusInput = scanner.nextLine();

        OrderStatus orderStatus = OrderStatus.valueOf(statusInput);

        // Criar instância da classe Order com os dados fornecidos pelo usuário
        Order order = new Order(orderId, productId, new Date(), orderStatus);

        // Imprimir os detalhes do pedido
        System.out.println("Order details:\n" + order);

        scanner.close();
    }
}
