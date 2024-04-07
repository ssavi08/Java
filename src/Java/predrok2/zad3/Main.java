package Java.predrok2.zad3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        ArrayList<String> recenice = new ArrayList<>();
        //unos recenica u array sa ulaza
        while(true){
            String recenica = sc.nextLine();
            if(recenica.equals("STOP")){
                break;
            }
            recenice.add(recenica);
        }
        //kreiranje niti
        for(int i=0; i<recenice.size(); i++){
            String recenica = recenice.get(i);
            Nit nit = new Nit("Nit "+i, recenica);
            nit.start();
            nit.join();
        }
    }
}
