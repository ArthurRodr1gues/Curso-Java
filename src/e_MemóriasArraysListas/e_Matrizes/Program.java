package e_MemóriasArraysListas.e_Matrizes;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Informe o número de colunas: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n]; // Criação da matriz m x n.

        // Pede todos os elementos da matriz um por um
        for (int i = 0; i < mat.length; i++) { //mat.length representa a quantidade de linhas
            //Abaixo, o math.length[i] retorna a quntidade de colunas. Confira explicação em z_Conteúdos.txt
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Digite o elemento na posição %d%d: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        // Imprimir a matriz informada
        System.out.println("Matriz informada:"); //Cabeçalho
        for (int i = 0; i < mat.length; i++) { //Percorrendo as linhas
            for (int j = 0; j < mat[i].length; j++) { //Percorrendo as colunas
                System.out.print(mat[i][j] + " "); //Imprimindo o conteúdo da posição [i-fixado] [j-variando] lado a lado
            }
            System.out.println(); // Nova linha para separar as linhas da matriz. Pula quando sai de um [i] para [i++].
        }

        System.out.print("Informe um número para encontrar seus vizinhos: ");
        int x = sc.nextInt();

        // Encontrar a posição do número e seus vizinhos
        // Encontrar a posição do número e seus vizinhos
        for (int i = 0; i < mat.length; i++) { // Percorre as linhas
            for (int j = 0; j < mat[i].length; j++) { // Percorre as colunas
                if (mat[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) { // Se a coluna for > 0, então à esquerda teremos [linha][coluna-1]
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) { // Se a linha for > 0, então acima teremos [linha-1][mesma coluna]
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) { // Se a coluna não for a última, então à direita teremos [linha][coluna+1]
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) { // Se a linha não for a última, então abaixo teremos [linha+1][mesma coluna]
                        System.out.println("Abaixo: " + mat[i + 1][j]);
                    }
                }
            }
}

        sc.close();
    }
}
