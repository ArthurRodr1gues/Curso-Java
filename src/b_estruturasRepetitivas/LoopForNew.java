package b_estruturasRepetitivas;

import java.util.Scanner;

public class LoopForNew {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de iterações: ");
            int N = sc.nextInt();
            int soma = 0;
            int i; //Declarada fora para fazer parte do escopo global e poder ser usada na linha 19

            for (i = 0; i < N; i++) {
                System.out.printf("Digite o %d° número: ", i+1);
                int x = sc.nextInt();
                soma += x;
            }

            System.out.printf("A soma dos %d números digitados é: %d", i, soma);
        sc.close();
        }
    }
    
}

//Aqui é para ver que o alerta de não fechamento do scanner é falso