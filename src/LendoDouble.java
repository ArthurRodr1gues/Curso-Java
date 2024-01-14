import java.util.Locale;
import java.util.Scanner;

public class LendoDouble {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //mudando o local para mudar o separador de decimal para o ponto.
        Scanner sc = new Scanner(System.in);

        double x;
        System.out.print("Digite um double: ");
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", x);

        sc.close();
    }
}
