package predrok2.zad1;

import java.util.Scanner;

/*N i M prave matricu i treba napravit kopiju te matrice mb i nb velicine
sa r i k pocetkom redka i stupca origigi matrice  */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int r = input.nextInt();
        int k = input.nextInt();
        int nb = input.nextInt();
        int mb = input.nextInt();

        int[][] matrica = new int[n][m];

        for(int i = 0; i <n; i++){
            for(int j=0; j<m; j++){
                matrica[i][j] = input.nextInt();
            }
        }

        if(r<0 || r+nb>n || k+mb>m || k<0){
            System.out.println("Neisparavn unos!");
            return;
        }

        int[][] B = new int[nb][mb];

        for(int i=0; i<nb; i++){
            for(int j=0; j<mb; j++){
                B[i][j] = matrica[r+i][k+j];
            }
        }

        for(int i=0; i< nb; i++){
            for(int j=0; j< mb; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

//GG