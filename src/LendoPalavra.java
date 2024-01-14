import java.util.Scanner;

public class LendoPalavra {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.print("Digite uma palavra: ");
        x = sc.next();
        System.out.println("A palavra digitada foi: " + x);

        sc.close();
    }
}
