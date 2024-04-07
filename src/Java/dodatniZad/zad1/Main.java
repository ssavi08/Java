package Java.dodatniZad.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] a = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = input.nextInt();
            }
        }

        int[] sRed = new int[n];
        int[] sStup = new int[n];
        int sGd=0, sSd=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sRed[j] += a[j][i];
                sStup[i] += a[i][j];
                if(i == j){
                    sGd += a[i][j];
                }
                if((i+j)==n-1){
                    sSd += a[i][j];
                }
            }
        }
        int fd=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
            for(int j=0; j<n; j++){
               if(sRed[j] == sStup[j] && sStup[j] == sGd && sGd == sSd){
                   fd=1;
               }else{
                   fd=-1;
               }
            }

        System.out.println(fd);
    }
}
