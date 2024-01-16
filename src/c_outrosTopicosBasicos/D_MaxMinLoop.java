package c_outrosTopicosBasicos;

import java.util.Scanner;

public class D_MaxMinLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa as variáveis para armazenar o maior e o menor número
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Pede ao usuário para digitar 4 números
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Atualiza as variáveis de maior e menor
            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe o resultado
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}
