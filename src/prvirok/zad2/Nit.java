package prvirok.zad2;

public class Nit extends Thread{

    String ime;
    int[][] mat;
    int indexNiti;

    Nit(String ime, int[][] mat, int indexNiti){
        this.ime = ime;
        this.mat = mat;
        this.indexNiti = indexNiti;
    }

    public void run(){

        int suma = 0;
        for(int i=indexNiti; i<indexNiti+1; i++){
            for( int j=0; j<mat.length; j++){
                if(i == j){
                    suma += mat[i][j];
                }
                if(i<j){
                    suma += mat[i][j];
                }
            }
        }
        System.out.println(ime +" "+suma);
    }
}

