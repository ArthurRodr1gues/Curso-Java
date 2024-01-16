package a_operadores;

import java.util.Scanner;
import java.util.Locale;

public class CalculoImc {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.println("Informe a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / Math.pow(altura, 2);

        // Avaliação do IMC
        if (imc < 18.5) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Sobrepeso");
        } else {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}
