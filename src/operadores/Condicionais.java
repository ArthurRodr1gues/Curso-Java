package operadores;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("Operadores condicionais:");
        if (num1 > num2) {
            System.out.format("%d é maior que %d.%n", num1, num2);
        } else if (num1 < num2) {
            System.out.format("%d é menor que %d.%n", num1, num2);
        } else {
            System.out.format("%d é igual a %d.%n", num1, num2);
        }
        
        System.out.println("Expressão condicional ternária:");
        String resultado = (num1 > num2) ? "maior" : ((num1 < num2) ? "menor" : "igual");
        System.out.format("%d é %s que %d.%n", num1, resultado, num2);

        sc.close();
    }
}
