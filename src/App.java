import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        double x = 10.35689;
        String nome = "Maria";
        int idade = 31;
        double renda = 400.0;
                
        Locale.setDefault(Locale.US);//alterando o local para USA para usar o ponto no printf em vez da vírgula.
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado = " + x + " metros");//Observe a concatenação, ela é feita com o sinal +
        System.out.printf("Resultado = %.2f metros%n",x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);//Concatenação no printf
    }
}
