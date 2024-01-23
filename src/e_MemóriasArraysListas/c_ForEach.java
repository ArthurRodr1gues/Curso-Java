package e_MemóriasArraysListas;

public class c_ForEach {

    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};
        
        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }
    
        //Pulando linha e usando o laço for each
        //Leitura: "para cada objeto 'obj' contido em vect, faça:"
        //obj foi um apelido que eu criei. Poderia ser qualquer um.
        System.out.println();
        for (String obj : vect) {
            System.out.println(obj);
        }

    }
}