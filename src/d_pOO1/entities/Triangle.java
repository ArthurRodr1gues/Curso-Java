package d_pOO1.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area (){
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
        //Poderia ser também assim:
        //return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
