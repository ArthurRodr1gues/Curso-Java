package e_MemóriasArraysListas.a_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um tamanho para o vetor: ");
        int n = sc.nextInt();
        double [] vect = new double [n];

        for (int i=0; i<n; i++){
            System.out.printf("Digite a %d° altura: ", i+1);
            vect[i] = sc.nextDouble();
            System.out.printf("O conteúdo da posição %d é %.2f. %n%n", i, vect[i]);          
        }

        //Calculando a média
        double sum = 0.0;

        for(int i=0; i<n; i++ ){
            sum += vect[i];

        }
        double avg = sum/n;

        System.out.println();
        System.out.printf("AVERAGE HEIGHT: %.2f", avg);

        
        sc.close();
    }
}