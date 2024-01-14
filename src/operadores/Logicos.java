package operadores;

import java.util.Scanner;

public class Logicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("Operadores lógicos:");
        System.out.format("%d é maior que 0 e %d é menor que 10? %b%n", num1, num2, num1 > 0 && num2 < 10);
        System.out.format("%d é maior que 0 ou %d é menor que 10? %b%n", num1, num2, num1 > 0 || num2 < 10);
        System.out.format("Não(%d é maior que 0 e %d é menor que 10)? %b%n", num1, num2, !(num1 > 0 && num2 < 10));
        
        sc.close();
    }
}
