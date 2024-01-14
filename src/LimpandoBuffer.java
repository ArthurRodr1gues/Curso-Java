import java.util.Scanner;

public class LimpandoBuffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;
        System.out.println("Digite um inteiro: ");
        x = sc.nextInt();
        sc.nextLine(); // Consumindo o caractere de nova linha pendente
        System.out.println("Digite uma string: ");
        s1 = sc.nextLine();
        System.out.println("Digite uma string: ");
        s2 = sc.nextLine();
        System.out.println("Digite uma string: ");
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}

//--------Explicação------//

//Quando antes do nextline() for usado um next diferente (int, double,...) 
//será preciso usar um nextline a mais apenas para consumir a quebra de linha ecdente