package Java.predrok1.zad1;

import java.util.Scanner;

/*potrebno je napisati program koji ce za kvadratnu matricu A s N redaka i N stupaca koja u sebi ima samo nule i
jedinice, izracunati koliko ima ponavljanja broja 0, a da su oko njega sve jedinice*/
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] A = new int[n][n];

        //Unosenje 0 i 1
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int unos;
                do{
                    A[i][j] = input.nextInt();
                    unos = A[i][j];
                }while( unos != 0 && unos != 1 );
            }
        }

        System.out.println(String.valueOf(funkcija(A, n)));
    }

    public static int funkcija(int[][] a, int b){
        int brojac = 0;

        for(int i=1; i<b-1; i++){
            for(int j=1; j<b-1; j++){
                if( a[i][j] == 0 && a[i-1][j-1]==1 && a[i][j-1]==1 && a[i+1][j-1]==1 && a[i-1][j]==1 && a[i+1][j]==1 && a[i-1][j+1]==1 && a[i][j+1]==1 && a[i+1][j+1]==1){
                    brojac++;
                }
            }
        }
        return brojac;
    }
}
