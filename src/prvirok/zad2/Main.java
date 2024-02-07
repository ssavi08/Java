package prvirok.zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] mat = new int[n][n];

        //unos matrice
        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                mat[i][j] = input.nextInt();
            }
        }
        //kreiranje kopije matrice i njeno obrtanje tako da funkcija run() može računati vertikalne elemente
        //originalne matrice
        int[][] mat2 = new int[mat.length][mat.length];
        for(int i=0; i<mat.length; i++){
            for( int j=0; j<mat.length; j++){
                mat2[i][j] = mat[j][i];
            }
        }

        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }

        //kreiranje onoliko niti koliko ima elemenata na glavnoj dijagonali
        //posto je mat kvadratna, elementi su = n
        for(int i=0; i<n; i++){
            Nit nit = new Nit("Nit "+i, mat2, i);
            nit.start();
            nit.join();
        }
    }
}
