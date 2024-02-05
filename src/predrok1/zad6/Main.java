package predrok1.zad6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][]matrica = new int [n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrica[i][j] = input.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            Nit mojaNit = new Nit(matrica, i);
            mojaNit.start();
            mojaNit.join();
        }
    }
}
