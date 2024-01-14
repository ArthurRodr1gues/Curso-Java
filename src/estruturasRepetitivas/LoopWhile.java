package estruturasRepetitivas;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int soma = 0;

        System.out.print("Digite um inteiro: ");
        int x = sc.nextInt();
        
        while (x != 0){
            soma += x;
            System.out.print("Digite mais um inteiro: ");
            x = sc.nextInt();
        }

        System.out.printf("O resultado da soma é: %d", soma);
        
        sc.close();
    }
}
