package dodatniZad.zad2;

public class Brojac extends Thread {

    private int broj = 0;
    public Brojac(int broj){
        this.broj = broj;
    }

    public void run(){
        if(broj == 0){
            for(int i=0; i<10; i++){
                System.out.println(i);
                try{
                   sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        if(broj == 1){
            for(int i=10; i>0; i--){
                System.out.println(i);
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
