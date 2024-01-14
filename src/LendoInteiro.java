import java.util.Scanner;

public class LendoInteiro {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite um inteiro: ");
        x = sc.nextInt();
        System.out.println("O inteiro digitado foi: " + x);

        sc.close();
    }
}
