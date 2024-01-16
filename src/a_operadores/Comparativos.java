package a_operadores;

import java.util.Scanner;

public class Comparativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        System.out.println("Operadores comparativos:");
        System.out.format("%d é igual a %d? %b%n", num1, num2, num1 == num2);
        System.out.format("%d é diferente de %d? %b%n", num1, num2, num1 != num2);
        System.out.format("%d é maior que %d? %b%n", num1, num2, num1 > num2);
        System.out.format("%d é menor que %d? %b%n", num1, num2, num1 < num2);
        System.out.format("%d é maior ou igual a %d? %b%n", num1, num2, num1 >= num2);
        System.out.format("%d é menor ou igual a %d? %b%n", num1, num2, num1 <= num2);

        sc.close();
    }
}

//---------------Explicação---------------//
//Perceba que na saída formatada é impresso os inteiros num1 e num2 e o resultado booleano (%b) da comparação entre eles
