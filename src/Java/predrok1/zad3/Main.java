package Java.predrok1.zad3;
/*potrebno nap program cjelobrojna kvadratna matrica max 100 elemenata provjerit dal ima magicni kvadrat
jednak  zbroj redova stupaca i dijagonala
ak ima onda 1 a ak nema pise -1*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            n = input.nextInt();
        }while ( n <= 0 || n > 100);

        int[][] A = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = input.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(A[i][j]);
            }
            System.out.println("");
        }

        int[] sumaRedova = new int[n];
        int[] sumaStupaca = new int[n];
        int sumaDijagonalaGlavne = 0;
        int sumaDijagonalaSporedne = 0;
        int rez = -1;

        //suma glavne i sporedne dijagonale
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                sumaRedova[j] += A[j][i];
                sumaStupaca[j] += A[i][j];

                if (i == j) {
                    sumaDijagonalaGlavne += A[i][j];
                }
                if (i + j == n - 1) {
                    sumaDijagonalaSporedne += A[i][j];
                }
            }
        }

        int broj = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sumaRedova[j] == sumaStupaca[j] && sumaRedova[j] == sumaDijagonalaSporedne && sumaRedova[j] == sumaDijagonalaGlavne) {
                    broj = 1;
                } else {
                    broj = -1;
                }
            }
        }
        System.out.println(broj+" "+sumaRedova[0]);
    }
}
