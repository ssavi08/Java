package predrok1.zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] A = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            Nit nit = new Nit(A, i);
            nit.start();
        }

        input.close();
    }
}
