import java.util.Locale;
import java.util.Scanner;

public class VariosDadosMsmLinha {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string, um int e um double: ");

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        sc.close();
    }
}
