package predrok1.zad8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int [][]mat = new int[n][n];

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = input.nextInt();
            }
        }

        int sumaIznad = 0, sumaIspod = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if( (i+j) < n-1){
                    sumaIznad += mat[i][j];
                }
                if( i+j > n-1){
                    sumaIspod += mat[i][j];
                }
            }
        }

        int rez = sumaIznad > sumaIspod ? 1 : -1;
        System.out.println(rez);


    }
}
