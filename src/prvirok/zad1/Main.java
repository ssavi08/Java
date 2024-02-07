package prvirok.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = input.nextInt();
            }
        }

        int[][] mat2 = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat2[i][j] = mat[j][i];
            }
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
