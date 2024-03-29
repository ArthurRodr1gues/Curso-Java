package d_pOO1;

import java.util.Locale;
import java.util.Scanner;

import d_pOO1.entities.CalculatorNaoEstatico;

public class G_CalculatorNaoEstatico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculatorNaoEstatico calc = new CalculatorNaoEstatico();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }
}
