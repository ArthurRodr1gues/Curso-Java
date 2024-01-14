import java.util.Scanner;

public class LendoChar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x;
        System.out.print("Digite um caractere: ");
        x = sc.next().charAt(0);
        System.out.println("O caractere digitado foi: " + x);

        sc.close();
    }
}
