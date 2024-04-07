package Java.predrok1.zad6;

public class Nit extends Thread{

    int[][] matrica;
    int i;
    Nit(int[][] matrica, int i){
        this.matrica = matrica;
        this.i = i;
    }

    public void run(){
        int suma = 0;

        //od 0 do kraja matrice
        //vrijednost na indeksu, tipa int
        for(int bananaman : matrica[i]){
            suma += bananaman;
        }
        System.out.println("Nit "+i+" suma="+suma);
    }
}
