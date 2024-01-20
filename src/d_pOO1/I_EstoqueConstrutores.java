package d_pOO1;

import java.util.Locale;
import java.util.Scanner;

import d_pOO1.entities.I_ProductConstrutor;

public class I_EstoqueConstrutores {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        //Criamos variáveis temporárias acima e, abaixo, instanciamos já com o que é esperado

        I_ProductConstrutor product = new I_ProductConstrutor(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);        
        System.out.println();
        System.out.print("Enter the number of products to be addded in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();


    }
}
