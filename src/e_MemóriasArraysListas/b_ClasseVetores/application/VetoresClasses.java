package e_MemóriasArraysListas.b_ClasseVetores.application;
import java.util.Locale;
import java.util.Scanner;

import e_MemóriasArraysListas.b_ClasseVetores.entities.Product;

public class VetoresClasses {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vector size: ");
        int n = sc.nextInt();
        
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine(); //Consumindo
            System.out.printf("Type the %dº name: ", i+1);
            String name = sc.nextLine();
            System.out.printf("Type the %dº price: ", i+1);
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
            System.out.printf("Sum of %d values: %.2f", i+1, sum);
        }

        double avg = sum/n;

        System.out.printf("Average price = %.2f%n", avg);
        sc.close();
    }
    
}
