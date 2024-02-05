package predrok1.zad2;

public class Nit extends Thread{
    private final int[][] A;
    private final int redak;

    public Nit(int[][] A, int redak){
        this.A = A;
        this.redak = redak;
    }

    @Override
    public void run(){
        int suma = 0;

        for(int stupac : A[redak]){
            suma = suma + stupac;
        }
        System.out.println("Nit "+redak+" suma="+suma);
    }
}
