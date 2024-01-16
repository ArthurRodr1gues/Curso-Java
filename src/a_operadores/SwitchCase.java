package a_operadores;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
               
        System.out.println("Switch case:");
        switch (num1) {
            case 0:
                System.out.println("O número é zero.");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("O número é pequeno.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("O número é médio.");
                break;
            default:
                System.out.println("O número é grande.");
                break;
        }
        sc.close();
    }
}
