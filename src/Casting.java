public class Casting {
    
    public static void main(String[] args) {
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = a / b;
        System.out.println(resultado); //Aqui o exemplo errado, sem o casting
        resultado = (double) a / b; //Se essa coversão de tipo não fosse feita seria impresso apenas o 2
        System.out.println(resultado);


        //Exemplo de erro de atribuição devido a possível perda de dados
        double c;
        int d;
        c = 5.0;
        d = (int) c;// A variável inteira d não pode receber uma float como a c, por isso houve a conversão de tipo
        System.out.println(d);
    }
}
